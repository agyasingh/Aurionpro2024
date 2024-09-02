package com.aurionpro.jpacrud.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.aurionpro.jpacrud.dto.PageResponse;

import com.aurionpro.jpacrud.entities.Employee;
import com.aurionpro.jpacrud.entities.SalaryAccount;

import com.aurionpro.jpacrud.repository.EmployeeRepository;
import com.aurionpro.jpacrud.repository.SalaryRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public void addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		 employeeRepository.save(employee);
	}

	@Override
	public PageResponse<Employee> getAllEmployees(int pageNo, int pageSize) {
		// TODO Auto-generated method stub
		Pageable pageable=PageRequest.of(pageNo, pageSize);
		Page<Employee> employeePage= employeeRepository.findAll(pageable);
		PageResponse employeepageresponse=new PageResponse<>();
		employeepageresponse.setTotalelements(employeePage.getNumberOfElements());
		employeepageresponse.setSize(employeePage.getSize());
		employeepageresponse.setContent(employeePage.getContent());
		employeepageresponse.setTotalPages(employeePage.getTotalPages());
		employeepageresponse.setLastPage(employeePage.isLast());
		return employeepageresponse;
	}

	@Override
	public SalaryAccount updateSalaryAccount(long employeeId, SalaryAccount salaryAccount) {
		
		Optional<Employee> optionalEmployee = employeeRepository.findById(employeeId);
	    
	 
	    if (!optionalEmployee.isPresent()) {
	        return null;
	    }

	    
	    Employee dbEmployee = optionalEmployee.get();
	    SalaryAccount dbSalaryAccount = dbEmployee.getSalaryAccount();
	    
	   
	    dbSalaryAccount.setAccountNumber(salaryAccount.getAccountNumber());
	    
	   
	    Employee updatedEmployee = employeeRepository.save(dbEmployee);
	    
	    return updatedEmployee.getSalaryAccount();
	}

	@Override
	public void deleteEmployee(long employeeId) {
		// TODO Auto-generated method stub
		employeeRepository.deleteById(employeeId);
	}

}
