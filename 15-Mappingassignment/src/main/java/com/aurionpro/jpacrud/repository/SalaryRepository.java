package com.aurionpro.jpacrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aurionpro.jpacrud.*;
import com.aurionpro.jpacrud.entities.Salary;

@Repository
public interface SalaryRepository extends JpaRepository<Salary, Long>{

}
