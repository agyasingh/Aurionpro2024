package com.aurionpro.jpacrud.entities;

import java.time.LocalDate;
import java.time.MonthDay;

import org.springframework.boot.autoconfigure.web.WebProperties.Resources.Chain.Strategy;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="salary")
@Getter
@Setter
@Data
public class Salary {
	
	@Column(name="salaryId")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long salaryId;
	
	@Column(name="salaryMonth")
	private MonthDay salaryMonth;
	
	@Column(name="grossSalary")
	private long grossSalary;
	
	@Column(name="deductions")
	private int deductions;
	
	@Column(name="netSalary")
	private long netSalary;
	
	@Column(name="paymentDate")
	private LocalDate paymentDate;
	
	@Column(name="salaryStatus")
	private SalaryStatus salaryStatus;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="transactionId")
	private SalaryTransaction salaryTransaction;
	
	

}
