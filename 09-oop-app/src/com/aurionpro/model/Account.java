package com.aurionpro.model;

public class Account {
	public int accountNumber;
	public String name;
	public int balance;
	public AccountType accountType;
	
	public Account(int accountNumber, String name, int balance,AccountType accountType) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
		this.accountType=accountType;
	}
	
	
	

	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public AccountType getAccountType() {
	        return accountType;
	    }

	public void setAccountType(AccountType accountType) {
	        this.accountType = accountType;
	    }
	
	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", name=" + name + ", balance=" + balance + ", accountType="
				+ accountType + "]";
	}

	
 
}
