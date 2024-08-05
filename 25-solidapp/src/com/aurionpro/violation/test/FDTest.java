package com.aurionpro.violation.test;

import com.aurionpro.violation.model.FestivalType;
import com.aurionpro.violation.model.FixedDeposit;

public class FDTest {
FestivalType festival;

public static void main(String[] args) {
	FixedDeposit deposit1=new FixedDeposit(120,"aagya",1200,3,FestivalType.DIWALI);
	
	System.out.println(deposit1.caluculateSimpleInterest());
}
}
