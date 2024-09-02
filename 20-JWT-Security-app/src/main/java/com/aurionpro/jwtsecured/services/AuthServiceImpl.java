package com.aurionpro.jwtsecured.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.aurionpro.jwtsecured.dto.LoginDto;
import com.aurionpro.jwtsecured.dto.RegistrationDto;
import com.aurionpro.jwtsecured.entities.Role;
import com.aurionpro.jwtsecured.entities.User;
import com.aurionpro.jwtsecured.exception.UserApiException;
import com.aurionpro.jwtsecured.repo.RoleRepository;
import com.aurionpro.jwtsecured.repo.UserRepository;
import com.aurionpro.jwtsecured.security.JwtTokenProvider;

@Service
public class AuthServiceImpl implements AuthService{
	
	@Autowired
	private AuthenticationManager authenticationManager;
	
	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private RoleRepository roleRepo;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	

	
	@Autowired
	private JwtTokenProvider tokenProvider;

	@Override
	public User register(RegistrationDto regisration) {
		// TODO Auto-generated method stub
		if(userRepo.existsByUsername(regisration.getUsername()))
			throw new UserApiException(HttpStatus.BAD_REQUEST,"user already exists");
		
		User user=new User();
		
		user.setUsername(regisration.getUsername());
		user.setPassword(regisration.getPassword());
		
		List<Role> roles=new ArrayList<Role>();
		Role userRole = roleRepo.findByRolename(regisration.getRole()).get();
		  
		  roles.add(userRole);
		  user.setRoles(roles);
		   
		  return userRepo.save(user);
	}

	@Override
	public String login(LoginDto loginDto) {
		// TODO Auto-generated method stub
		try {
			Authentication authentication= authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(loginDto.getUsername(), loginDto.getPassword()));
			
			SecurityContextHolder.getContext().setAuthentication(authentication);
			
			String token=tokenProvider.generateToken(authentication);
			return token;
		}
		catch(BadCredentialsException e) {
			throw new UserApiException(HttpStatus.NOT_FOUND,"Username or password is incorrect");
		}
	}

}
