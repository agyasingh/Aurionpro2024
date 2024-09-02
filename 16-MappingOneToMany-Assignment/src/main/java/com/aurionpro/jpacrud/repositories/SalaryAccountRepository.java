package com.aurionpro.jpacrud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aurionpro.jpacrud.entities.SalaryAccount;

@Repository
public interface SalaryAccountRepository extends JpaRepository<SalaryAccount, Long>{

}
