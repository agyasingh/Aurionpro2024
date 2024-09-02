package com.aurionpro.project.controllers;

import com.aurionpro.project.dto.AdminDto;
import com.aurionpro.project.dto.CustomerDto;
import com.aurionpro.project.entities.Account;
import com.aurionpro.project.services.AccountService;
import com.aurionpro.project.services.AdminService;
import com.aurionpro.project.services.CustomerService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import jakarta.validation.ValidationException;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.aurionpro.project.entities.*;

@RestController
@RequestMapping("/bank")
public class AdminController {
	
	@Autowired
	private CustomerService customerService;

    @Autowired
    private AccountService accountService;
    
    @Autowired
    private AdminService adminService;

    @PutMapping("/admin")
    public ResponseEntity<String> updateEmail(@RequestParam int adminId, @RequestBody Map<String, String> request) {
        String newEmail = request.get("email");
        String response = adminService.updateEmailById(adminId, newEmail);
        return ResponseEntity.ok(response);
    }
    
    
    @PostMapping("/accounts")
    public ResponseEntity<Account> addAccount(
            @RequestParam int customerId, 
            @RequestBody Account account) {
        Account dbaccount = accountService.addAccount(customerId, account);
        return ResponseEntity.status(HttpStatus.CREATED).body(dbaccount);
    }
    
    @PostMapping("/addcustomers")
    public ResponseEntity<CustomerDto> addCustomer(@Valid @RequestBody CustomerDto customerDto) {
        CustomerDto newCustomer = customerService.addCustomer(customerDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(newCustomer);
    }
    
    
    @GetMapping("/customers")
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }
    
    @GetMapping("/accounts")
    public List<Account> getAllAccounts() {
        return accountService.getAllAccounts();
    }
    
    @GetMapping("/customers/search")
    public List<Customer> findCustomerByName(@RequestParam String name) {
        return customerService.findCustomerByName(name);
    }
    
    @GetMapping("/accounts/{accountId}")
    public ResponseEntity<Account> getAccountById(@PathVariable int accountId) {
        Account account = accountService.getAccountById(accountId);
            return ResponseEntity.ok(account);
 	
    }
    
    @DeleteMapping("/customers/{customerId}")
    public String deleteCustomer(@PathVariable int customerId) {
        customerService.deleteCustomerById(customerId);
       return "customer deleted successfully";
    }
    
    @DeleteMapping("/accounts")
    public ResponseEntity<Void> deleteAccount(@RequestParam int accountId) {
        accountService.deleteAccountById(accountId);
        return ResponseEntity.noContent().build(); 
    }



}
