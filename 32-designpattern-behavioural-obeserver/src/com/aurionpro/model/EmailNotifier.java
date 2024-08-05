package com.aurionpro.model;

public class EmailNotifier implements INotifier {
    @Override
    public void notify(Account account, double amount, String transactionType) {
        System.out.println("Email: An amount of " + amount + " has been " + transactionType + ". Current balance: " + account.getBalance());
    }
}
