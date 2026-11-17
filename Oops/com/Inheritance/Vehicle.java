package com.Inheritance;

public class Vehicle {

	String name;
	int speed;

	Vehicle(String name, int speed) {
		this.name = name;
		this.speed = speed;

	}

	void start() {
		System.out.println(name + " is start");
	}

	void stop() {
		System.out.println(name + " is stop");
		
	}

	void display() {
		System.out.println("Vehicle Name : " + name);
		System.out.println(name + " speed is " + speed + " kmph");
	}

}
