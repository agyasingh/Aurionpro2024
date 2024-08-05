package com.aurionpro.creational.factory.model;

public class SavingAccount implements IAccount {
	
	private long accountnumber;
	private String name;	
    private double balance;
    

	public SavingAccount(long accountnumber, String name, int balance) {
		super();
		this.accountnumber = accountnumber;
		this.name = name;
		this.balance = balance;
	}

	public long getAccountnumber() {
		return accountnumber;
	}

	public void setAccountnumber(long accountnumber) {
		this.accountnumber = accountnumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

		
	

	@Override
	public void debit(double amount) {
		// TODO Auto-generated method stub
		double minimum_balance=1000;
		if(amount>0 && amount<=minimum_balance) {
			System.out.println("Please enter a valid amount");
		}
	    balance+=amount;
		
	}

	@Override
	public void credit(double amount) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				if(amount>0) {
					balance+=amount;
					System.out.println("Your current balance is: " + balance);
				}
				else {
					System.out.println("Please enter valid amount");
				}
					
					
					
	}

}
