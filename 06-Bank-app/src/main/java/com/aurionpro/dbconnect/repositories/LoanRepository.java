package com.aurionpro.dbconnect.repositories;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.aurionpro.dbconnect.entities.Loan;

@Repository
public interface LoanRepository {
	
	List<Loan> getListOfLoans();
	void addLoan(Loan loan);
	void deleteLoan(int loanId);
   
}
