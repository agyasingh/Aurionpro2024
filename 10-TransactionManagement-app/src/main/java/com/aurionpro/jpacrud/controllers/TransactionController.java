package com.aurionpro.jpacrud.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.aurionpro.jpacrud.entities.Transaction;
import com.aurionpro.jpacrud.services.TransactionService;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/transactions")
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    @PostMapping("/{customerId}")
    public Transaction performTransaction(
            @PathVariable Long customerId,
            @RequestParam String type,
            @RequestParam BigDecimal amount) {
        return transactionService.performTransaction(customerId, type, amount);
    }

    @GetMapping("/getcustomers")
    public List<Transaction> getCustomerTransactions(@RequestParam Long customerId) {
        return transactionService.getCustomerTransactions(customerId);
    }
}
