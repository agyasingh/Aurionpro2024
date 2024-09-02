package com.aurionpro.jpacrud.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionException;
import org.springframework.transaction.annotation.Transactional;

import com.aurionpro.jpacrud.entities.Customer;
import com.aurionpro.jpacrud.entities.Transaction;
import com.aurionpro.jpacrud.repositories.CustomerRepository;
import com.aurionpro.jpacrud.repositories.TransactionRepository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class TransactionServiceImpl implements TransactionService {

	@Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private TransactionRepository transactionRepository;

    @Autowired
    private PlatformTransactionManager transactionManager;
    @Override
    @Transactional
    public Transaction performTransaction(Long customerId, String type, BigDecimal amount) {
        
        Customer customer = customerRepository.findById(customerId)
                .orElseThrow(() -> new IllegalArgumentException("Customer not found"));

        
        TransactionStatus status = transactionManager.getTransaction(new DefaultTransactionDefinition());
        Object savepoint = transactionManager.getTransaction(new DefaultTransactionDefinition()).createSavepoint();

        try {
            BigDecimal newBalance;
            if ("DEBIT".equalsIgnoreCase(type)) {
                if (customer.getBalance().compareTo(amount) < 0) {
                    throw new IllegalArgumentException("Insufficient funds for the transaction");
                }
                newBalance = customer.getBalance().subtract(amount);
            } else if ("CREDIT".equalsIgnoreCase(type)) {
                newBalance = customer.getBalance().add(amount);
            } else {
                throw new IllegalArgumentException("Invalid transaction type");
            }

          
            customer.setBalance(newBalance);
            customerRepository.save(customer);

            
            Transaction transaction = new Transaction();
            transaction.setCustomer(customer);
            transaction.setType(type.toUpperCase());
            transaction.setAmount(amount);
            transaction.setTransactionDate(LocalDateTime.now());

            return transactionRepository.save(transaction);

        } catch (Exception e) {
        
            transactionManager.getTransaction(new DefaultTransactionDefinition()).rollbackToSavepoint(savepoint);
            throw e;
        } finally {
           
            transactionManager.commit(status);
        }
    }

    public List<Transaction> getCustomerTransactions(Long customerId) {
        return transactionRepository.findByCustomerId(customerId);
    }
}
