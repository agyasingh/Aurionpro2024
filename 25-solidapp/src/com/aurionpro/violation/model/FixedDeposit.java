package com.aurionpro.violation.model;

public class FixedDeposit {
private int accountNumber;
private String name;
private double principal;
private int duration;
private FestivalType FestivalType;

public FixedDeposit(int accountNumber, String name, double principal, int duration,
		com.aurionpro.violation.model.FestivalType festivalType) {
	super();
	this.accountNumber = accountNumber;
	this.name = name;
	this.principal = principal;
	this.duration = duration;
	FestivalType = festivalType;
}
@Override
public String toString() {
	return "FixedDeposit [accountNumber=" + accountNumber + ", name=" + name + ", principal=" + principal
			+ ", duration=" + duration + ", FestivalType=" + FestivalType + "]";
}


//public double getInterestRates(double rate) {
//	FestivalType ny=FestivalType.NEWYEAR;
//	ny.setRate();
//	FestivalType diwali=FestivalType.DIWALI;
//	diwali.setRate();
//	
//	FestivalType holi=FestivalType.HOLI;
//	holi.setRate();
//	
//	FestivalType others=FestivalType.OTHERS;
//	others.setRate();
//	return rate;
//	
//}


private double getInterestRates() {
	  switch(FestivalType) {
	  case NEWYEAR:
	   return 8.0;
	  case DIWALI:
	   return 8.5;
	  case HOLI:
	   return 7.5;
	  case OTHERS:
	   default:
	   return 6.5;
	  }
	 }

public double caluculateSimpleInterest() {
	return(principal * duration * getInterestRates())/100;
}

}
