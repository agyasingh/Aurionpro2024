package com.aurionpro.model;

public class PayPalPayment extends Payment{
	@Override
	public void processPayment() {
		// TODO Auto-generated method stub
		System.out.println("Inside PayPal payment processing payment");
	}

	@Override
	public void refund() {
		// TODO Auto-generated method stub
		System.out.println("Inside Paypal payment processing refund");
	}

}
