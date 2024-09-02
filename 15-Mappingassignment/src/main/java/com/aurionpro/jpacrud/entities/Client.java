package com.aurionpro.jpacrud.entities;


import java.sql.Date;
import java.time.LocalDate;

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

@Entity
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
		 ACTIVE,      // The client is active
		    INACTIVE,    // The client is inactive
		    PENDING,     // The client's status is pending (e.g., waiting for approval)
		    SUSPENDED,   // The client is suspended (e.g., due to policy violations)
		    DELETED      // The client has been deleted or removed
	}
	
	@Column(name="creationDate")
	private LocalDate creationDate;
	

	@Enumerated(EnumType.STRING)
	@Column(name="Kycstatus")
	private KycStatus Kycstatus;
	
	public enum KycStatus{
		VERIFIED,         // KYC has been completed and verified
	    NOT_VERIFIED,     // KYC has not been completed
	    PENDING,          // KYC verification is pending
	    REJECTED,         // KYC verification was attempted but rejected
	    UNDER_REVIEW 
	}
	

}
