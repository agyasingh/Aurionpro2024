package com.aurionpro.jpacrud.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aurionpro.jpacrud.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client,Integer> {
	
	Page<Client> findByCompanyName(String companyName, Pageable pageable);
}
