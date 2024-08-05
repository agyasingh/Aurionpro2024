package com.aurionpro.model;


public class Account {
    private int accountNumber;
    private String name;
    private double balance;

    public Account(int accountNumber, String name, double balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
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




	public double getBalance() {
		return balance;
	}




	public void setBalance(double balance) {
		this.balance = balance;
	}




	public void display() {
        System.out.println("Account no: " + accountNumber);
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
    }


	public void credit(double amount) {
		if(amount>0) {
			setBalance(getBalance() + amount);
			System.out.println("Balance is " + getBalance());
		}
		else {
			System.out.println("Enter valid amount to credit.");
		}
		
	}


	public void debit(double amount) {
		if(amount>0) {
			if(amount>=balance) {
				setBalance(getBalance()-amount);
				System.out.println();
			}
			else {
				System.out.println("Please enter amount greater than your balance.");
			}
		}
			else {
				System.out.println("Enter valid debit amount and it should be greater than 0.");
			}
		}
		
}