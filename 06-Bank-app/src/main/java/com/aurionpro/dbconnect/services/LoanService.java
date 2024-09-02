package com.aurionpro.dbconnect.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.aurionpro.dbconnect.entities.Loan;
@Service
public interface LoanService {

	List<Loan> getListOfLoans();
	void addLoan(Loan loan);
	void deleteLoan(int loanId);

}