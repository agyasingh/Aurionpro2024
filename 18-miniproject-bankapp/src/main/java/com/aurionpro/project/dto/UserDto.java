package com.aurionpro.project.dto;

import java.util.List;

import com.aurionpro.project.entities.Role;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
	
	  private String username;
	  private String password;
	  private List<Role> roles;

}
