package com.aurionpro.project.services;

import com.aurionpro.project.dto.AdminDto;
import com.aurionpro.project.entities.Admin;
import com.aurionpro.project.entities.User;
import com.aurionpro.project.exceptions.LoginException;
import com.aurionpro.project.exceptions.ValidationException;
import com.aurionpro.project.repositories.AdminRepository;
import com.aurionpro.project.repositories.UserRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class AdminServiceImpl implements AdminService{

    @Autowired
    private AdminRepository adminRepository;
    
    @Autowired
    private UserRepository userRepository;
   

    
 

    private static final Logger logger = LoggerFactory.getLogger(AdminServiceImpl.class);


    @Override
    public String updateEmailById(int adminId, String email) {
        //logger.info("Updating email for admin with ID: {}", adminId);

        Admin admin = adminRepository.findById(adminId)
            .orElseThrow(() -> {
              //  logger.error("Admin with ID {} not found", adminId);
                return new ValidationException("Admin not found");
            });

       // String oldEmail = admin.getEmail();
        admin.setEmail(email);
        adminRepository.save(admin);

       // logger.info("Email updated from {} to {} for admin with ID: {}", oldEmail, newEmail, adminId);
        return "Email updated successfully";
    }


    
   
}
