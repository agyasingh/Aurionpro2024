package com.aurionpro.model;

public class Computer {
	private String name;
	private Hardisk hardisk;
	public Computer(String name, Hardisk hardisk) {
		super();
		this.name = name;
		this.hardisk = hardisk;
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
