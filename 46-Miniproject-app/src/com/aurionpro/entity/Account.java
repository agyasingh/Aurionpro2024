package com.aurionpro.entity;



public class Account {
    private int accountId;
    private int customerId; // customer_id
    private String accountNumber; // account_number
    private String accountType; // account_type
    private double balance; // balance
    private String email;
   

    // Default constructor
    public Account() {
    }

    // Parameterized constructor
    public Account(int customerId, String accountNumber, String accountType, double balance,String email ) {
      
        this.customerId = customerId;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
        this.email=email;
        
    }

    // Getters and Setters
    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    public void setEmail(String email) {
    	this.email=email;
    }

	public String getEmail() {
		// TODO Auto-generated method stub
		return email;
	}

   
}
