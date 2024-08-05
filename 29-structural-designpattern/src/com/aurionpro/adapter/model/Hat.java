package com.aurionpro.adapter.model;

public class Hat {
protected String shortname;
protected String longname;
protected int baseprice;
protected double tax;



public Hat(String shortname, String longname, int baseprice, double tax) {
	super();
	this.shortname = shortname;
	this.longname = longname;
	this.baseprice = baseprice;
	this.tax = tax;
}
public String getShortname() {
	return shortname;
}
public void setShortname(String shortname) {
	this.shortname = shortname;
}
public String getLongname() {
	return longname;
}
public void setLongname(String longname) {
	this.longname = longname;
}
public int getBaseprice() {
	return baseprice;
}
public void setBaseprice(int baseprice) {
	this.baseprice = baseprice;
}
public double getTax() {
	return tax;
}
public void setTax(double tax) {
	this.tax = tax;
}
@Override
public String toString() {
	return "Hat [shortname=" + shortname + ", longname=" + longname + ", baseprice=" + baseprice + ", tax=" + tax + "]";
}
}
