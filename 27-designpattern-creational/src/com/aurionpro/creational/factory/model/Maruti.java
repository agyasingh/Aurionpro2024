package com.aurionpro.creational.factory.model;

import com.aurionpro.abstractfactory.model.ICars;

public class Maruti implements ICar {

	@Override
	public void start() {
		System.out.println("Maruti has started");
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Maruti has stopped");
	}

}
