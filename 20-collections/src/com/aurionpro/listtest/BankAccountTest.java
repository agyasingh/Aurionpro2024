package com.aurionpro.listtest;

import java.util.ArrayList;
import java.util.Scanner;

import com.aurionpro.list.model.BankAccount;

public class BankAccountTest {

	static Scanner scanner = new Scanner(System.in);

	private static void accountCreation(ArrayList<BankAccount> bankAccounts) {
		
		boolean response = true;
		
		while (response) {
			
			System.out.println("Welcome to account creation");

			long accountNumber = (long) (Math.random() * Math.pow(10, 10));
			System.out.println("Your randomly generated account number is: " + accountNumber);
			
			System.out.print("Please enter your name: ");
			String name = scanner.next();
			
			System.out.print("Please enter your balance: ");
			double balance = scanner.nextDouble();
			
			bankAccounts.add(new BankAccount(accountNumber, name, balance));
			
			response = userResponse(response);

		}
		displayAllAccounts(bankAccounts);
		
		menu(bankAccounts);
	}

	private static void menu(ArrayList<BankAccount> bankAccounts) {
		System.out.println(
				"Choose what you would like to do: \n1. Display all accounts in descending order of balance."
				+ " \n2. Display account with maximum balance. \n0. Exit");
		int choice = scanner.nextInt();
		
		switch (choice) {
		case 0:
			System.out.println("Thank you for using our services");
			System.exit(0);
			break;
			
		case 1:
			descendingOrderOfAccounts(bankAccounts);
			System.out.println(bankAccounts);
			menu(bankAccounts);
			break;
			
		case 2:
			System.out.println(maximumBalanceAccount(bankAccounts));
			menu(bankAccounts);
			break;
			
		default:
			System.out.println("Please provide a valid input!");
			menu(bankAccounts);
			break;
			
		}
	}

	private static void descendingOrderOfAccounts(ArrayList<BankAccount> bankAccounts) {
		if (bankAccounts.size() == 0)
			return;
		
		for (int i = 0; i < bankAccounts.size(); i++) {
			int minIndex = i;
			
			for (int j = bankAccounts.size() - 1; j > i; j--) {
				
				if (bankAccounts.get(i).getBalance() < bankAccounts.get(j).getBalance()) {
					minIndex = j;
				}
				
				BankAccount temp = bankAccounts.get(minIndex);
				bankAccounts.set(minIndex, bankAccounts.get(i));
				bankAccounts.set(i, temp);
				
			}
		}

	}

	private static BankAccount maximumBalanceAccount(ArrayList<BankAccount> bankAccounts) {
		
		if (bankAccounts.size() == 0)
			return null;
		//storing first object into a maximumBalanceAcccount object of BankAccount type
		BankAccount maximumBalanceAccount = bankAccounts.get(0);
		
		for (BankAccount account : bankAccounts)
			if (maximumBalanceAccount.getBalance() < account.getBalance())
				maximumBalanceAccount = account;
		
		return maximumBalanceAccount;
	}

	private static boolean userResponse(boolean response) {
		System.out.println("Would you like to create another account? If yes press 1 if no press 0");
		int choice = scanner.nextInt();
		
		switch (choice) {
		case 1:
			response = true;
			break;

		case 0:
			response = false;
			break;
			
		default:
			System.out.println("Please provide valid input!");
			userResponse(response);
			break;
			
		}
		
		return response;
	}

	private static void displayAllAccounts(ArrayList<BankAccount> bankAccounts) {
		System.out.println("The all added accounts are as below: ");
		
		for (BankAccount account : bankAccounts)
			System.out.println(account);
	}

	public static void main(String[] args) {

		ArrayList<BankAccount> bankAccounts = new ArrayList<BankAccount>();
		accountCreation(bankAccounts);

	}

}
