package com.aurionpro.project.repositories;


import com.aurionpro.project.entities.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction,Integer> {
    
}
