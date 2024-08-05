package com.aurionpro.model;

/*Properties of Enum in Java
There are certain properties followed by Enum as mentioned below:

Every enum is internally implemented by using Class.
Every enum constant represents an object of type enum.
Enum type can be passed as an argument to switch statements.
Every enum constant is always implicitly public static final. Since it is static, we can access it by using the enum Name. Since it is final, we can’t create child enums.
We can declare the main() method inside the enum. Hence we can invoke the enum directly from the Command Prompt.
*/
enum Color{
	RED,
	GREEN,
	BLUE;
}
public class Enums {
	
public static void main(String[] args) {
	Color c1=Color.RED;
	System.out.println(c1);
}
}
