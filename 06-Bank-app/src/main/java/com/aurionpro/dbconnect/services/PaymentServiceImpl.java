package com.aurionpro.dbconnect.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aurionpro.dbconnect.entities.Payment;
import com.aurionpro.dbconnect.repositories.PaymentRepository;

@Service
public class PaymentServiceImpl implements PaymentService{
	
	@Autowired
	private PaymentRepository paymentRepository;

	@Override
	public List<Payment> getListOfPayments() {
		// TODO Auto-generated method stub
		return paymentRepository.getListOfPayments();
	}

	@Override
	public void addPayment(Payment payment) {
		// TODO Auto-generated method stub
		paymentRepository.addPayment(payment);
	}

	@Override
	public void deletePayment(long paymentId) {
		// TODO Auto-generated method stub
		paymentRepository.deletePayment(paymentId);
	}

}
