package com.aurionpro.decorator.test;

import com.aurionpro.decorator.model.CarInspection;
import com.aurionpro.decorator.model.ICarService;
import com.aurionpro.decorator.model.OilChange;
import com.aurionpro.decorator.model.WheelAlign;

public class CarTest {
    
public static void main(String[] args) {
	ICarService carservice=new CarInspection();
	System.out.println(carservice.getCost());
	OilChange oilchange;
	oilchange=new OilChange(carservice);
	System.out.println(oilchange.getCost());
	WheelAlign wheelalign=new WheelAlign(carservice);
	System.out.println(wheelalign.getCost());
}
}
