package email.service;

import email.service.constants.Constants;
import email.service.model.Email;
import email.service.service.MailService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.mail.javamail.MimeMessagePreparator;

import javax.mail.Message;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Random;

public class Main extends Constants {
    private static final Random random = new Random();

    public static void main(String[] args) {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        MailService mailService = (MailService) context.getBean("mailService");
        while(true) {
            Email email = getEmail();
            mailService.sendEmail(email, getPreparator(MY_MAIL, email.getToEmail(), email.getContent(), email.getSubject()));
            try {
                int sleepTime = 3*HOUR_IN_MS + random.nextInt(HOUR_IN_MS);
                System.out.println("Sleeping for " + (sleepTime / HOUR_IN_MS) + "h " + (sleepTime % 60) + "m");
                Thread.sleep(sleepTime);
            } catch (InterruptedException e) {
                //ignore
            }
        }
    }

    public static MimeMessagePreparator getPreparator(final String from, final String to, final String content, final String subject) {
        MimeMessagePreparator message = new MimeMessagePreparator() {
            public void prepare(MimeMessage mimeMessage) throws Exception {
                mimeMessage.setFrom(from);
                mimeMessage.setRecipient(Message.RecipientType.TO, new InternetAddress(to));
                mimeMessage.setText(content);
                mimeMessage.setSubject(subject);
            }
        };

        return message;
    }

    public static Email getEmail() {
        Email email = new Email();
        email.setContent(getContents().get(random.nextInt(getContents().size())));
        email.setSubject(getSubjects().get(random.nextInt(getSubjects().size())));
        email.setToEmail("dbirov@gmail.com");
        return email;
    }
}
