package com.aurionpro.project.dto;


import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;

@Data
//@NoArgsConstructor
//@AllArgsConstructor
public class AdminDto {
	

//    @NotBlank(message = "Username is mandatory")
//    @Size(min = 3, max = 20, message = "Username must be between 3 and 20 characters")
//    @Pattern(regexp = "^[a-zA-Z0-9_]+$", message = "Username can only contain letters, numbers, and underscores")
//   
//    private String username;
//
//    @NotBlank(message = "Password is mandatory")
//    @Size(min = 8, message = "Password must be at least 8 characters long")
//  
//    private String password;

// @NotBlank(message = "Email is mandatory")
//    @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]+@[A-Za-z\\d.-]+\\.[A-Za-z]{2,}$", message = "Email should be valid and contain at least one uppercase letter, one lowercase letter, one digit, and one special character")
//    private String email;



}
