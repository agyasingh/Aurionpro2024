package com.aurionpro.project.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.aurionpro.project.dto.UserDto;
import com.aurionpro.project.entities.User;

@Service
public interface UserService {
	
	

	UserDto addUser(UserDto userDto);
	
	//PageResponse<User> getAllUsers();

}
