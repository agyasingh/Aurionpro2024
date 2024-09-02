package com.aurionpro.jpacrud.controller;

import com.aurionpro.jpacrud.dto.EmailRequest;
import com.aurionpro.jpacrud.services.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/email")
public class EmailController {

    @Autowired
    private EmailService emailService;

    @PostMapping("/send")
    public String sendSimpleEmail(@RequestBody EmailRequest request) {
        emailService.sendSimpleEmail(request.getTo(), request.getSubject(), request.getBody());
        return "Email sent successfully";
    }

    @PostMapping("/sendwithattachment")
    public String sendEmailWithAttachment(@RequestBody EmailRequest request) {
        // Ensure the attachment path is provided
        if (request.getAttachmentPath() != null && !request.getAttachmentPath().isEmpty()) {
            emailService.sendEmailWithAttachment(request.getTo(), request.getSubject(), request.getBody(), request.getAttachmentPath());
            return "Email with attachment sent successfully";
        } else {
            return "Attachment path is missing";
        }
    }
}
