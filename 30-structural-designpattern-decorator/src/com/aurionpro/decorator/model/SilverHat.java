package com.aurionpro.decorator.model;

public class SilverHat extends HatDecorator{

	public SilverHat(IHat hat) {
		super(hat);
		// TODO Auto-generated constructor stub
	}
	
	 public double getPrice() {
	        return 800 + super.getPrice();
	    }

	    public String getName() {
	        return "Silver " + super.getName();
	    }

	    @Override
	    public String getDescription() {
	        return "Silver " + super.getDescription();
	    }

}
