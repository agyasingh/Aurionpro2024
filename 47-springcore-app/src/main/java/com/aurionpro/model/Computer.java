package com.aurionpro.model;

public class Computer {
	private String name;
	public Hardisk hardisk;
	
	public Computer() {
		System.out.println("Calling computer");
	}
	
	@Override
	public String toString() {
		return "Computer [name=" + name + ", hardisk=" + hardisk + "]";
	}

	public Computer(String name, Hardisk hardisk) {
		super();
		this.name = name;
		this.hardisk = hardisk;
		
		System.out.println("Inside parametrized constructor");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Hardisk getHardisk() {
		return hardisk;
	}
	public void setHardisk(Hardisk hardisk) {
		this.hardisk = hardisk;
	}
	
	
	

}


