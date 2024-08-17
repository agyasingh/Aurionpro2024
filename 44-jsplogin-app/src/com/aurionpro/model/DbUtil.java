package com.aurionpro.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbUtil {

    private Connection connection = null;
    private Statement statement = null;

    public void connectToDb() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/userdb", "root", "root");
            statement = connection.createStatement();
            System.out.println("Connection and Statement Successfully Created");
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC Driver Not Found");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("SQL Exception: Unable to Connect to Database");
            e.printStackTrace();
        }
    }

    public ResultSet getAllUsers() {
        
        ResultSet dbUsers = null;
        try {
            dbUsers = statement.executeQuery("SELECT * FROM users");
        } catch (SQLException e) {
            System.out.println("SQL Exception: Unable to Execute Query");
            e.printStackTrace();
        }
        return dbUsers;
    }

    public boolean validateCredentials(String username, String password) {
        ResultSet dbUsers = getAllUsers();
        if (dbUsers == null) {
            System.out.println("ResultSet is null. Unable to validate credentials.");
            return false;
        }
        
        try {
            while (dbUsers.next()) {
                if (dbUsers.getString("username").equals(username)) {
                    if (dbUsers.getString("password").equals(password)) {
                        return true;
                    }
                }
            }
        } catch (SQLException e) {
            System.out.println("SQL Exception: Error Processing ResultSet");
            e.printStackTrace();
        } finally {
            try {
                if (dbUsers != null) dbUsers.close();
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                System.out.println("SQL Exception: Error Closing Resources");
                e.printStackTrace();
            }
        }
        return false;
    }
}
