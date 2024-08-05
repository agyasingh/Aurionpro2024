package com.aurionpro.creational.factory.test;

import com.aurionpro.creational.factory.model.CarFactory;
import com.aurionpro.creational.factory.model.CarType;
import com.aurionpro.creational.factory.model.ICar;

public class CarFactoryTest {

	public static void main(String[] args) {
		//creating reference for interface.
		ICar car;
		
		car=CarFactory.makeCar(CarType.MARUTI);
		car.start();
		car.stop();
				
	}
}
