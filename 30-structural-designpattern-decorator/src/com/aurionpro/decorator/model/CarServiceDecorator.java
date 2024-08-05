package com.aurionpro.decorator.model;

public abstract class CarServiceDecorator implements ICarService {
	
private ICarService carobject;

public CarServiceDecorator(ICarService carobject) {
	super();
	this.carobject = carobject;
}

public double getCost() {
	return carobject.getCost();
}

}
