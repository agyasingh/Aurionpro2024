package com.aurionpro.dbconnect.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import java.util.List;
import com.aurionpro.dbconnect.entities.*;
import com.aurionpro.dbconnect.services.CustomerService;

@RestController

public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/customers")
	public ResponseEntity<List<Customer>> getAllCustomers(){
		return ResponseEntity.ok(customerService.getAllCustomers());
	}
	
	@PostMapping("/customers")
	public String addCustomer(@RequestBody Customer customer) {
		customerService.addCustomer(customer);
		return "customer added successfully";
	}
	
	@GetMapping("/customers/{customerId}")
	public ResponseEntity<Customer> getCustomer(@PathVariable int customerId){
		 return ResponseEntity.ok(customerService.getCustomer(customerId));
	}
	
	@PostMapping("/customers/deletecustomer")
	public String deleteCustomer(@RequestParam int customerId) {
		customerService.deleteCustomer(customerId);
		return "deleted customer successfully";
	}
	
	
	

}
