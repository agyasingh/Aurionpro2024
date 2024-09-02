package com.aurionpro.jpacrud.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aurionpro.jpacrud.dto.SalaryDto;
import com.aurionpro.jpacrud.entities.Salary;
import com.aurionpro.jpacrud.entities.SalaryStatus;
import com.aurionpro.jpacrud.repositories.SalaryRepository;

@Service
public class SalaryServiceImpl implements SalaryService{
	
	@Autowired
	private SalaryRepository salaryrepo;

	@Override
	public Salary addSalary(SalaryDto salaryDto) {
		// TODO Auto-generated method stub
		Salary salary=new Salary();
		salary.setNetSalary(salaryDto.getNetSalary());
		salary.setGrossSalary(salaryDto.getGrossSalary());
		salary.setPaymentDate(salaryDto.getPaymentDate());
		salary.setDeductions(salaryDto.getDeductions());
		salary.setSalaryMonth(salaryDto.getSalaryMonth());
		salary.setSalaryStatus(salaryDto.getSalaryStatus());
		
		return salaryrepo.save(salary);
	}

	@Override
	public List<Salary> getAllSalary() {
		// TODO Auto-generated method stub
		return salaryrepo.findAll();
	}

}
