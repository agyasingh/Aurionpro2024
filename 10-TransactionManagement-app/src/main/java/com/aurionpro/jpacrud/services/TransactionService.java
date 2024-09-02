package com.aurionpro.jpacrud.services;

import java.math.BigDecimal;
import java.util.List;

import com.aurionpro.jpacrud.entities.Transaction;

public interface TransactionService {

    Transaction performTransaction(Long customerId, String type, BigDecimal amount);

    List<Transaction> getCustomerTransactions(Long customerId);
}
