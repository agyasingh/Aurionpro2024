package com.aurionpro.list.model;

public class Car {
private int carId;
private String companyName;
private int price;
private int mileage;
public  int maxMileage=0;
public Car(int carId, String companyName, int price, int mileage) {
	super();
	this.carId = carId;
	this.companyName = companyName;
	this.price = price;
	this.mileage = mileage;
}
public int getCarId() {
	return carId;
}
public void setCarId(int carId) {
	this.carId = carId;
}
public String getCompanyName() {
	return companyName;
}
public void setCompanyName(String companyName) {
	this.companyName = companyName;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public int getMileage() {
	return mileage;
}
public void setMileage(int mileage) {
	this.mileage = mileage;
}
@Override
public String toString() {
	return "Car [carId=" + carId + ", companyName=" + companyName + ", price=" + price + ", mileage=" + mileage + "]";
}


}
