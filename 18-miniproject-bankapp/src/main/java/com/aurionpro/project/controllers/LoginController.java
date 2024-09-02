package com.aurionpro.project.controllers;

import com.aurionpro.project.dto.AdminDto;
import com.aurionpro.project.dto.CustomerDto;
import com.aurionpro.project.entities.Admin;
import com.aurionpro.project.exceptions.LoginException;
import com.aurionpro.project.services.AdminService;
import com.aurionpro.project.services.CustomerService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bank")
public class LoginController {
    
    @Autowired
    private AdminService adminService;
    
  

   
  
}
