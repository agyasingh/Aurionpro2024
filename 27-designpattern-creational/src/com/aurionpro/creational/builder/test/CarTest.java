package com.aurionpro.creational.builder.test;

import com.aurionpro.creational.builder.model.Car;
import com.aurionpro.creational.builder.model.CarBuilder;
//Client code
public class CarTest {
    public static void main(String[] args) {
    	//CarBuilder used to set the fields of Car
    	//Method chaining for optional parameters.
    	//build method called on CarBuilder instance
    	//build method creates a new Car object by 
    	//passing the builder instance (this) to the Car constructor.
    	//The Car constructor uses the builder's fields to initialize the Car.
    	//The build method returns the newly constructed Car object
    
        Car car = new CarBuilder("Toyota", "Camry")
                        .year(2021)
                        .color("Red")
                        .engineType("V6")
                        .sunroof(true)
                        .gps(true)
                        .bluetooth(true)
                        .numberOfDoors(4)
                        .build();
        System.out.println(car);
    }
}


//Problem analysis-constructor overload,parameter order,optional parameters.