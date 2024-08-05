package com.aurionpro.model;

import com.aInvaurionpro.exception.InvalidAmountException;
import com.aurionpro.exception.InsufficientBalanceException;

public class BankAccountApp {
 private int accountNumber;
 private String accountType;
 private String name;
 private int balance;

 
 public BankAccountApp(int accountNumber,String accountType,String name,int balance) {
	 
	 this.accountNumber=accountNumber;
	 this.accountType=accountType;
	 this.name=name;
	 this.balance=balance;
 }
 
 
 public void setAccountNumber(int accountNo){
  this.accountNumber= accountNo;
 }
 
 public int getAccountNumber(){
  return this.accountNumber;
 }
 
 public void setAccountType() {
	 this.accountType=accountType;
 }
 
 public String getAccountType() {
	 return this.accountType;
 }
 
 
 public void setName(String accountName) {
  this.name = accountName;
 }
 
 public String getName() {
  return name;
 }

 public void setBalance(int accountBalance) {
  this.balance = accountBalance;
 }
 
 public int getBalance() {
  return this.balance;
 }

 public void accountDetails() {
  System.out.println("The Account Number is : " + " " + getAccountNumber());
  System.out.println("The Account Holder name is : "+ " " + getName());
  System.out.println("The Account Balance is : "+ " " + getBalance());
  System.out.println("The Account Type is " + getAccountType());

 }
 
 public void credit(int creditAmount) {
  if(creditAmount>0) {
   balance += creditAmount;
   System.out.println("Amount credited is : "+creditAmount + " \n Total Balance is :  " +balance);
  }
  else {
            System.out.println("Invalid amount. Please enter a positive value.");
        }
 }
 public void debit(int debitAmount) {
  if(debitAmount > 0) {
   if(balance >= debitAmount) {
    balance -= debitAmount;
    System.out.println("Amount debited is : "+debitAmount + " \nTotal Balance is :  " +balance);
   }
   else {
       throw new InsufficientBalanceException(balance);
   }
    }
  else {
  throw new InvalidAmountException(debitAmount);
       
  }
 }
}