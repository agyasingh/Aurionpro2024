package com.aurionpro.jpacrud.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.aurionpro.jpacrud.entities.Salary;
import com.aurionpro.jpacrud.repository.SalaryRepository;

public class SalaryServiceImpl implements SalaryService{
	
	@Autowired
    private SalaryRepository salaryrepository;

	@Override
	public void addSalary(Salary salary) {
		// TODO Auto-generated method stub
		salaryrepository.save(salary);
		
	}

	@Override
	public void deleteSalary(long salaryId) {
		// TODO Auto-generated method stub
		salaryrepository.deleteById(salaryId);
	}

}
