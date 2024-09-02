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
@Table(name="payment")
public class Payment {
	
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)  // Automatically generates the ID value
	@Column(name = "paymentId")
	private Long paymentId;
	@Column(name="paymentDate")
	private Date paymentDate;
	
	@Column(name="amount")
	private long amount;
	
	@Enumerated(EnumType.STRING)	
	@Column(name="paymentMode")
	private paymentMode paymentMode;
	
	public enum paymentMode{
		 CASH,
	        CREDIT_CARD,
	        DEBIT_CARD,
	        BANK_TRANSFER,
	        UPI
	}
	
	@Enumerated(EnumType.STRING)
	@Column(name="paymentStatus")
	private paymentStatus paymentStatus;
	
	public enum paymentStatus{
		SUCCESSFUL,FAILED
	}
	
	

	

	public void setPaymentId(Long paymentId) {
		this.paymentId = paymentId;
	}

	public Payment() {
		
	}

	public Payment(long paymentId, Date paymentDate, long amount,
			com.aurionpro.dbconnect.entities.Payment.paymentMode paymentMode,
			com.aurionpro.dbconnect.entities.Payment.paymentStatus paymentStatus) {
		super();
		this.paymentId = paymentId;
		this.paymentDate = paymentDate;
		this.amount = amount;
		this.paymentMode = paymentMode;
		this.paymentStatus = paymentStatus;
	}

	public long getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(long paymentId) {
		this.paymentId = paymentId;
	}

	public Date getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}

	public long getAmount() {
		return amount;
	}

	public void setAmount(long amount) {
		this.amount = amount;
	}

	public paymentMode getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(paymentMode paymentMode) {
		this.paymentMode = paymentMode;
	}

	public paymentStatus getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(paymentStatus paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	
	
	
	

}
