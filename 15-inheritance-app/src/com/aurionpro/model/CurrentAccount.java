package com.aurionpro.model;

public class CurrentAccount extends Account {
    private static final double OVER_DRAFT_LIMIT = -1000;

    public CurrentAccount(int accountNumber, String name, double balance) {
        super(accountNumber, name, balance);
    }

    @Override
    public void credit(double amount) {
        if (amount > 0) {
            setBalance(getBalance() + amount);
            System.out.println("New balance after credit: " + getBalance());
        } else {
            System.out.println("Please enter a valid amount to credit.");
        }
    }

    @Override
    public void debit(double amount) { //15000-1000=14000
        double availableBalance = getBalance() + OVER_DRAFT_LIMIT;
        
        if (amount > 0) {
            if (availableBalance >= amount) {
                setBalance(getBalance() - amount);
                System.out.println("New balance after debit: " + getBalance());
            } else {
                System.out.println("Exceeds overdraft limit.");
            }
        } else {
            System.out.println("Please enter a valid amount to debit.");
        }
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Overdraft Limit: " + (-OVER_DRAFT_LIMIT)); // Display positive value for clarity
    }
}
