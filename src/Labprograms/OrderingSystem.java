package Labprograms;

import java.util.Scanner;

public class OrderingSystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double total_bill = 0;

		System.err.println("Items Memo");
		System.out.println("***********");
		System.out.println("1  -->   Pizza      -   300/-rs");
		System.out.println("2  -->   Burger     -   120/-rs");
		System.out.println("3  -->   Biryani    -   180/-rs");
		System.out.println("4  -->   Noodles    -   100/-rs");
		System.out.println("___________________________________");

		String yn = "";

		do {
			System.out.println("Please enter the Order.!");
			String item = sc.next();

			switch (item) {
			case "pizza" -> {
				System.out.println("your Ordering Pizza");
				System.out.println("Enter the quantity like 1 , 2, 3, ...");
				int quatity = sc.nextInt();
				double Tp_price = 300 * quatity;
				System.out.println("Pizza Total price : " + Tp_price);
				total_bill += Tp_price;
			}
			case "burger" -> {
				System.out.println("your Ordering Burger");
				System.out.println("Enter the quantity like 1 , 2, 3, ...");
				int quatity = sc.nextInt();
				double TB_price = 120 * quatity;
				System.out.println("Burger price : " + TB_price);
				total_bill += TB_price;
			}
			case "biryani" -> {
				System.out.println("your Ordering Biryani");
				System.out.println("Enter the quantity like 1 , 2, 3, ...");
				int quatity = sc.nextInt();
				double TBr_price = 180 * quatity;
				System.out.println("Biryani price : " + TBr_price);
				total_bill += TBr_price;
			}
			case "noodles" -> {
				System.out.println("your Ordering Noodles");
				System.out.println("Enter the quantity like 1 , 2, 3, ...");
				int quatity = sc.nextInt();
				double TN_price = 100 * quatity;
				System.out.println("Noodles price : " + TN_price);
				total_bill += TN_price;
			}
			default -> System.out.println("This Items are not Avaliable");

			}
			System.out.println("DO you want Some Orders .?, Click yes / anything");
			yn = sc.next();
		} while (yn.equalsIgnoreCase("yes"));
		System.out.println("-----------------------------------");
		System.out.println("Your Total bills is : " + total_bill);
		System.out.println("-----------------------------------");
		System.err.println("Thanks for Visting my Restaurent !");
	}

}
