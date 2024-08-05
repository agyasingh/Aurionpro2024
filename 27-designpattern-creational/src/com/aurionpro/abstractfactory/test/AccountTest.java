package com.aurionpro.abstractfactory.test;

import java.util.Scanner;

import com.aurionpro.abstractfactory.model.IAccount;
import com.aurionpro.abstractfactory.model.SavingAccountFactory;
import com.aurionpro.creational.factory.model.AccountFactory;


public class AccountTest {
	private static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter name");
		String name1 =scanner.next();
		System.out.println("Enter accountnumber");
		long accountnumber=scanner.nextLong();
		System.out.println("Enter balance");
		double balance1=scanner.nextDouble();
	    SavingAccountFactory savingAccountFactory = new SavingAccountFactory(scanner, accountnumber, name1, balance1);
		 
	     IAccount savingAccount = savingAccountFactory.createAccount(accountnumber, name1, balance1);

	     savingAccount.credit(1000);
	     savingAccount.debit(1000);
	}
}
