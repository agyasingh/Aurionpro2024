package com.aurionpro.adapter.model;

public class Biscuit implements IItems {
	private String name;
	private int price;

	
	public void setName(String name) {
		this.name = name;
	}

	
	public void setPrice(int price) {
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
		return this.price;
	}


	@Override
	public String toString() {
		return "Biscuit [name=" + name + ", price=" + price + "]";
	}
	

}
