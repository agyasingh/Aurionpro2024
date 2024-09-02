package com.aurionpro.jpacrud.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aurionpro.jpacrud.dto.SalaryAccountDto;
import com.aurionpro.jpacrud.entities.SalaryAccount;
import com.aurionpro.jpacrud.entities.SalaryTransaction;
import com.aurionpro.jpacrud.repositories.SalaryAccountRepository;

@Service
public class SalaryAccountImpl implements SalaryAccountService {
	
	@Autowired
	private SalaryAccountRepository salaryaccountrepo;

	@Override
	public SalaryAccount addsalaryAccount(SalaryAccountDto salaryAccountDto) {
		// TODO Auto-generated method stub
		SalaryAccount salaryaccount=new SalaryAccount();
		salaryaccount.setAccountNumber(salaryAccountDto.getAccountNumber());
		salaryaccount.setAccountHolderName(salaryAccountDto.getAccountHolderName());
		return salaryaccountrepo.save(salaryaccount);
	}

	@Override
	public List<SalaryAccount> getAllSalaryAccounts() {
		// TODO Auto-generated method stub
		return salaryaccountrepo.findAll();
	}

	@Override
	public SalaryAccount allocateSalaryTransaction(long acountNumber, List<SalaryTransaction> salaryTransactions) {
		// TODO Auto-generated method stub
		return null;
	}

}
