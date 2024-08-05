package com.aInvaurionpro.exception;

public class InvalidAmountException extends RuntimeException {
	private int debitAmount;

	public InvalidAmountException(int debitAmount) {
		super();
		this.debitAmount = debitAmount;
	}
	
	public String getMessage() {
		return "You have entered an invalid amount. Please enter a valid amount. The amount entered by you is : " + debitAmount;
	}
	

}
