package com.aurionpro.model;

public class CreditCardPayment extends Payment {

	@Override
	public void processPayment() {
		// TODO Auto-generated method stub
		System.out.println("Inside credit card payment processing payment");
	}

	@Override
	public void refund() {
		// TODO Autso-generated method stub
		System.out.println("Inside credit card payment processing refund");
	}

}
