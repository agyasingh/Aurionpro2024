package com.aurionpro.model;

public class InsufficientBalanceException extends Exception {
	
	public String getMessage(){
		
		return "Your balance is insufficient";
	}

}
