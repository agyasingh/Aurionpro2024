package com.aurionpro.model;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.SQLException;

	public class JdbcTransactionExample {

	    public static void main(String[] args) {
	        Connection conn = null;
	        PreparedStatement stmt1 = null;
	        PreparedStatement stmt2 = null;

	        try {
	            // Step 1: Load the JDBC driver (optional for newer versions of JDBC)
	            Class.forName("com.mysql.cj.jdbc.Driver");

	            // Step 2: Establish the connection
	            String dbURL = "jdbc:mysql://localhost:3307/scm";
	            String user = "root";
	            String password = "root";
	            conn = DriverManager.getConnection(dbURL, user, password);

	            // Step 3: Disable auto-commit mode to manage transactions manually
	            conn.setAutoCommit(false);

	            // Step 4: Create SQL statements
	            String debitSql = "UPDATE accounts SET balance = balance - ? WHERE account_id = ?";
	            String creditSql = "UPDATE accounts SET balance = balance + ? WHERE account_id = ?";

	            // Step 5: Create PreparedStatement objects
	            stmt1 = conn.prepareStatement(debitSql);
	            stmt2 = conn.prepareStatement(creditSql);

	            // Transfer amount
	            int transferAmount = 100;
	            int fromAccountId = 1;
	            int toAccountId = 2;

	            // Step 6: Set parameters for the debit statement and execute it
	            stmt1.setInt(1, transferAmount);
	            stmt1.setInt(2, fromAccountId);
	            stmt1.executeUpdate();

	            // Step 7: Set parameters for the credit statement and execute it
	            stmt2.setInt(1, transferAmount);
	            stmt2.setInt(2, toAccountId);
	            stmt2.executeUpdate();

	            // Step 8: Commit the transaction since both operations succeeded
	            conn.commit();
	            System.out.println("Transaction committed successfully.");

	        } catch (SQLException | ClassNotFoundException e) {
	            // Step 9: Handle any errors and roll back the transaction
	            if (conn != null) {
	                try {
	                    System.out.println("Transaction is being rolled back.");
	                    conn.rollback();
	                } catch (SQLException ex) {
	                    ex.printStackTrace();
	                }
	            }
	            e.printStackTrace();
	        } finally {
	            // Step 10: Clean up JDBC resources
	            try {
	                if (stmt1 != null) stmt1.close();
	                if (stmt2 != null) stmt2.close();
	                if (conn != null) conn.close();
	            } catch (SQLException ex) {
	                ex.printStackTrace();
	            }
	        }
	    }
	}



