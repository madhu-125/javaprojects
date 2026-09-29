package in.Constructors;

public class Bike_chaining {
	static String bike_brand;
	static String bike_model;
	static String color;
	static double price;
	static int year;

	Bike_chaining() {
		this.bike_brand= "unknown";
		this(bike_brand);
		
	}
// 
	Bike_chaining(String bike_brand) {
		this(bike_brand, "unknown");
	}

	Bike_chaining(String bike_brand, String bike_model) {
		this(bike_brand,bike_model, "unknown");
		
//		this.bike_model = bike_model;
		
			}

	Bike_chaining(String bike_brand, String bike_model, String color) {
		this(bike_brand,bike_model, color, 500000.0);
//		this.color=color;
	}

	Bike_chaining(String bike_brand, String bike_model, String color, double price) {
		
		this(bike_brand, bike_model, color, price, 1990);
//		this.price=price;
//		System.out.println("3 constructor calling ");
	}

	Bike_chaining(String bike_brand, String bike_model, String color, double price, int year) {
		
		
		
		this.bike_brand = bike_brand;
		this.bike_model = bike_model;
		this.color = color;
		this.price = price;
		this.year = year;
//		System.out.println("4 constructor calling ");

	}

	public static void main(String[] args) {
		Bike_chaining b = new Bike_chaining();
		b.Bike_info();

		Bike_chaining b1 = new Bike_chaining("Hero");
		b1.Bike_info();

		Bike_chaining b2 = new Bike_chaining("Hero", "TVS");
		b2.Bike_info();
		
		Bike_chaining b3 = new Bike_chaining("Hero", "TVS", "BLACK");
		b3.Bike_info();
		
		Bike_chaining b4 = new Bike_chaining("Hero", "Grammer", "Black_Red", 105000);
		b4.Bike_info();

		Bike_chaining b5 = new Bike_chaining("Hero", "Unican", "Black", 175000, 2026);
		b5.Bike_info();

	

	}

	void Bike_info() {
		System.out.println("**********************************************************************");
		System.out.println("Bike brand name : " + bike_brand);
		System.out.println("Bike model name : " + bike_model);
		System.out.println("Bike color : " + color);
		System.out.println("Bike Price : " + price);
		System.out.println("Bike Model year : " + year);
		

	}

}
