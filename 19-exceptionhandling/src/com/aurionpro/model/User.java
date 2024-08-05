package com.aurionpro.model;

import com.aurionpro.exception.EmailNotValidException;
import com.aurionpro.exception.PasswordNotValidException;

public class User {
	
private String email;
private String password;

public User(String email, String password) {
	
	super();
	this.email=email;
	this.password=password;
}

public static void validatePassword(String password) {
	
	if(password==null || password.isEmpty()) {
		throw new PasswordNotValidException("Password input is empty.Please enter a password");
	}
	if(!(password.length()>=8)) {
		throw new PasswordNotValidException("Password length should be greater than or equal to 8 charcaters");
	}
	if( !password.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,}$")) {
		throw new PasswordNotValidException("Password should have one uppercase character, one lowercase character and one special character.");
	}
	
}

public static void validateEmail(String email) {
	
	if(email==null || email.isEmpty()) {
    	throw new EmailNotValidException("Email is not entered.");
    }
	if(!email.matches(".+@.+\\..+")) {
		throw new EmailNotValidException("Email is in invalid format.");
	}

}



@Override
public String toString() {
	return "User [email=" + email + ", password=" + password + "]";
}

}
