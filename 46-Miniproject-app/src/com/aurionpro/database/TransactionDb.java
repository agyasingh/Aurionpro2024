package com.aurionpro.database;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import com.aurionpro.database.DbUtil;
import com.aurionpro.entity.Transactions;

public class TransactionDb {
	
	public String getAccountNumberByEmail(String email) {
	    String sql = "SELECT a.account_number FROM accounts a JOIN customers c ON a.customer_id = c.customer_id WHERE c.email = ?";

	    try (Connection connection = DbUtil.getConnection();
	         PreparedStatement statement = connection.prepareStatement(sql)) {

	        statement.setString(1, email);
	        ResultSet resultSet = statement.executeQuery();

	        if (resultSet.next()) {
	            return resultSet.getString("account_number");
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return null;
	}
	
	 public List<Transactions> getTransactionDetailByEmail(String email) {
	        List<Transactions> transactions = new ArrayList<>();
	        String query = "SELECT " +
	                       "t.transaction_id, " +
	                       "t.sender_accountno, " +
	                       "t.receiver_accountno, " +
	                       "t.transaction_type, " +
	                       "t.amount, " +
	                       "t.transaction_date " +
	                       "FROM transactions t " +
	                       "JOIN accounts a ON (t.sender_accountno = a.account_number OR t.receiver_accountno = a.account_number) " +
	                       "JOIN customers c ON a.customer_id = c.customer_id " +
	                       "WHERE c.email = ?";
	        
	        try (Connection conn = DbUtil.getConnection();
	             PreparedStatement stmt = conn.prepareStatement(query)) {

	            stmt.setString(1, email);

	            try (ResultSet rs = stmt.executeQuery()) {
	                while (rs.next()) {
	                    Transactions transaction = new Transactions(
	                        rs.getString("sender_accountno"),
	                        rs.getString("receiver_accountno"),
	                        rs.getString("transaction_type"),
	                        rs.getBigDecimal("amount")
	                    );
	                    // Optionally, you can handle transactionId and transactionDate separately if needed
	                    // For example:
	                    // transaction.setTransactionId(rs.getInt("transaction_id"));
	                    // transaction.setTransactionDate(rs.getTimestamp("transaction_date"));
	                    transactions.add(transaction);
	                }
	            }
	        } catch (SQLException e) {
	            e.printStackTrace(); // Handle the exception properly in production code
	        }
	        
	        return transactions;
	    }
	
	
    // Method to create a new transaction with validation
    public boolean createTransaction(Transactions transaction) {
        if (!validateTransaction(transaction)) {
            return false; // If validation fails, return false
        }

        String sql = "INSERT INTO transactions (sender_accountno, receiver_accountno, transaction_type, amount, transaction_date) VALUES ( ?, ?, ?, ?, ?)";

        try (Connection connection = DbUtil.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {

            
            statement.setString(1, transaction.getSenderAccountNo());
            statement.setString(2, transaction.getReceiverAccountNo());
            statement.setString(3, transaction.getTransactionType());
            statement.setBigDecimal(4, transaction.getAmount());
            statement.setTimestamp(5, transaction.getTransactionDate());

            int rowsAffected = statement.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    // Validation method for transactions
    private boolean validateTransaction(Transactions transaction) {
        if (transaction.getAmount().compareTo(BigDecimal.ZERO) <= 0) {
            System.out.println("Amount must be greater than zero.");
            return false;
        }

        if (!doesAccountExist(transaction.getSenderAccountNo())) {
            System.out.println("Sender account does not exist.");
            return false;
        }

        if ("transfer".equals(transaction.getTransactionType())) {
            if (!doesAccountExist(transaction.getReceiverAccountNo())) {
                System.out.println("Receiver account does not exist.");
                return false;
            }

            if (transaction.getSenderAccountNo().equals(transaction.getReceiverAccountNo())) {
                System.out.println("Sender and receiver accounts cannot be the same.");
                return false;
            }
        }

        return true;
    }

    // Method to check if an account exists by account number
    public boolean doesAccountExist(String accountNumber) {
        String sql = "SELECT COUNT(*) FROM accounts WHERE account_number = ?";

        try (Connection connection = DbUtil.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setString(1, accountNumber);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                int count = resultSet.getInt(1);
                return count > 0;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    // Method to perform credit operation with validation
    public boolean creditAmount(String accountNumber, BigDecimal amount) {
        if (!doesAccountExist(accountNumber)) {
            System.out.println("Account does not exist for credit.");
            return false;
        }

        String sql = "UPDATE accounts SET balance = balance + ? WHERE account_number = ?";

        try (Connection connection = DbUtil.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setBigDecimal(1, amount);
            statement.setString(2, accountNumber);

            int rowsAffected = statement.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    // Method to perform debit operation with validation
    public boolean debitAmount(String accountNumber, BigDecimal amount) {
        if (!doesAccountExist(accountNumber)) {
            System.out.println("Account does not exist for debit.");
            return false;
        }

        String sql = "UPDATE accounts SET balance = balance - ? WHERE account_number = ? AND balance >= ?";

        try (Connection connection = DbUtil.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setBigDecimal(1, amount);
            statement.setString(2, accountNumber);
            statement.setBigDecimal(3, amount);

            int rowsAffected = statement.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    // Method to perform transfer operation with validation
    public boolean transferAmount(String senderAccountNo, String receiverAccountNo, BigDecimal amount) {
        if (!doesAccountExist(senderAccountNo)) {
            System.out.println("Sender account does not exist for transfer.");
            return false;
        }

        if (!doesAccountExist(receiverAccountNo)) {
            System.out.println("Receiver account does not exist for transfer.");
            return false;
        }

        if (senderAccountNo.equals(receiverAccountNo)) {
            System.out.println("Sender and receiver accounts cannot be the same.");
            return false;
        }

        try (Connection connection = DbUtil.getConnection()) {
            connection.setAutoCommit(false);

            // Debit from sender's account
            if (!debitAmount(senderAccountNo, amount)) {
                connection.rollback();
                return false;
            }

            // Credit to receiver's account
            if (!creditAmount(receiverAccountNo, amount)) {
                connection.rollback();
                return false;
            }

            connection.commit();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    
    
    
    public List<Transactions> getAllTransactions() {
        List<Transactions> transactionList = new ArrayList<>();
        String sql = "SELECT sender_accountno, receiver_accountno, transaction_type, amount, transaction_date FROM transactions";

        try (Connection connection = DbUtil.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) {
                String senderAccountNo = resultSet.getString("sender_accountno");
                String receiverAccountNo = resultSet.getString("receiver_accountno");
                String transactionType = resultSet.getString("transaction_type");
                BigDecimal amount = resultSet.getBigDecimal("amount");
                Timestamp transactionDate = resultSet.getTimestamp("transaction_date");

                // Use default values for fields not available in the SQL result
                Transactions transaction = new Transactions(
                    senderAccountNo, 
                    receiverAccountNo, 
                    transactionType, 
                    amount
                );
                transaction.setTransactionDate(transactionDate);
                transactionList.add(transaction);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return transactionList;
    }
}
