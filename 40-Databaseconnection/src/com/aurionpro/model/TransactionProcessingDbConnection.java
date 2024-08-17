package com.aurionpro.model;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class TransactionProcessingDbConnection {
    
    private Connection connection = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;

    public void connectToDb() {
        try {
            // Register driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Create connection
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/organization", "root", "root");
            // Disable auto-commit mode
            connection.setAutoCommit(false);
            
            System.out.println("Connection successful");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public void getDepartmentDetails() {
        try {
            // Create statement
            statement = connection.createStatement();
            
            // Execute query
            ResultSet dbDepartmentData = statement.executeQuery("SELECT * FROM department");
            
            // Print columns
            while (dbDepartmentData.next()) {
                System.out.println("  \t" + dbDepartmentData.getInt("Dno") + "  \t" + dbDepartmentData.getString("Dname") + "  \t" + dbDepartmentData.getString("DLocation"));
            }
            
            System.out.println("Records fetched successfully");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void addDepartment() throws IOException {
        Scanner scanner = new Scanner(System.in);
        BufferedReader bufferreader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter department details");
        
        System.out.println("Enter D no");
        int Dno = scanner.nextInt();
        
        System.out.println("Enter Dname");
        String Dname = scanner.next();
        
        System.out.println("Enter Dlocation");
        String Dlocation = bufferreader.readLine();
        
        try {
            // Prepare SQL statement
            preparedStatement = connection.prepareStatement("INSERT INTO department (Dno, Dname, DLocation) VALUES (?, ?, ?)");
            preparedStatement.setInt(1, Dno);
            preparedStatement.setString(2, Dname);
            preparedStatement.setString(3, Dlocation);
            
            // Execute update
            preparedStatement.executeUpdate();
            
            // Commit the transaction
            connection.commit();
            System.out.println("Record inserted successfully");
        } catch (SQLException e) {
            // Handle exceptions and rollback transaction
            if (connection != null) {
                try {
                    System.out.println("Rolling back the transaction due to an error.");
                    connection.rollback();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
            e.printStackTrace();
        }
    }

    // Close resources
    public void closeResources() {
        try {
            if (preparedStatement != null) preparedStatement.close();
            if (statement != null) statement.close();
            if (connection != null) connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
