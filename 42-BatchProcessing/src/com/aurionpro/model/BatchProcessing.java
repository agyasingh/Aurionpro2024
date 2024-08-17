package com.aurionpro.model;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BatchProcessing {

    // JDBC URL, username, and password
    private static final String URL = "jdbc:mysql://localhost:3307/organization";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            // Load and register the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish a connection
            connection = DriverManager.getConnection(URL, USER, PASSWORD);

            // Disable auto-commit mode for batch processing
            connection.setAutoCommit(false);

            // SQL query for inserting data
            String sql = "INSERT INTO department (Dno, Dname, DLocation) VALUES (?, ?, ?)";

            // Create a PreparedStatement
            preparedStatement = connection.prepareStatement(sql);

            // Add multiple batches
            preparedStatement.setInt(1, 1);
            preparedStatement.setString(2, "HR");
            preparedStatement.setString(3, "New York");
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2);
            preparedStatement.setString(2, "IT");
            preparedStatement.setString(3, "San Francisco");
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 3);
            preparedStatement.setString(2, "Finance");
            preparedStatement.setString(3, "Chicago");
            preparedStatement.addBatch();

            // Execute batch
            int[] updateCounts = preparedStatement.executeBatch();

            // Commit the transaction
            connection.commit();

            // Print results
            System.out.println("Batch executed successfully.");
            

        } catch (ClassNotFoundException | SQLException e) {
            // Handle errors and roll back the transaction if needed
            if (connection != null) {
                try {
                    connection.rollback();
                    System.out.println("Transaction rolled back.");
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
            e.printStackTrace();
        } finally {
            // Close resources
            try {
                if (preparedStatement != null) preparedStatement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
