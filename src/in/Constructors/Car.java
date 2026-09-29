package in.Constructors;

class Vehicle {
	String type;

	Vehicle(String type) {

		this.type = type;
		System.out.println("Vehicle type is : " + type);
		System.out.println("------------------------------------------------");
	}
}

class Car extends Vehicle {
	String brand;
	double price;

	Car(String type, String brand, double price) {
		super(type);
		this.brand = brand;
		this.price = price;

		System.out.println("Vehicle type is : " + type);
		System.out.println("Vehicle brand is : " + brand);
		System.out.println("Vehicle price is : " + price);
		System.out.println("------------------------------------------------");
	}
}

class ElectricCar extends Car {
	int battery;

	ElectricCar(String type, String brand, double price, int battery) {
		super(type, brand, price);
		this.battery = battery;

		System.out.println("Vehicle type is : " + type);
		System.out.println("Vehicle brand is : " + brand);
		System.out.println("Vehicle price is : " + price);
		System.out.println("Vehicle battery is : " + battery + "Km" );
		System.out.println("------------------------------------------------");
	}

	public static void main(String[] args) {
		
//		Car c = new Car("petrol", "TATA", 320000);

		ElectricCar e = new ElectricCar("EV","ZYPP",55000,60);
	}

}