package com.aurionpro.model;

public class BankTransferPayment extends Payment {
	@Override
	public void processPayment() {
		// TODO Auto-generated method stub
		System.out.println("Inside Bank Transfer payment processing payment");
	}

	@Override
	public void refund() {
		// TODO Auto-generated method stub
		System.out.println("Inside Bank Transfer payment processing refund");
	}

}
