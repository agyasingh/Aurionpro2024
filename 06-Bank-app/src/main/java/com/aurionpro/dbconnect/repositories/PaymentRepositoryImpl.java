package com.aurionpro.dbconnect.repositories;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.aurionpro.dbconnect.entities.Payment;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
public class PaymentRepositoryImpl implements PaymentRepository {
	
	@Autowired
	private EntityManager manager;

	@Override
	public List<Payment> getListOfPayments() {
		// TODO Auto-generated method stub
		TypedQuery<Payment> query=manager.createQuery("select p from Payment p",Payment.class);
		return query.getResultList();
	}

	@Override
	@Transactional
	public void addPayment(Payment payment) {
		// TODO Auto-generated method stub
		manager.merge(payment);
	}

	@Override
	@Transactional
	public void deletePayment(long paymentId) {
		// TODO Auto-generated method stub
		Payment payment=manager.find(Payment.class, paymentId);
		if(payment!=null) {
		manager.remove(payment);
		}
	}

}
