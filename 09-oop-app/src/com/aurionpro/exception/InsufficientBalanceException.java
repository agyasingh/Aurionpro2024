package com.aurionpro.exception;

public class InsufficientBalanceException extends RuntimeException{
	private int balance;

public InsufficientBalanceException(int balance) {
	super();
	this.balance = balance;
	

}
public String getMessage() {
	return "Your balance is insufficient: " + balance;
}
}
