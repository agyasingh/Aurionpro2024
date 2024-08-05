package com.aurionpro.abstractfactory.model;


public class MarutiFactory implements ICarFactory{

	public ICars makeCar() {
		// TODO Auto-generated method stub
		return new MarutiCars();
	}


	
	 

}
