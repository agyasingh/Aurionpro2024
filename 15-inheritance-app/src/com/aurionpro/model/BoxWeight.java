package com.aurionpro.model;

public class BoxWeight extends Box {
private int weight;

public BoxWeight(int width, int heigth, int depth, int weight) {
	super(width, heigth, depth);
	this.weight = weight;
}
@Override
public String toString() {
	return "BoxWeight [weight=" + weight + ", getWidth()=" + getWidth() + ", getHeigth()=" + getHeigth()
			+ ", getDepth()=" + getDepth() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
			+ ", toString()=" + super.toString() + "]";
}


}
