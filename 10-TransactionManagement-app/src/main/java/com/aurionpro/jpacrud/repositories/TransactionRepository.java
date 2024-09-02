package com.aurionpro.jpacrud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aurionpro.jpacrud.entities.Transaction;

import java.util.List;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    List<Transaction> findByCustomerId(Long customerId);
}
