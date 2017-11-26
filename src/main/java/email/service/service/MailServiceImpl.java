package email.service.service;

import email.service.model.Email;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service("mailService")
public class MailServiceImpl implements MailService{

    @Autowired
    private JavaMailSender mailSender;

    public void sendEmail(Email email, MimeMessagePreparator preparator) {
        try {
            mailSender.send(preparator);
            System.out.println("PRATIHME GO V " + new Date().toString());
        } catch (MailException e) {
            // ignore
        }
    }
}
