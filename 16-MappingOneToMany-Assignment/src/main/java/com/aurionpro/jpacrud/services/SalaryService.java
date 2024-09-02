package com.aurionpro.jpacrud.services;

import java.util.List;

import com.aurionpro.jpacrud.dto.SalaryAccountDto;
import com.aurionpro.jpacrud.dto.SalaryDto;
import com.aurionpro.jpacrud.entities.Salary;

public interface SalaryService {
	
	Salary addSalary(SalaryDto salaryDto);
	List<Salary> getAllSalary();

}
