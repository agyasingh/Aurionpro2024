package com.aurionpro.decorator.test;

import com.aurionpro.decorator.model.GoldenHat;
import com.aurionpro.decorator.model.HatDecorator;
import com.aurionpro.decorator.model.IHat;
import com.aurionpro.decorator.model.PremimumHat;
import com.aurionpro.decorator.model.SilverHat;
import com.aurionpro.decorator.model.StandardHat;

public class HatDecoratorTest {
	public static void main(String[] args) {
		IHat standardhat=new StandardHat();
		IHat premiumhat=new PremimumHat();
		HatDecorator silverhat=new SilverHat(standardhat);
		System.out.println(silverhat.getPrice());
		HatDecorator goldenhat=new GoldenHat(premiumhat);
		System.out.println(goldenhat.getPrice());
		
	}

}
