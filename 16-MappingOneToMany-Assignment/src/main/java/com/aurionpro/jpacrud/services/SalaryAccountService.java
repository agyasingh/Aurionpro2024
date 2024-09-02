package com.aurionpro.jpacrud.services;

import java.util.List;

import com.aurionpro.jpacrud.dto.SalaryAccountDto;
import com.aurionpro.jpacrud.entities.SalaryAccount;
import com.aurionpro.jpacrud.entities.SalaryTransaction;

public interface SalaryAccountService {
	
	SalaryAccount addsalaryAccount(SalaryAccountDto salaryAccountDto);
	List<SalaryAccount> getAllSalaryAccounts();
	SalaryAccount allocateSalaryTransaction(long acountNumber,List<SalaryTransaction> salaryTransactions);

}
