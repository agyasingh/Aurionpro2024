package com.aurionpro.abstractfactory.model;

public interface AccountFactory {

	
	IAccount createAccount(long acountnumber, String name, double balance);
}
