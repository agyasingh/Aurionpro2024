package com.aurionpro.exception;


//custom exception-create a class as subclass of exception
public class AgeNotValidException extends RuntimeException {
	private int age;
	
	public AgeNotValidException(int age) {
		super();
		this.age = age;
	}

	public String getMessage() {
		return "Age cannot be less than 18:" + age;
	}

}
