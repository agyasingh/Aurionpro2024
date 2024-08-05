package com.aurionpro.decorator.model;

public class OilChange extends CarServiceDecorator {

	public OilChange(ICarService carobject) {
		super(carobject);
		// TODO Auto-generated constructor stub
	}
	
	public double getCost() {
		return 500 + super.getCost();
	}

}
