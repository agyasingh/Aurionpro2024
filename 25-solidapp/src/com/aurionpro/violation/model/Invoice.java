package com.aurionpro.violation.model;

public class Invoice {
private int id;
private String description;
private double amount;
private double tax;
public Invoice(int id, String description, double amount, double tax) {
	super();
	this.id = id;
	this.description = description;
	this.amount = amount;
	this.tax = tax;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public double getAmount() {
	return amount;
}
public void setAmount(double amount) {
	this.amount = amount;
}
public double getTax() {
	return tax;
}
public void setTax(double tax) {
	this.tax = tax;
}
@Override
public String toString() {
	return "Invoice [id=" + id + ", description=" + description + ", amount=" + amount + ", tax=" + tax + "]";
}

//private static double calculateTax(double amount,double taxRate){
//	return amount * taxRate;
//}

//printInvoice(){
//	printTax(;
//}
}
