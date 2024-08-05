package com.aurionpro.abstractfactory.model;

public class CurrentAccount implements IAccount{

	private long accountnumber;
	private String name;	
    private double balance;
    

	public CurrentAccount(long accountnumber, String name, int balance) {
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
		double overdraft_limit=1000;
		double available_balance=overdraft_limit + amount;
		if(amount>0 && amount<=available_balance) {
			System.out.println("Please enter a valid amount");
		}
	    balance-=amount;
	}

	@Override
	public void credit(double amount) {
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
