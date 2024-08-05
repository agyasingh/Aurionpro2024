package com.aurionpro.model;

public class SMSNotifier implements INotifier {
    private Account account;

   
    public void notify(Account account,double amount,String transactionType) {
        System.out.println("SMS: An amount of " + amount + transactionType +  account);
    }
}
