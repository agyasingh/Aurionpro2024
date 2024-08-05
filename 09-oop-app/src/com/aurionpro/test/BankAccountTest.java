package com.aurionpro.test;

import java.util.Random;
import java.util.Scanner;

import com.aurionpro.model.BankAccount;

public class BankAccountTest {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  
  BankAccount user1 = new BankAccount();
  
  Random random = new Random();
  int accountNo = random.nextInt(1000000000);
  user1.setAccountNumber(accountNo);
  user1.getAccountNumber();
  
  System.out.println("Enter the Name : ");
  String accountName = sc.nextLine();
  user1.setName(accountName);
  user1.getName();
  
  System.out.println("Enter the balance : ");
  int accountBalance = sc.nextInt();
  user1.setBalance(accountBalance);
  user1.getBalance();
  
  while(true) {
   System.out.println("\n Choose the option");
   System.out.println("1.Credit Amount");
   System.out.println("2.Debit Amount");
   System.out.println("3.Show Details");
   System.out.println("4.Exit");
   int choice = sc.nextInt();
   switch(choice) {
   case 1:
    System.out.println("Enter the amount to be credited: ");
    int creditAmount = sc.nextInt();
    user1.credit(creditAmount);
    break;
   case 2:
    System.out.println("Enter the amount to be debited: ");
    int debitAmount = sc.nextInt();
    user1.debit(debitAmount);
    break;
   case 3:
    user1.accountDetails();
    break;
   case 4:
    System.out.println("Thanks for using our application.");
    sc.close();
    return;
   default:
    System.out.println("Invalid Choice");
   }
   
  }
  
  
  
  
 }
 
 
 

}