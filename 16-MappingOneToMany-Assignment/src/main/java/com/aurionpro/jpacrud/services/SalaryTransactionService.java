package com.aurionpro.jpacrud.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.aurionpro.jpacrud.dto.SalaryTransactionDto;
import com.aurionpro.jpacrud.entities.SalaryTransaction;

@Service
public interface SalaryTransactionService {
	
	SalaryTransaction addSalaryTransaction(SalaryTransactionDto salaryTransactionDto);
	
    List<SalaryTransaction> getAllSalaryTransactions();

}
