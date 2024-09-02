package com.aurionpro.jpacrud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aurionpro.jpacrud.entities.SalaryTransaction;

@Repository
public interface SalaryTransactionRepository extends JpaRepository<SalaryTransaction, Long>{

}
