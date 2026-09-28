package in.Constructors;

public class Moblie_bill {
	
	String moblie_model;
	double price;
	int quantity;
	double delivery_price;


	Moblie_bill() {
		this("unknown");
	}

	Moblie_bill(String moblie_model) {
		this(moblie_model,10000.0);

	}

	Moblie_bill(String moblie_model, double price) {
		this(moblie_model,price,0);

	}

	Moblie_bill(String moblie_model, double price, int quantity) {
		this(moblie_model,price,quantity,50);
	}

	Moblie_bill(String moblie_model, double price, int quantity, double delivery_price) {
		
		this. moblie_model =moblie_model;
		this. price = price;
		this .quantity = quantity;
		this. delivery_price= delivery_price;

	}

	public static void main(String[] args) {

		Moblie_bill m = new Moblie_bill();
		Moblie_bill m1 = new Moblie_bill("LAVA");
		Moblie_bill m2 = new Moblie_bill("Redmi",15000);
		Moblie_bill m3 = new Moblie_bill("Realme",18000,2);
		Moblie_bill m4 = new Moblie_bill("Oppo",32000,2,500);
		
		
		m.display();
		m1.display();
		m2.display();
		m3.display();
		m4.display();

	}
	void display() {
		double cost = price * quantity;
		double final_bill = cost + delivery_price;
		
		System.out.println("Enetr the Moblie Brand : " + moblie_model);
		System.out.println("Enetr the Moblie Name : " + price);
		System.out.println("Enetr the Moblie price : " + quantity);
		System.out.println("Enetr the Number of Moblie : " + delivery_price);
		System.out.println("Total Number of Moblies Price : " + cost);
		System.out.println("Total Finall bill including delivery charges : " + final_bill);
		System.out.println("***************************************************");
		
		
	}

}
