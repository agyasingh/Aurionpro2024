package com.aurionpro.model;

public class Hardisk {
	private int capacity;

	public Hardisk(int capacity) {
		super();
		this.capacity = capacity;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		return "Hardisk [capacity=" + capacity + "]";
	}
	
	

}
