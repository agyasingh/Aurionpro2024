package com.aurionpro.creational.builder.model;

public class Car {
    private String make;
    private String model;
    private int year;
    private String color;
    private String engineType;
    private boolean sunroof;
    private boolean gps;
    private boolean bluetooth;
    private int numberOfDoors;

    // Private constructor to restrict instantiation
    public Car(CarBuilder builder) {
        this.make = builder.make;
        this.model = builder.model;
        this.year = builder.year;
        this.color = builder.color;
        this.engineType = builder.engineType;
        this.sunroof = builder.sunroof;
        this.gps = builder.gps;
        this.bluetooth = builder.bluetooth;
        this.numberOfDoors = builder.numberOfDoors;
    }
//    Private Constructor in Car:
//
//    	The constructor private Car(CarBuilder builder) is private and can only be called from within the Car class.
//    	Builder Method in CarBuilder:
//
//    	The CarBuilder class has a build() method that returns a new Car instance by calling the private constructor: return new Car(this);.
//    	Since CarBuilder is defined in the same package (com.example.car), it has package-private access to the private members of Car.
//    	Package-Level Access:
//
//    	Classes within the same package can access each other's package-private and protected members.
//    	The CarBuilder class is able to call the private constructor of Car because it is in the same package.
//    	By placing Car and CarBuilder in the same package, you allow CarBuilder to call the private constructor of Car through the build()
//    	method. This design ensures that Car objects can only be created in a controlled manner, while still allowing flexibility in object creation via the builder pattern.
//    

	@Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", engineType='" + engineType + '\'' +
                ", sunroof=" + sunroof +
                ", gps=" + gps +
                ", bluetooth=" + bluetooth +
                ", numberOfDoors=" + numberOfDoors +
                '}';
    }
}
