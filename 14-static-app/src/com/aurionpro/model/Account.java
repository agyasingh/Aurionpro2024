package com.aurionpro.model;

import java.util.Scanner;

public class Account {
	int accountArray[]=new int[100];
	private static int count=0;
	private static Scanner scanner=new Scanner(System.in);

	public static void main(String[] args) {
		Account account=new Account();
		
		account.createAccount();
		account.accountCount();
	}
	private void accountCount() {
		for(int count:accountArray) {
			System.out.println(count);
		}
		
	}
	public void createAccount() {
		for(int accounts:accountArray) {
			accountArray[accounts]=scanner.nextInt();
		}
	}
}
