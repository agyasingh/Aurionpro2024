package com.aurionpro.jpacrud.entities;

import java.time.LocalDate;
import java.time.MonthDay;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="salary")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Salary {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="salaryId")
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
	
	@Enumerated(EnumType.STRING)
	@Column(name="salaryStatus")
	private SalaryStatus salaryStatus;
	
	@OneToMany(mappedBy = "salary", cascade = {CascadeType.REFRESH, CascadeType.DETACH})
	@JsonIgnore
	private List<SalaryTransaction> salaryTransactions;
}
