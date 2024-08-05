package com.aurionpro.creational.factory.test;

import com.aurionpro.creational.factory.model.AccountFactory;
import com.aurionpro.creational.factory.model.AccountType;

import com.aurionpro.creational.factory.model.IAccount;


public class IAccountTest {
	public static void main(String[] args) {
		//creating reference for interface.
		IAccount account;
		
		account=AccountFactory.makeAccount(AccountType.SAVINGS);
		account.credit(1300);
		account.debit(1200);
				
	}
}
