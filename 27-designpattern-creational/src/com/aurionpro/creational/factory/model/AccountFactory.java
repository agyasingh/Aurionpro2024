package com.aurionpro.creational.factory.model;

public class AccountFactory {

	
	public static IAccount makeAccount(AccountType accountName) {
		IAccount account=null;  //we comparing objects that is why we are making it null
		
		
//		package com.aurionpro.creational.factory.model;
//		public class AccountFactory { public static IAccount accountFactory(long accountNumber, String name, double balance, AccountType accountType) {
//		  switch(accountType)  {
//		  case SAVINGS_ACCOUNT:   return new SavingsAccount(accountNumber, name, balance, balance);
//		  case CURRENT_ACCOUNT:   return new CurrentAccount(accountNumber, name, balance);
//		    }
//		  return null; }
//		}
		
		if(accountName==AccountType.SAVINGS)
		    account=new SavingAccount(1200, "aagya", 1200);
		if(accountName==AccountType.CURRENT)
		    account=new CurrentAccount(1300, "sampada", 1400);
		
		
		return account;
	}
}
