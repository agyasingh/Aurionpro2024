package com.aurionpro.dbconnect.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aurionpro.dbconnect.entities.Loan;
import com.aurionpro.dbconnect.repositories.LoanRepository;

@Service
public class LoanServiceImpl implements LoanService{
	@Autowired
	private LoanRepository loanRepository;

	@Override
	public List<Loan> getListOfLoans() {
		// TODO Auto-generated method stub
		return loanRepository.getListOfLoans();
	}

	@Override
	public void addLoan(Loan loan) {
		// TODO Auto-generated method stub
		loanRepository.addLoan(loan);
	}

	@Override
	public void deleteLoan(int loanId) {
		loanRepository.deleteLoan(loanId);
	}

}
