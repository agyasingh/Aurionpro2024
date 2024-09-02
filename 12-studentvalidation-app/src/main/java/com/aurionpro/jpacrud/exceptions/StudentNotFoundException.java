package com.aurionpro.jpacrud.exceptions;

public class StudentNotFoundException extends RuntimeException {
	
	public String getMessage() {
		return "student you are searching for is not present";
	}
	

}
