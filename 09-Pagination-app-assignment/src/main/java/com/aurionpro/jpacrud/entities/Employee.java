package com.aurionpro.jpacrud.entities;

import java.sql.Date;

import com.aurionpro.jpacrud.entities.Client.KycStatus;
import com.aurionpro.jpacrud.entities.Client.Status;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
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
	
	@Column(name="bankAccountNumber")
	private long bankAccountNumber;
	
	@Column(name="bankIfscNumber")
	private long bankIfscNumber;
	
	@Enumerated(EnumType.STRING)
	@Column(name="status")
	private Status status;
	
	public enum Status{
		ACTIVATED,DEACTIVATED
	}

}
