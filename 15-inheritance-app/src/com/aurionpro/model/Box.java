package com.aurionpro.model;

public class Box {
private int width;
private int heigth;
private int depth;
public int getWidth() {
	return width;
}
public void setWidth(int width) {
	this.width = width;
}
public int getHeigth() {
	return heigth;
}
public void setHeigth(int heigth) {
	this.heigth = heigth;
}
public int getDepth() {
	return depth;
}
public void setDepth(int depth) {
	this.depth = depth;
}
public Box(int width, int heigth, int depth) {
	super();
	this.width = width;
	this.heigth = heigth;
	this.depth = depth;
}
}
