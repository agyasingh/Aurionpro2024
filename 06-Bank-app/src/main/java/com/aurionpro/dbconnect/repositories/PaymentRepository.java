package com.aurionpro.dbconnect.repositories;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.aurionpro.dbconnect.entities.Payment;
@Repository
public interface PaymentRepository {

	List<Payment> getListOfPayments();
	void addPayment(Payment payment);
	void deletePayment(long paymentId);


}
