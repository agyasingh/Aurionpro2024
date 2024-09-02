package com.aurionpro.project.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aurionpro.project.dto.UserDto;
import com.aurionpro.project.entities.Admin;
import com.aurionpro.project.entities.Customer;
import com.aurionpro.project.entities.User;
import com.aurionpro.project.repositories.AdminRepository;
import com.aurionpro.project.repositories.CustomerRepository;
import com.aurionpro.project.repositories.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	 @Autowired
	    private UserRepository userRepository;
	 
	 @Autowired
	 private CustomerRepository customerRepository;
	 
	 @Autowired
	 private AdminRepository adminRepository;

	 @Override
	 public UserDto addUser(UserDto userDto) {
	     // Convert UserDto to User
	     User user = toUser(userDto);

	     // Save the user first
	     User savedUser = userRepository.save(user);

	     // Handle role assignment
	     if (savedUser.getRoles().stream().anyMatch(role -> role.getRolename().equals("ROLE_ADMIN"))) {
	         Admin admin = new Admin();
	         admin.setUser(savedUser);
	         admin.setEmail("email");
	         adminRepository.save(admin);
	     } else if (savedUser.getRoles().stream().anyMatch(role -> role.getRolename().equals("ROLE_CUSTOMER"))) {
	         Customer customer = new Customer();
	         customer.setUser(savedUser);
	         customer.setEmail("email");
	         customer.setFirstName("firstname");
	         customer.setLastName("lastname");
	         customer.setPhone("phone");
	         customerRepository.save(customer);
	     }

	     // Convert saved User to UserDto
	     UserDto savedUserDto = toUserDto(savedUser);
	     return savedUserDto;
	 }

	 private User toUser(UserDto userDto) {
	     User user = new User();
	     user.setUsername(userDto.getUsername());
	     user.setPassword(userDto.getPassword());
	     user.setRoles(userDto.getRoles());
	     // Add other fields as needed
	     return user;
	 }

	 private UserDto toUserDto(User user) {
	     UserDto userDto = new UserDto();
	     userDto.setUsername(user.getUsername());
	     userDto.setPassword(user.getPassword());
	     userDto.setRoles(user.getRoles());
	     // Add other fields as needed
	     return userDto;
	 }

}