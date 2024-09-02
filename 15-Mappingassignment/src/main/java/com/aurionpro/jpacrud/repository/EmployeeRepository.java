package com.aurionpro.jpacrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aurionpro.jpacrud.entities.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long>{
	
}
