package com.aurionpro.dbconnect.repositories;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.aurionpro.dbconnect.entities.*;

@Repository
public interface CustomerRepository {
	List<Customer> getAllCustomers();
    void addCustomer(Customer customer);
    Customer getCustomer(int customerId);
    void deleteCustomer(int customerId);
}
