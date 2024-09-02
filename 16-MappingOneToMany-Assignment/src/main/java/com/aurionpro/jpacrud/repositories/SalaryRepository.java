package com.aurionpro.jpacrud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aurionpro.jpacrud.entities.Salary;

@Repository
public interface SalaryRepository extends JpaRepository<Salary, Long> {

}
