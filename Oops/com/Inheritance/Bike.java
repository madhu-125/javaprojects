package com.Inheritance;

public class Bike extends Vehicle {

	Bike(String name, int speed) {
		super(name, speed);
	}
	public void wheelie() {
		System.out.println("This bike cen do a do Wheelie");
		System.out.println("*********************************");
	}

}
