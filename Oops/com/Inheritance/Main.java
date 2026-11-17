package com.Inheritance;

public class Main {

	public static void main(String[] args) {
//		car details call
		Car c = new Car("BMW", 260);
		c.start();
		c.display();
		c.stop();
		c.sunRoof();

//		Bike details call

		Bike b = new Bike("Yamaha", 140);
		b.start();
		b.display();
		b.stop();
		b.wheelie();

//		Truck details call

		Truck t = new Truck("Ashoka Leland", 180);
		t.start();
		t.display();
		t.stop();
		t.load();
	}
}
