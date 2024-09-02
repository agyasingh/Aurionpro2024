package com.aurionpro.jpacrud.dto;

import java.time.LocalDate;
import java.time.MonthDay;

import com.aurionpro.jpacrud.entities.SalaryStatus;

import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SalaryDto {
	
    private long salaryId;
	
	private MonthDay salaryMonth; 
	
	private long grossSalary;
	
	private int deductions;
	
	private long netSalary;
	
	private LocalDate paymentDate;
	
	private SalaryStatus salaryStatus;

}
