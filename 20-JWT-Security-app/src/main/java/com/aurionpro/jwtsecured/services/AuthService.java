package com.aurionpro.jwtsecured.services;

import com.aurionpro.jwtsecured.dto.LoginDto;
import com.aurionpro.jwtsecured.dto.RegistrationDto;
import com.aurionpro.jwtsecured.entities.*;

public interface AuthService {
	
	User register(RegistrationDto regisration);
	String login(LoginDto loginDto);

}
