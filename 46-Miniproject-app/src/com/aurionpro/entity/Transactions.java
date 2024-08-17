package com.aurionpro.entity;


import java.math.BigDecimal;
import java.sql.Timestamp;

public class Transactions {
    private int transactionId;
    private int accountId;
    private String senderAccountNo;
    private String receiverAccountNo;
    private String transactionType;
    private BigDecimal amount;
    private Timestamp transactionDate;

    // Constructor
    public Transactions() {}

    public Transactions(int transactionId, int accountId, String senderAccountNo, String receiverAccountNo,
                       String transactionType, BigDecimal amount, Timestamp transactionDate) {
        this.transactionId = transactionId;
        this.accountId = accountId;
        this.senderAccountNo = senderAccountNo;
        this.receiverAccountNo = receiverAccountNo;
        this.transactionType = transactionType;
        this.amount = amount;
        this.transactionDate = transactionDate;
    }
    
  

    public Transactions(String senderAccountNo, String receiverAccountNo, String transactionType, BigDecimal amount
			) {
		super();
		this.senderAccountNo = senderAccountNo;
		this.receiverAccountNo = receiverAccountNo;
		this.transactionType = transactionType;
		this.amount = amount;
		
	}

	// Getters and Setters
    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public String getSenderAccountNo() {
        return senderAccountNo;
    }

    public void setSenderAccountNo(String senderAccountNo) {
        this.senderAccountNo = senderAccountNo;
    }

    public String getReceiverAccountNo() {
        return receiverAccountNo;
    }

    public void setReceiverAccountNo(String receiverAccountNo) {
        this.receiverAccountNo = receiverAccountNo;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Timestamp getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Timestamp transactionDate) {
        this.transactionDate = transactionDate;
    }
}
