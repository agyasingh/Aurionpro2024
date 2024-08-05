package com.aurionpro.test;

import java.util.Scanner;
import com.aurionpro.exception.EmailNotValidException;
import com.aurionpro.exception.PasswordNotValidException;
import com.aurionpro.model.User;

public class UserTest {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.println("Welcome to the application");
            System.out.println("Please login to your account");
            
            String email;
            System.out.println("Enter your email Id:");
            email = scanner.nextLine().trim();
            try {
                User.validateEmail(email);  
            } catch (EmailNotValidException exception) {
                System.out.println(exception.getMessage());
                return;
            }
           
            String password;
            System.out.println("Enter your password:");
            password = scanner.nextLine().trim();
            try {
                User.validatePassword(password);  
            } catch (PasswordNotValidException e) {
                System.out.println(e.getMessage());
            }

           
            User user1 = new User(email, password);
            System.out.println("Welcome to the home page");

        }  finally {
            scanner.close(); 
        }
    }  
}
