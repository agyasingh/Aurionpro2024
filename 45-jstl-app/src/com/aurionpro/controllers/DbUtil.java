package com.aurionpro.controllers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbUtil {
	
	private Connection connection = null;
    private Statement statement = null;
    private static DbUtil dbUtil = null;
    
    // Private constructor for Singleton
    private DbUtil() {
    	this.dbUtil=dbUtil;
    	// Initialize the database connection and statement here
    	connectToDb();
    	
    }
    
    // Public method to get the single instance of DbUtil
    public static DbUtil getDbUtil() {
    	if(dbUtil == null) {
    		dbUtil = new DbUtil();
    	}
    	return dbUtil;
    }
    
    // Method to connect to the database
    public void connectToDb() {
    	try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/userdb","root","root");
			statement = connection.createStatement();
			System.out.println("Connection Successful");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
    }
    
    // Method to get all users from the database
    public ResultSet getAllUsers() {
    	ResultSet dbUsers = null;
    	try {
    		dbUsers = statement.executeQuery("SELECT * FROM users");
    	} catch (SQLException e) {
    		e.printStackTrace();
    	}
    	return dbUsers;
    }
    
    // Method to validate user credentials
    public boolean validateCredentials(String username, String password) {
    	ResultSet dbUsers = getAllUsers();
    	try {
	    	while(dbUsers != null && dbUsers.next()) {
	    		if(dbUsers.getString("username").equals(username)) {
	    			if(dbUsers.getString("password").equals(password)) {
	    				return true;
	    			}
	    		}
	    	}
    	} catch (SQLException e) {
    		e.printStackTrace();
    	}
    	return false;
    }
}
