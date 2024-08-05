package com.aurionpro.abstractfactory.test;

import com.aurionpro.abstractfactory.model.*;


public class FactoryTest {
public static void main(String[] args) {
	
	ICarFactory marutiFactory=new MarutiFactory();
	ICars maruti=marutiFactory.makeCar();
	maruti.start();
	maruti.stop();
	
	
}
}
