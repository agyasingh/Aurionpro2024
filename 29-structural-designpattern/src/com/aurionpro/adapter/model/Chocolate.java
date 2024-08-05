package com.aurionpro.adapter.model;

public class Chocolate implements IItems {
	
	private String name;
	private int price;

	public Chocolate(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	@Override
	public String getItemName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public int getItemPrice() {
		// TODO Auto-generated method stub
		return  this.price;
	}

	@Override
	public String toString() {
		return "Chocolate [name=" + name + ", price=" + price + "]";
	}

	
	public void setName(String name) {
		this.name = name;
	}

	

	public void setPrice(int price) {
		this.price = price;
	}
	
	

}
