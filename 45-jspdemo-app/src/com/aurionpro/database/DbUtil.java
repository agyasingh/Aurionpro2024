package com.aurionpro.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {
    private static final String URL = "jdbc:mysql://localhost:3307/bank";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    private Connection connection;

    // Method to establish a connection to the database
    public void connectToDb() throws SQLException {
        if (connection != null && !connection.isClosed()) {
            return; // Connection already established
        }
        try {
            // Register JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Establish the connection
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Connection Successful");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            throw new SQLException("JDBC Driver not found", e);
        }
    }

    // Getter for the connection
    public Connection getConnection() {
        return connection;
    }

    // Method to close the connection
    public void close() {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
