package com.aurionpro.model;

public class Account {
	private int accountNumber;
	private String name;
	private int balance;
	
	
	public Account(int accountNumber, String name, int balance) {
		// TODO Auto-generated constructor stub
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
	}
	

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", name=" + name + ", balance=" + balance + "]";
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
	
	

}
