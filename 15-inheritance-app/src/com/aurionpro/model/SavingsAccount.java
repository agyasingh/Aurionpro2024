package com.aurionpro.model;

public class SavingsAccount extends Account {
    private static final double minimum_balance = 5000;

    public SavingsAccount(int accountNumber, String name, double balance) {
        super(accountNumber, name, balance);
 
    }

    public void credit(double amount) {
    	if(amount>0) {
    		setBalance(getBalance() + amount);
    		System.out.println("new balance after credit is " + getBalance());
    	}
    	else {
    		System.out.println("Enter valid amount to credit.");
    	}
    }

    public void debit(double amount) {
        if (getBalance() - amount >= minimum_balance) {
            setBalance(getBalance() - amount);
        } else {
            System.out.println("Cannot withdraw. Minimum balance must be maintained.");
        }
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Minimum Balance: " + minimum_balance);
    }
}
