package com.aurionpro.singleton.test;

public class Database {
    private static Database database;
	private Database(){
		
	}
	public void create() {
		System.out.println("Database is created");
	}
	
	public static Database getDatabase() {
		if(database==null)
		   database=new Database();
		return database;
	
	}
	
	public void status() {
		System.out.println("Database created");
	}
	
	
}
