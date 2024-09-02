package com.aurionpro.project.services;

import java.util.List;

import com.aurionpro.project.dto.AccountDto;
import com.aurionpro.project.entities.Account;

public interface AccountService {

	List<Account> getAllAccounts();
	
	Account addAccount(int customerId, Account account);
	

	Account getAccountById(int accountId);
	
	 void deleteAccountById(int accountId);
	

}
