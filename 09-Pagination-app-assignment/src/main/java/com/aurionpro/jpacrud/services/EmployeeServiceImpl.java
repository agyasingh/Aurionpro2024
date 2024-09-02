package com.aurionpro.jpacrud.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.aurionpro.jpacrud.entities.Employee;
import com.aurionpro.jpacrud.repositories.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	Pageable pageable=null;
	@Autowired
	private EmployeeRepository employeerepo;

	@Override
	public Page<Employee> findByfirstName(String firstName, int pageNumber, int pageSize) {
		// TODO Auto-generated method stub
		pageable=PageRequest.of(pageNumber, pageSize);
		Page<Employee> employeePage=employeerepo.findByfirstName(firstName, pageable);
		return employeePage;
	}

	@Override
	public Page<Employee> getAllEmployees(int pageNumber, int pageSize) {
		// TODO Auto-generated method stub
		pageable=PageRequest.of(pageNumber, pageSize);
		Page<Employee> employeePage=employeerepo.findAll(pageable);
		return employeePage;
	
	}

}
