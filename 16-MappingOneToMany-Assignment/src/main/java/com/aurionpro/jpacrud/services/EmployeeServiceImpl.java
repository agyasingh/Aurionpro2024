package com.aurionpro.jpacrud.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aurionpro.jpacrud.dto.EmployeeDto;
import com.aurionpro.jpacrud.dto.SalaryAccountDto;
import com.aurionpro.jpacrud.entities.Employee;
import com.aurionpro.jpacrud.entities.SalaryAccount;
import com.aurionpro.jpacrud.repositories.EmployeeRepository;
import com.aurionpro.jpacrud.repositories.SalaryAccountRepository;
import com.aurionpro.jpacrud.repositories.SalaryRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeRepository employeerepo;
	
	@Autowired
	private SalaryAccountRepository salaryaccountrepo;

	@Override
	public Employee addEmployee(EmployeeDto employeeDto) {
		// TODO Auto-generated method stub
		Employee employee=new Employee();
//		SalaryAccount salaryAccount = new SalaryAccount();
//		
//		SalaryAccountDto salaryAccountDto = employeeDto.getSalaryAccount();
//	    salaryAccount.setAccountNumber(salaryAccountDto.getAccountNumber());
//	    salaryAccount.setAccountHolderName(salaryAccountDto.getAccountHolderName());
//	        
//	    employee.setAccountNumber(salaryAccount);
//		
		employee.setBankIfscNumber(employeeDto.getBankIfscNumber());
		employee.setFirstName(employeeDto.getFirstName());
		employee.setLastName(employeeDto.getLastName());
		employee.setSalary(employeeDto.getSalary());
		employee.setStatus(employeeDto.getStatus());
		employee.setEmail(employeeDto.getEmail());
		employee.setHireDate(employeeDto.getHireDate());
		employee.setPhoneNumber(employeeDto.getPhoneNumber());
		employee.setPosition(employeeDto.getPosition());
		return employeerepo.save(employee);
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return employeerepo.findAll();
	}

	@Override
	public Employee findEmployeeById(int employeeId) {
		// TODO Auto-generated method stub
		 Optional<Employee> optionalEmployee = employeerepo.findById(employeeId);
		    return optionalEmployee.orElse(null); 
	}

	@Override
	public Employee allocateSalaryAccount(int employeeId, long accountNumber) {
	    
	    Optional<Employee> optionalEmployee = employeerepo.findById(employeeId);
	    if (!optionalEmployee.isPresent()) {
	        return null; 
	    }
	    Employee dbEmployee = optionalEmployee.get();

	   
	    Optional<SalaryAccount> optionalSalaryAccount = salaryaccountrepo.findById(accountNumber);
	    if (!optionalSalaryAccount.isPresent()) {
	        return null;
	    }
	    SalaryAccount dbSalaryAccount = optionalSalaryAccount.get();

	    
	    dbEmployee.setSalaryAccount(dbSalaryAccount);

	    
	    return employeerepo.save(dbEmployee);
	}

	

}
