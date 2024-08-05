package com.aurionpro.exception;

public class NegativeAmountException extends RuntimeException {
	private int amount;

	public NegativeAmountException(int amount) {
		super();
		this.amount = amount;
	};
	
	public String getMessage() {
		return "Please enter a positive amount. You have entered a negative amount: " + amount;
	}

}
