package in.Constructors;

import java.util.Scanner;

public class Product {
	int product_id;
	String product_name;
	double price;
	
	Product(){
		this(0);
	}

	Product(int product_id) {
		this(product_id,"unknown");
	}

	Product(int product_id,String product_name) {
		this(product_id,product_name,0);
	}

	Product(int product_id,String product_name,double price) {
		this.product_id = product_id;
		this.product_name = product_name;
		this.price = price;
	}
	
	void Product_info() {
		System.out.println("The Product Id is : "+ product_id);
		System.out.println("The Product name is : "+ product_name);
		System.out.println("The Product price is : "+ price);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		Product p = new Product();
//		p.Product_info();
		
		System.out.println("Enter the Product Id :");
		int product_id = sc.nextInt();
		
		System.out.println("Enter the Product name :");
		String product_name = sc.next();
		
		System.out.println("Enter the Product price :");
		double price = sc.nextDouble( );
		
		Product p1 = new Product(product_id,product_name,price);
		
		
		p1.Product_info();

	}

}
