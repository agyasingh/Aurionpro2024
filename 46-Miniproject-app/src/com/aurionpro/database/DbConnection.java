package com.aurionpro.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.regex.Pattern;

public class DbConnection {
    
    private Connection connection = null;

    public Connection connectToBankDb() {
        // Register driver
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Create Connection
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/bank", "root", "root");
            System.out.println("Connection Successful");
            
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
    
    public boolean validateCredentials(String username, String password, String email, String role) {
        String sql = "SELECT * FROM users WHERE username = ? AND password = ? AND email = ? AND role = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            preparedStatement.setString(3, role);
            preparedStatement.setString(4, email);
            
            
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                return resultSet.next(); // If a record is found, return true
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    
   
}
