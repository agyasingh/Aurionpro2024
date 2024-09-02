package com.aurionpro.project.services;

import com.aurionpro.project.entities.Account;
import com.aurionpro.project.entities.Customer;
import com.aurionpro.project.entities.AccountNumberGenerator;
import com.aurionpro.project.exceptions.ValidationException;
import com.aurionpro.project.repositories.AccountRepository;
import com.aurionpro.project.repositories.CustomerRepository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    private AccountNumberGenerator accountNumberGenerator;

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Account addAccount(int customerId, Account account) {
        
        validateAccount(account);

        
        account.setAccountNumber(accountNumberGenerator.generateAccountNumber());

       
        Customer customer = customerRepository.findById(customerId)
                .orElseThrow(() -> new ValidationException("Customer with ID " + customerId + " not found"));
        
        
        account.setCustomer(customer);

       
        account.setCreatedAt(LocalDate.now());

      
        return accountRepository.save(account);
    }

    private void validateAccount(Account account) {
        if (account.getAccountType() == null) {
            throw new ValidationException("Account type is mandatory");
        }
        if (account.getBalance() == null || account.getBalance() < 0) {
            throw new ValidationException("Balance cannot be negative");
        }
    }
    
    
    @Override
    public List<Account> getAllAccounts() {
        return accountRepository.findAll();
    }
    
    @Override
    public Account getAccountById(int accountId) {
        return accountRepository.findById(accountId)
                .orElseThrow(() -> new ValidationException("Account with ID not found"));
    }
    
    @Override
    public void deleteAccountById(int accountId) {
        if (!accountRepository.existsById(accountId)) {
            throw new ValidationException("Account with ID " + accountId + " not found");
        }
        accountRepository.deleteById(accountId);
    }

}
