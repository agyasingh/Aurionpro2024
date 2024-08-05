package com.aurionpro.abstractfactory.model;

import java.util.Scanner;

public class SavingAccountFactory implements AccountFactory {
    Scanner scanner=new Scanner(System.in);
    private long acountnumber;
    private String name;
    private double balance;
    
    
	public SavingAccountFactory(Scanner scanner, long acountnumber, String name, double balance) {
		super();
		this.scanner = scanner;
		this.acountnumber = acountnumber;
		this.name = name;
		this.balance = balance;
	}


	public IAccount createAccount(long acountnumber, String name, double balance) {
		// TODO Auto-generated method stub
			
		return new SavingAccount(acountnumber, name, balance);		
	}
	
}
