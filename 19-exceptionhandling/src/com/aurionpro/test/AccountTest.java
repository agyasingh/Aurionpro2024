//package com.aurionpro.test;
//
//import com.aurionpro.model.Account;
//import com.aurionpro.exception.*;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class AccountTest {
//    private static Scanner scanner = new Scanner(System.in);
//    private static List<Account> accounts=new ArrayList<Account>(); // Declare account at class level
//
//    public static void main(String[] args) {
//        System.out.println("Welcome to your bank account");
//        accountCreation(); // Create account first
//        menuCreation(); // Then show menu
//    }
//
//    private static void accountCreation() {
//    	for(Account account:accounts) {
//        System.out.println("Enter accno");
//        int accountNumber = scanner.nextInt();
//        System.out.println("Enter name");
//        String name = scanner.next();
//        scanner.nextLine();
//        System.out.println("Enter balance");
//        int balance = scanner.nextInt();
//        accounts.add(new Account(accountNumber, name, balance));
//    	}
//    }
//
//    private static void menuCreation() {
//        while (true) {
//            System.out.println("\nMenu:");
//            System.out.println("Enter account number");
//            System.out.println("1. Display Account Details");
//            System.out.println("2. Credit amount to the account");
//            System.out.println("3. Debit amount from the account");
//            System.out.println("4. Exit");
//            System.out.print("Enter your choice: ");
//
//            int choice = scanner.nextInt();
//            if(accountNumberExists()==true)
//
//            switch (choice) {
//                case 1:
//                    account.displayDetails();
//                    break;
//                case 2:
//                    try {
//                        System.out.println("Enter the amount you want to credit");
//                        int creditAmount = scanner.nextInt();
//                        account.credit(creditAmount);
//                    } catch (NegativeAmountException exception) {
//                        System.out.println(exception.getMessage());
//                    }
//                    break;
//                case 3:
//                    try {
//                        System.out.print("Enter amount to withdraw: ");
//                        int debitAmount = scanner.nextInt();
//                        account.withdraw(debitAmount);
//                    } catch (InsufficientBalanceException | NegativeAmountException exception) {
//                        System.out.println(exception.getMessage());
//                    }
//                    break;
//                case 4:
//                    System.out.println("Exiting...");
//                    scanner.close(); 
//                    System.exit(0);
//                default:
//                    System.out.println("Invalid choice. Please try again.");
//            }
//        }
//    }
//
//	private static boolean accountNumberExists(List<Account> accounts,int accountNumber) {
//		// TODO Auto-generated method stub
//		if(accounts.getaccountNumber().contains(accountNumber))
//		return true;
//	}
//}
