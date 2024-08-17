package com.aurionpro.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.aurionpro.entity.Account;
import com.aurionpro.entity.Customer;

public class CustomerDb {
	private Connection connection = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;
    // Method to add a new customer
    public boolean addCustomer(Customer customer) {
        String sql = "INSERT INTO Customers (user_id, first_name, last_name, email, phone, address,password) VALUES (?, ?, ?, ?, ?, ?,?)";
        try (Connection connection = DbUtil.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            
        	preparedStatement.setString(1, customer.getUserId());
            preparedStatement.setString(2, customer.getFirstName());
            preparedStatement.setString(3, customer.getLastName());
            preparedStatement.setString(4, customer.getEmail());
            preparedStatement.setString(5, customer.getPhone());
            preparedStatement.setString(6, customer.getAddress());
            preparedStatement.setString(7, customer.getPassword());

            int result = preparedStatement.executeUpdate();
            return result > 0; // Return true if the operation was successful

        } catch (SQLException e) {
            e.printStackTrace(); // Handle exceptions appropriately
            return false;
        }
    }
    
    
    public List<Customer> getAllCustomers() {
        List<Customer> customers = new ArrayList<Customer>();
        Customer customer =null;
        String sql = "SELECT * FROM Customers";

        try (Connection connection = DbUtil.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql);
             ResultSet resultSet = preparedStatement.executeQuery()) {

            System.out.println("Executing query: " + sql);
            
            while (resultSet.next()) {
                customer = new Customer();
                customer.setCustomerId(resultSet.getInt("customer_id"));
                customer.setUserId(resultSet.getString("user_id"));
                customer.setFirstName(resultSet.getString("first_name"));
                customer.setLastName(resultSet.getString("last_name"));
                customer.setEmail(resultSet.getString("email"));
                customer.setPhone(resultSet.getString("phone"));
                customer.setAddress(resultSet.getString("address"));
                customer.setAddress(resultSet.getString("password"));


                customers.add(customer);
            }
            
            System.out.println("Number of customers fetched: " + customers.size());

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return customers;
    }
    
    
    
    public List<Customer> getCustomersById(int customerId) throws SQLException {
        List<Customer> customers = new ArrayList<>();

        String sql = "SELECT * FROM customers WHERE customer_id = ?";
        try (Connection connection = DbUtil.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setInt(1, customerId);
            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    Customer customer = new Customer();
                    customer.setCustomerId(resultSet.getInt("customer_id"));
                    customer.setFirstName(resultSet.getString("first_name"));
                    customer.setLastName(resultSet.getString("last_name"));
                    customer.setEmail(resultSet.getString("email"));
                    customer.setPhone(resultSet.getString("phone"));
                    customer.setAddress(resultSet.getString("address"));
                   

                    customers.add(customer);  // Add customer to the list
                }
            }
        }

        return customers;
    }
    
    public boolean validateCustomer(String username, String password, String email) {
        
        boolean isValidCustomer = false;

        try {
            connection = DbUtil.getConnection();
            String sql = "SELECT * FROM Customers WHERE first_name = ? AND password = ? AND email = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            preparedStatement.setString(3, email);
           
            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                isValidCustomer = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } 

        return isValidCustomer;
    }
    
    public int getCustomerIdByEmail(String email) throws SQLException {
        String query = "SELECT customer_id FROM customers WHERE email = ?";
        try {
        	Connection connection=DbUtil.getConnection();
        	PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, email);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getInt("customer_id");
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        } 
        return -1; // or handle this case appropriately
    }
    
    
    public List<Long> getAccountNumbersByCustomerId(int customerId) throws SQLException {
        // Use List interface for declaration and ArrayList for instantiation
        List<Long> accountNumbers = new ArrayList<>();
        String query = "SELECT account_number FROM accounts WHERE customer_id = ?";
        
        try (Connection connection = DbUtil.getConnection();
             PreparedStatement ps = connection.prepareStatement(query)) {
            ps.setInt(1, customerId);
            
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    // Assuming account_number is a numeric field stored as a string in the database
                    // If it's stored as a string, you need to convert it to Long
                    accountNumbers.add(Long.parseLong(rs.getString("account_number")));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw e; // Re-throw the exception to indicate failure to the caller
        }
        
        return accountNumbers;
    }





   
}

