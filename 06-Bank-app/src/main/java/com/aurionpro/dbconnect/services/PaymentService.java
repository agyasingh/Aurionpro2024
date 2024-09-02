package com.aurionpro.dbconnect.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.aurionpro.dbconnect.entities.Payment;

@Service
public interface PaymentService {
	List<Payment> getListOfPayments();
	void addPayment(Payment payment);
	void deletePayment(long paymentId);

}
