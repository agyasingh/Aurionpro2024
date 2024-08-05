package com.aurionpro.test;
import com.aurionpro.model.*;

public class PaymentTest {
public static void main(String[] args) {
	CreditCardPayment creditcardpay=new CreditCardPayment();
	PayPalPayment paypalpay=new PayPalPayment();
	BankTransferPayment banktransferpay=new BankTransferPayment();
	
	Payment payment;
	payment=new CreditCardPayment();
	payment.processPayment();
	payment.refund();
	payment=new PayPalPayment();
	payment.processPayment();
	payment.refund();
	payment=new BankTransferPayment();
	payment.processPayment();
	payment.refund();
}
}
