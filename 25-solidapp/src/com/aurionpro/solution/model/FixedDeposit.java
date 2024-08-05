package com.aurionpro.solution.model;


public class FixedDeposit {
private int accountNumber;
private String name;
private double principal;
private int duration;
private FestivalType festivalType;




public FixedDeposit(int accountNumber, String name, double principal, int duration,
		com.aurionpro.solution.model.FestivalType festivalType) {
	super();
	this.accountNumber = accountNumber;
	this.name = name;
	this.principal = principal;
	this.duration = duration;
	this.festivalType = festivalType;
}



@Override
public String toString() {
	return "FixedDeposit [accountNumber=" + accountNumber + ", name=" + name + ", principal=" + principal
			+ ", duration=" + duration + ", festivalType=" + festivalType + "]";
}



public double caluculateSimpleInterest() {
	return(principal * duration * festivalType.getInterestRate())/100;
}

}

