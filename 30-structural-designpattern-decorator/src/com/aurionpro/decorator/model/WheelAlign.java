package com.aurionpro.decorator.model;

public class WheelAlign extends CarServiceDecorator {

	public WheelAlign(ICarService carobject) {
		super(carobject);
		// TODO Auto-generated constructor stub
	}
	
	public double getCost() {
		return 400 + super.getCost();
	}

}
