package com.aurionpro.model;

public class Box {
	public int width;//properties of the class
	public int height;
	public int depth;
	 
	public Box() {
		this.width=10;
		this.height=20;
		this.depth=10;
	}
	
	 public Box(int width,int height,int depth) {
		 this.width=width;
		 this.height=height;
		 this.depth=depth;
	 }
	 
	//Setter methods
	
	
	public int getWidth() {
		return this.width;
	}
	
	public int getHeight() {
		return this.height;
	}
	
	public int getDepth() {
		return this.depth;
	}
	
	

	
	
 
}
