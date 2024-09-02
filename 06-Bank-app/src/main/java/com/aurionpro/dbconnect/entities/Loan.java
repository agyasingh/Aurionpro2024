package com.aurionpro.dbconnect.entities;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="loan")
public class Loan {
	
	@Column(name="loanId")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long loanId;
	
	@Column(name="loanAmount")
	private long loanAmount;
	
	@Column(name="interestRate")
	private double interestRate;
	
	@Column(name="loanTerm")
	private int loanTerm;
	
	@Column(name="startDate")
	private Date startDate;
	
	@Column(name="endDate")
	private Date endDate;
	
	@Enumerated(EnumType.STRING) // Specify that the enum should be stored as a String in the database
    @Column(name = "loanStatus")
    private LoanStatus loanStatus;

    // Define the LoanStatus enum
    public enum LoanStatus {
        APPROVED,
        REJECTED,
        ON_HOLD
    }
    
    public Loan() {
        // Default constructor required by JPA
    }

	public Loan(long loanId, long loanAmount, double interestRate, int loanTerm, Date startDate, Date endDate,
			LoanStatus loanStatus) {
		super();
		this.loanId = loanId;
		this.loanAmount = loanAmount;
		this.interestRate = interestRate;
		this.loanTerm = loanTerm;
		this.startDate = startDate;
		this.endDate = endDate;
		this.loanStatus = loanStatus;
	}

	public long getLoanId() {
		return loanId;
	}

	public void setLoanId(long loanId) {
		this.loanId = loanId;
	}

	public long getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(long loanAmount) {
		this.loanAmount = loanAmount;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public int getLoanTerm() {
		return loanTerm;
	}

	public void setLoanTerm(int loanTerm) {
		this.loanTerm = loanTerm;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public LoanStatus getLoanStatus() {
		return loanStatus;
	}

	public void setLoanStatus(LoanStatus loanStatus) {
		this.loanStatus = loanStatus;
	}
    
    
    

}
