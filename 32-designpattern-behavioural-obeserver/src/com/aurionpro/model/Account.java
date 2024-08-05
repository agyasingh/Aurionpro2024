package com.aurionpro.model;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private long accountNumber;
    private String name;
    private double balance;
    private List<INotifier> notifiers;

    public Account(long accountNumber, String name, double balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
        this.notifiers = new ArrayList<>();
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
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

    public List<INotifier> getNotifiers() {
        return notifiers;
    }

    public void setNotifiers(List<INotifier> notifiers) {
        this.notifiers = notifiers;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            notifyAllNotifiers(amount, "credited");
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Enter a valid amount to deposit.");
        }
    }

    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            notifyAllNotifiers(amount, "withdrawn");
            System.out.println("Withdrawn: " + amount);
        } else {
            throw new InsufficientBalanceException();
        }
    }

    public void registerNotifier(INotifier notifier) {
        notifiers.add(notifier);
    }

    public void notifyAllNotifiers(double amount, String transactionType) {
        for (INotifier notifier : notifiers) {
            notifier.notify(this, amount, transactionType);
        }
    }

    @Override
    public String toString() {
        return "Account [accountNumber=" + accountNumber + ", name=" + name + ", balance=" + balance + "]";
    }
}
