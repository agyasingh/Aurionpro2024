package com.aurionpro.exception;

public class PasswordNotValidException extends RuntimeException{
	
private String password;
private String message;

public PasswordNotValidException(String message) {
	super();
	this.message = message;
}


@Override
public String getMessage() {
    return message; 
}
}

//public String getSpecialCharacterMessage(String specialCharacterException) {
//	return "Please enter a special character in your password.";
//}
//
//public String getUpperCaseMessage(String upperCaseException) {
//	return "Please enter a special character in your password.";
//}
//
//public String getLowerCaseMessage(String lowerCaseException) {
//	return "Please enter a lower case character in your password";
//}


