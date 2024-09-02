package com.aurionpro.jpacrud.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;


@Entity
@Table(name="user")
public class User {
    
	@Column(name="userid")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long userid;
    
	@Column(name="name")
    @NotBlank(message = "Name is mandatory")
    private String name;
    
	@Column(name="email")
    @NotBlank(message = "Email is mandatory")
    private String email;
    
    // standard constructors / setters / getters / toString
        
}