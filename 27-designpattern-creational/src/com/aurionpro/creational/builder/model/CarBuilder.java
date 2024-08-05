package com.aurionpro.creational.builder.model;

public class CarBuilder {
    protected String make;
    protected String model;
    protected int year;
    protected String color;
    protected String engineType;
    protected boolean sunroof;
    protected boolean gps;
    protected boolean bluetooth;
    protected int numberOfDoors;

    public CarBuilder(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public CarBuilder year(int year) {
        this.year = year;
        return this;
    }

    public CarBuilder color(String color) {
        this.color = color;
        return this;
    }

    public CarBuilder engineType(String engineType) {
        this.engineType = engineType;
        return this;
    }

    public CarBuilder sunroof(boolean sunroof) {
        this.sunroof = sunroof;
        return this;
    }

    public CarBuilder gps(boolean gps) {
        this.gps = gps;
        return this;
    }

    public CarBuilder bluetooth(boolean bluetooth) {
        this.bluetooth = bluetooth;
        return this;
    }

    public CarBuilder numberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
        return this;
    }
    
//The build() method in the CarBuilder class has a
//return type of Car because its purpose is to create and 
//return a fully constructed instance of the Car class.
//This is a key aspect of the Builder pattern: the
//builder class assembles the 
// object and then returns it when the build() method is called.
//. It takes all the values that have been set in the builder and uses them to create a new Car object.
//This allows the client code to immediately use 
//the constructed Car object.
    public Car build() {
        return new Car(this);
    }
}
