package com.aurionpro.jpacrud.service;

import org.springframework.stereotype.Service;

import com.aurionpro.jpacrud.entities.Salary;

@Service
public interface SalaryService {
	
	void addSalary(Salary salary);
	
	void deleteSalary(long salaryId);
	

}
