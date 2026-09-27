package in.Constructors;

public class Car_chaining {
	String car_brand;
	String car_model;
	String color;
	double price;
	int year;

	Car_chaining() {
		car_brand = "Unknown";
		car_model = "unknown";
		color = "unknown";
		price = 500000.0;
		year = 1990;
		this("KIA");
	}

	Car_chaining(String car_brand) {
		this(car_brand, "nexon");
	}

	Car_chaining(String car_brand, String car_model) {
		this(car_brand, "nexon", "Grey");
	}

	Car_chaining(String car_brand, String car_model, String color) {
		this(car_brand, "nexon", "Grey", 1750000.0);
	}

	Car_chaining(String car_brand, String car_model, String color, double price) {
		this(car_brand, "nexon", "Grey", 1750000.0, 2025);
	}

	Car_chaining(String car_brand, String car_model, String color, double price, int year) {
		this.car_brand = car_brand;
		this.car_model = car_model;
		this.color = color;
		this.price = price;
		this.year = year;

	}

	public static void main(String[] args) {
		Car_chaining c = new Car_chaining();
		Car_chaining c1 = new Car_chaining("KIA");
		Car_chaining c2 = new Car_chaining("KIA", "nexon");
		Car_chaining c3 = new Car_chaining("KIA", "nexon", "Grey");
		Car_chaining c4 = new Car_chaining("KIA", "nexon", "Grey", 1750000);
		Car_chaining c5 = new Car_chaining("TATA", "nexon", "Grey", 1750000, 2026);

		c.Car_info();
		c1.Car_info();
		c2.Car_info();
		c3.Car_info();
		c4.Car_info();
		c5.Car_info();

	}

	void Car_info() {
		System.out.println("Car brand name : " + car_brand);
		System.out.println("Car model name : " + car_model);
		System.out.println("Car color : " + color);
		System.out.println("Car Price : " + price);
		System.out.println("Car Model year : " + year);
		System.out.println("**********************************************************************");

	}

}
