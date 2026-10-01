package in.Constructors;

import java.util.Scanner;

public class ProductL {

	int product_Id;
	String product_Name;
	double price;
	int quantity;

	ProductL(int product_Id, String product_Name, double price, int quantity) {
		this.product_Id = product_Id;
		this.product_Name = product_Name;
		this.price = price;
		this.quantity = quantity;

	}

	ProductL(ProductL other, int quantity) {
		this.product_Id = other.product_Id;
		this.product_Name = other.product_Name;
		this.price = other.price;
		this.quantity = quantity;
	}

	void calculateTotal() {
		double total_Amount = price * quantity;

		System.out.println("The Product_Id : " + product_Id);
		System.out.println("The product_Name : " + product_Name);
		System.out.println("The Product price : " + price);
		System.out.println("The Product quantity : " + quantity);
		System.out.println("The Total_Amount  Products: " + total_Amount);
		System.out.println("**************************************");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the product_Id :");
		int product_Id = sc.nextInt();

		System.out.println("Enter the product_Name :");
		String product_Name = sc.next();

		System.out.println("Enter the product price :");
		double price = sc.nextDouble();

		System.out.println("Enter the product quantity :");
		int quantity = sc.nextInt();

		ProductL p = new ProductL(product_Id, product_Name, price, quantity);
		p.calculateTotal();

		System.out.println("Enter the only product quantity based on the above information calculate Total price :");
		int quantity1 = sc.nextInt();

		ProductL p1 = new ProductL(p, quantity1);
		p1.calculateTotal();

	}

}
