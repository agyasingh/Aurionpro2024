package com.aurionpro.creational.factory.model;

public class CarFactory {
//returning a reference of car from ICar
	public static ICar makeCar(CarType carName) {
		ICar car=null;  //we comparing objects that is why we are making it null
		
		
		if(carName==CarType.MARUTI)
			car=new Maruti();
		if(carName==CarType.MAHINDRA)
			car=new Mahindra();
		if(carName==CarType.TATA)
			car=new Tata();
		
		return car;
	}
}
