package com.aurionpro.model;

public class TypeCasting {
public static void main(String[] args) {
	int a=10;
	byte b=20;
	byte c= (byte)(a+b);//Type promotion:converting a+b into byte.a-1 byte, b>4 byte then the whole expression is evaluated as integer.
	System.out.println(c);
}
}
