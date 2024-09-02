package com.aurionpro.jpacrud.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public interface EmailService {

    public void sendSimpleEmail(String to, String subject, String body) ;
    
    public void sendEmailWithAttachment(String to, String subject, String body, String attachmentPath);
}
