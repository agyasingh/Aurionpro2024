package com.aurionpro.jpacrud.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aurionpro.jpacrud.entities.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
	Page<Employee> findByfirstName(String firstName,Pageable pageable);

}
