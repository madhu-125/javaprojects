package com.Inheritance;

public class Truck extends Vehicle {

	Truck(String name, int speed) {
		super(name, speed);
	}

	public void load() {
		System.out.println("Truck can load laodCargo.");
		System.out.println("*********************************");
	}
}
