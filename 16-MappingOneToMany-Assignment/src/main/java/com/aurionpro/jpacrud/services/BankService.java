package com.aurionpro.jpacrud.services;

import java.util.List;

import com.aurionpro.jpacrud.dto.BankDto;
import com.aurionpro.jpacrud.entities.Bank;
import com.aurionpro.jpacrud.entities.SalaryAccount;

public interface BankService {
	
	Bank addBank(BankDto bankDto);
	void deleteBank(long bankId);
//	Bank updateBank(BankDto bankDto);
	List<Bank> getAllBanks();
	Bank allocateSalaryAccount(long bankId,List<SalaryAccount> salaryAccounts);

}
