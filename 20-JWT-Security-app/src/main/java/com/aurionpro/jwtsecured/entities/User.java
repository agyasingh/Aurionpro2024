package com.aurionpro.jwtsecured.entities;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="users")
public class User {
	
	@Column
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;
	
	
	private String username;
	
	private String password;
	
	@ManyToMany
	@JoinTable(joinColumns = @JoinColumn(name="userId"),inverseJoinColumns=@JoinColumn(name="roleId"))
	private List<Role> roles;

}