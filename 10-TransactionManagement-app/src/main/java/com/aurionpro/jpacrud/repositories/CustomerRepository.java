package com.aurionpro.jpacrud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aurionpro.jpacrud.entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
