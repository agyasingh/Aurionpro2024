package com.aurionpro.dbconnect.services;
import java.util.List;

import org.springframework.stereotype.Service;

import com.aurionpro.dbconnect.entities.Customer;

@Service
public interface CustomerService {
	List<Customer> getAllCustomers();
    void addCustomer(Customer customer);
    Customer getCustomer(int customerId);
    void deleteCustomer(int customerId);
}
