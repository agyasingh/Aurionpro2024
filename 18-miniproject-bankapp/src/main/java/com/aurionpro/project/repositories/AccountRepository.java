package com.aurionpro.project.repositories;

import com.aurionpro.project.entities.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {
	Account findByAccountNumber(String accountNumber);
}
