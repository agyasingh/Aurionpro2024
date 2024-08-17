package com.aurionpro.database;
import com.aurionpro.entity.Account;
import com.aurionpro.entity.Customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AccountDb {
    private List<Account> accountList = new ArrayList<>();

   
    public void addAccount(Account account) throws SQLException {
        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            conn = DbUtil.getConnection();
            String sql = "INSERT INTO accounts (customer_id, account_number, account_type, balance) VALUES (?, ?, ?, ?)";
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, account.getCustomerId());
            pstmt.setString(2, account.getAccountNumber());
            pstmt.setString(3, account.getAccountType());
            pstmt.setDouble(4, account.getBalance());
           

            pstmt.executeUpdate();

           
            accountList.add(account);
        } catch (SQLException e) {
            e.printStackTrace();
            throw e; 
        } finally {
            if (pstmt != null) try { pstmt.close(); } catch (SQLException e) { e.printStackTrace(); }
            if (conn != null) try { conn.close(); } catch (SQLException e) { e.printStackTrace(); }
        }
    }

    public List<Account> getAllAccounts() {
        List<Account> accounts = new ArrayList<>();
        String query = "select * from accounts";

        try (Connection conn = DbUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Account account = new Account();
                account.setAccountId(rs.getInt("account_id"));
                account.setCustomerId(rs.getInt("customer_id"));
                account.setAccountNumber(rs.getString("account_number"));
                account.setAccountType(rs.getString("account_type"));
                account.setBalance(rs.getDouble("balance"));
                

                accounts.add(account);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return accounts;
    }
}
