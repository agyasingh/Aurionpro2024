package com.aurionpro.model;

public class BankAccount {
 private int accountNumber;
 private String name;
 private int balance;
 
 public BankAccount() {
	 
 }
 public void setAccountNumber(int accountNo){
  this.accountNumber= accountNo;
 }
 public int getAccountNumber(){
  return this.accountNumber;
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
  System.out.println("The Account Number is : " + " " + accountNumber);
  System.out.println("The Account Holder name is : "+ " " + name);
  System.out.println("The Account Balance is : "+ " " + balance);

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
    System.out.println("Insufficient Balance.");
   }
  }else {
            System.out.println("Invalid amount. Please enter a positive value.");
  }
  
 }
}