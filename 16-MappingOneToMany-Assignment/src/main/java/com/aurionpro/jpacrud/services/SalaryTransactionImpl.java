package com.aurionpro.jpacrud.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aurionpro.jpacrud.dto.SalaryTransactionDto;
import com.aurionpro.jpacrud.entities.SalaryTransaction;
import com.aurionpro.jpacrud.repositories.SalaryTransactionRepository;

@Service
public class SalaryTransactionImpl implements SalaryTransactionService {
	
	@Autowired
	private SalaryTransactionRepository salaryTransactionrepo;

	@Override
	public SalaryTransaction addSalaryTransaction(SalaryTransactionDto salaryTransactionDto) {
		// TODO Auto-generated method stub
		SalaryTransaction salaryTransaction=new SalaryTransaction();
		
		salaryTransaction.setTransactionDate(salaryTransactionDto.getTransactionDate());
		salaryTransaction.setAmount(salaryTransactionDto.getAmount());
		salaryTransaction.setTransactionStatus(salaryTransactionDto.getTransactionStatus());
		return salaryTransactionrepo.save(salaryTransaction);
	}

	@Override
	public List<SalaryTransaction> getAllSalaryTransactions() {
		// TODO Auto-generated method stub
		return salaryTransactionrepo.findAll();
	}

}
