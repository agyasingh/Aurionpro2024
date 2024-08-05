package com.aurionpro.model;

import com.aurionpro.exception.InsufficientBalanceException;
import com.aurionpro.exception.NegativeAmountException;

public class Account {
    private int accountNumber;
    private String name;
    private int balance;

    public Account(int accountNumber, String name, int balance) {
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

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void credit(int creditamount) {
        if (creditamount > 0) {
            balance += creditamount;
            System.out.println("Amount credited is : " + creditamount + "\nTotal Balance is : " + balance);
        } else {
            throw new NegativeAmountException(creditamount);
        }
    }

    public void withdraw(int debitamount) {
        if (debitamount < 0) {
            throw new NegativeAmountException(debitamount);
        }
        if (debitamount > balance) {
            throw new InsufficientBalanceException(debitamount);
        } else {
            balance -= debitamount;
            System.out.println("Amount debited is : " + debitamount + "\nTotal Balance is : " + balance);
        }
    }

    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + name);
        System.out.println("Account Balance: " + balance);
    }
}
