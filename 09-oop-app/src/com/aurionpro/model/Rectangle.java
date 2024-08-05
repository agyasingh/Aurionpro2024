package com.aurionpro.model;
//height,width>intialize,displayarea
public class Rectangle {
	int length;
	int breadth;
	
	
	public Rectangle() {
		 this.length=10;
		 this.breadth=20;	
	 }
	
	public Rectangle(int l,int b) {
		this.length=l;
		this.breadth=b;	  
	}
	
	
	public int getLength() {
		return length;
	}
	
	public int getBreadth() {
		return breadth;
	}
	
	public int area() {
	 return length * breadth;
	}

}
