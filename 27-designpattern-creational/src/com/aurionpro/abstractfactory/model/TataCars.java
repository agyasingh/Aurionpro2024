package com.aurionpro.abstractfactory.model;

public class TataCars implements ICars {

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("TATA starting");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Tata stopping");
	}

}
