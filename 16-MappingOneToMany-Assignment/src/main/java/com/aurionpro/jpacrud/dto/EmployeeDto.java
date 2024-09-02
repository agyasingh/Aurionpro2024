package com.aurionpro.jpacrud.dto;

import java.sql.Date;

import com.aurionpro.jpacrud.entities.EmployeeStatus;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDto {
private int employeeId;
	
	
	private String firstName;	

	private String lastName;	
	
	private String phoneNumber;
	
	private String email;	

	private String position;	
	
	private Date hireDate;
		
	private long salary;	
	
    private SalaryAccountDto salaryAccount;
	
	private long bankIfscNumber;
	
	@Enumerated(EnumType.STRING)
	private EmployeeStatus status;
}
