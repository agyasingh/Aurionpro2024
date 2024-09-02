package com.aurionpro.dbconnect.repositories;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.aurionpro.dbconnect.entities.Loan;
import com.aurionpro.dbconnect.entities.Payment;


import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
public class LoanRepositoryImpl implements LoanRepository {
    @Autowired
	private EntityManager manager;
	@Override
	public List<Loan> getListOfLoans() {
		// TODO Auto-generated method stub
		TypedQuery<Loan> query=manager.createQuery("select l from Loan l",Loan.class);
		return query.getResultList();
	}

	@Override
	@Transactional
	public void addLoan(Loan loan) {
		// TODO Auto-generated method stub
		manager.merge(loan);
	}

	@Override
	@Transactional
	public void deleteLoan(int loanId) {
		// TODO Auto-generated method stub
		Loan loan=manager.find(Loan.class, loanId);
		
		if(loan!=null) {
			 manager.remove(loan);
		}
	}

	

}
