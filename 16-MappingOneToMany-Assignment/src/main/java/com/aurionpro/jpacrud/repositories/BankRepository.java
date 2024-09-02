package com.aurionpro.jpacrud.repositories;
import com.aurionpro.jpacrud.entities.*;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankRepository extends JpaRepository<Bank, Long>{

}
