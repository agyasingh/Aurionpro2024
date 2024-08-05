package com.aurionpro.exception;

public class EmailNotValidException extends RuntimeException{
private String email;
private String message;

public EmailNotValidException(String message) {
    super(message); 
    this.message = message; 
}

@Override
public String getMessage() {
    return message; 
}


//public String getMessage() {
//	return "Your email is invalid.Please enter a valid email. ";
//}
}