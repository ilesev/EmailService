package email.service.service;

import email.service.model.Email;
import org.springframework.mail.javamail.MimeMessagePreparator;

public interface MailService {
    void sendEmail(Email email, MimeMessagePreparator preparator);
}
