package com.aurionpro.jpacrud.entities;


import java.sql.Date;

import com.aurionpro.jpacrud.entities.Client.KycStatus;
import com.aurionpro.jpacrud.entities.*;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="employee")
public class Employee {

	@Column(name="employeeId")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int employeeId;
	
	@Column(name="firstName")
	private String firstName;
	
	@Column(name="lastName")
	private String lastName;
	
	@Column(name="phoneNumber")
	private String phoneNumber;
	
	@Column(name="email")
	private String email;
	
	@Column(name="position")
	private String position;
	
	@Column(name="hireDate")
	private Date hireDate;
	
	@Column(name="salary")
	private long salary;
	
	@Column(name="bankIfscNumber")
	private long bankIfscNumber;
	
	@Enumerated(EnumType.STRING)
	@Column(name="status")
	private EmployeeStatus status;
		
	
	@ManyToOne(cascade= {CascadeType.DETACH,CascadeType.REFRESH})
	@JoinColumn(name="clientId")
	private Client client;
	
	
	@OneToOne(cascade = {CascadeType.MERGE,CascadeType.REFRESH,CascadeType.REFRESH})	
	@JoinColumn(name="acountNumber")
	private SalaryAccount salaryAccount;

	//@JoinColumn(name="salaryId")
	//employee me private salaryAccount salaryAccount;
}
