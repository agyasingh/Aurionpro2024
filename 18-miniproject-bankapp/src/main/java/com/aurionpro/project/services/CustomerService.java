package com.aurionpro.project.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.aurionpro.project.dto.CustomerDto;
import com.aurionpro.project.entities.*;

import jakarta.servlet.http.HttpSession;

@Service
public interface CustomerService {
	
	
	
	 List<Customer> getAllCustomers();
	 
//	
	 List<Customer> findCustomerByName(String name);
//	 
	 
	 void deleteCustomerById(int customerId);

	 CustomerDto addCustomer(CustomerDto customerDto);
	 
	
}
