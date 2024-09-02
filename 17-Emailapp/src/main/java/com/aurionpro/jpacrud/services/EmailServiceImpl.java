package com.aurionpro.jpacrud.services;

import com.aurionpro.jpacrud.exception.EmailSendingException;
import jakarta.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import java.io.File;

@Service
public class EmailServiceImpl implements EmailService {

    @Autowired
    private JavaMailSender mailSender;

    @Override
    public void sendSimpleEmail(String to, String subject, String body) {
        try {
            SimpleMailMessage message = new SimpleMailMessage();
            message.setTo(to);
            message.setSubject(subject);
            message.setText(body);
            message.setFrom("your-email@gmail.com");

            mailSender.send(message);
        } catch (Exception e) {
            throw new EmailSendingException("Failed to send email", e);
        }
    }

    @Override
    public void sendEmailWithAttachment(String to, String subject, String body, String attachmentPath) {
        try {
            MimeMessage mimeMessage = mailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);

            helper.setTo(to);
            helper.setSubject(subject);
            helper.setText(body);
            helper.setFrom("your-email@gmail.com");

            File attachment = new File(attachmentPath);
            if (attachment.exists()) {
                helper.addAttachment(attachment.getName(), attachment);
            } else {
                throw new EmailSendingException("Attachment file not found at: " + attachmentPath);
            }

            mailSender.send(mimeMessage);
        } catch (Exception e) {
            throw new EmailSendingException("Failed to send email with attachment", e);
        }
    }
}
