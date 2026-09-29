package in.Constructors;

import java.util.Scanner;

public class Moblie_bill_Sc {

	String Moblie_Brand;
	String Moblie_name;
	double Moblie_price;
	int Quantity;
	double delivery_charges;

	Moblie_bill_Sc() {
		this("unknown");
	}

	Moblie_bill_Sc(String Moblie_Brand) {
		
//		System.out.println("Enter the Moblie Brand NAme . :");
//		Moblie_Brand = sc.next();
		this(Moblie_Brand,"unknown");

	}

	Moblie_bill_Sc(String Moblie_Brand, String Moblie_name) {
		
	/**	System.out.println("Enter the Moblie Brand NAme . :");
		Moblie_Brand = sc.next();
		System.out.println("Enter the Moblie NAme . :");
		Moblie_name = sc.next();
		**/
		
		this(Moblie_Brand,Moblie_name,500);

	}

	Moblie_bill_Sc(String Moblie_Brand, String Moblie_name, double Moblie_price) {
		
	/**	System.out.println("Enter the Moblie Brand NAme . :");
		Moblie_Brand = sc.next();
		System.out.println("Enter the Moblie NAme . :");
		Moblie_name = sc.next();
		System.out.println("Enter the Moblie price . :");
		Moblie_price = sc.nextInt();
		**/
		
		this(Moblie_Brand,Moblie_name,Moblie_price,1);

	}

	Moblie_bill_Sc(String Moblie_Brand, String Moblie_name, double Moblie_price, int Quantity) {
		
	/**	System.out.println("Enter the Moblie Brand NAme . :");
		Moblie_Brand = sc.next();
		System.out.println("Enter the Moblie NAme . :");
		Moblie_name = sc.next();
		System.out.println("Enter the Moblie price . :");
		Moblie_price = sc.nextDouble();
		System.out.println("Enter the Moblie Quantity . :");
		Quantity = sc.nextInt();
		**/
		
		this(Moblie_Brand,Moblie_name,Moblie_price,Quantity,200);
	}

	Moblie_bill_Sc(String Moblie_Brand, String Moblie_name, double Moblie_price, int Quantity,
			double delivery_charges) {

	/**	System.out.println("Enter the Moblie Brand NAme :");
		Moblie_Brand = sc.next();
		System.out.println("Enter the Moblie Name :");
		Moblie_name = sc.next();
		System.out.println("Enter the Moblie price :");
		Moblie_price = sc.nextDouble();
		System.out.println("Enter the Moblie Quantity :");
		Quantity = sc.nextInt();
		System.out.println("Enter the Moblie delivery_charges :");
		delivery_charges = sc.nextDouble();
		**/
		
		this.Moblie_Brand = Moblie_Brand;
		this.Moblie_name =Moblie_name;
		this.Moblie_price = Moblie_price;
		this.Quantity =Quantity;
		this.delivery_charges = delivery_charges;
		

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		Moblie_bill_Sc mas = new Moblie_bill_Sc();
//		mas.display();
		
		System.out.println("Enter the Moblie Brand Name :");
		String Moblie_Brand = sc.next();
		
		System.out.println("Enter the Moblie Name :");
		String Moblie_name = sc.next();
		
		System.out.println("Enter the Moblie price :");
		double Moblie_price = sc.nextDouble();
		
		System.out.println("Enter the Moblie Quantity :");
		int Quantity = sc.nextInt();
		
		System.out.println("Enter the Moblie delivery_charges :");
		double delivery_charges = sc.nextDouble();
		
		Moblie_bill_Sc ms = new Moblie_bill_Sc(Moblie_Brand,Moblie_name,Moblie_price,Quantity,delivery_charges);
		
		
		ms.display();

	}
	void display() {
		double cost = Moblie_price * Quantity;
		double final_bill = cost + delivery_charges;
		
		System.out.println("Enetr the Moblie Brand : " + Moblie_Brand);
		System.out.println("Enetr the Moblie Name : " + Moblie_name);
		System.out.println("Enetr the Moblie price : " + Moblie_price);
		System.out.println("Enetr the Number of Moblie : " + Quantity);
		System.out.println("Enetr the delivery_charges : " + delivery_charges);
		System.out.println("Total Number of Moblies Price : " + cost);
		System.out.println("Total Finall bill including delivery charges : " + final_bill);
		System.out.println("***************************************************");
		
	}

}
