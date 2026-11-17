package com.Inheritance;

public class Car1 extends Vehicle1 {
	int speed=100;
	
	@Override
	void display() {
		System.out.println("The Car speed is : "  +speed);
	}

}
