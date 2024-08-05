package com.aurionpro.abstractfactory.model;

import java.util.Scanner;

public class CurrentAccountFactory implements AccountFactory{
Scanner scanner=new Scanner(System.in);

	public IAccount createAccount(long acountnumber, String name, double balance) {
		// TODO Auto-generated method stub	
		return new SavingAccount(acountnumber, name, balance);	
	}

}
