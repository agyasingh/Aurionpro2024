package com.aurionpro.jwtsecured.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegistrationDto {
//register user
//login user
	private String username;
	
	private String password;
	
	private String role;
}
