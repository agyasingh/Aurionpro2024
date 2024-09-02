package com.aurionpro.jpacrud.entities;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="client")
public class Client {
	
	@Column(name="clientId")
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int clientId;
	
	@Column(name="companyName")
	private String companyName;

	
	@Column(name="registrationNumber")
	private String registrationNumber;
	
	@Column(name="contactPerson")
	private String contactPerson;
	
	@Column(name="contactEmail")
	private String contactEmail;
	
	@Column(name="contactNumber")
	private String contactNumber;
	
	@Column(name="address")
	private String address;
	
	
	
	@Enumerated(EnumType.STRING)
	@Column(name="status")
	private Status status;
	
	public enum Status{
		 ACTIVE,     
		    INACTIVE,    
		    PENDING,     
		    SUSPENDED,   
		    DELETED      
	}
	
	@Column(name="creationDate")
	private LocalDate creationDate;
	

	@Enumerated(EnumType.STRING)
	@Column(name="Kycstatus")
	private KycStatus Kycstatus;
	
	public enum KycStatus{
		VERIFIED,        
	    NOT_VERIFIED,     
	    PENDING,         
	    REJECTED,         
	    UNDER_REVIEW 
	}
	
	@OneToMany(mappedBy = "client",cascade = {CascadeType.MERGE,CascadeType.REFRESH,CascadeType.DETACH})
	@JsonIgnore
	List<Employee> employees;
	

}
