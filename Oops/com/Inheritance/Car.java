package com.Inheritance;

public class Car extends Vehicle {

	public Car(String name, int speed) {
		super(name, speed);
	}

	public void sunRoof() {
		System.out.println("This Car Own special behavior is SunRoof.");
		System.out.println("*********************************");
	}

}
