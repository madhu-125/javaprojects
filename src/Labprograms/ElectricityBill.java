package Labprograms;

import java.util.Scanner;

public class ElectricityBill {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the Electricity Bill Center..");
		System.out.println("__________________________________________");

		double Total_bill=0;
		String cyn = "";

		do {
			System.out.println("Enter Youor Connection type like Domestic or Commerical");
			String connection = sc.next();
			switch (connection) {
			case "dom" -> {
				System.out.println("Enter the Your Units");
				int unit = sc.nextInt();
				
				
				if(unit <= 0 ) {
					System.out.println("Your entered invaild units , So please enter the Correct units");
					System.out.println("---------------------------------------------------------------");
				}else if(unit <= 100) {
					double dlhprice=2;
					dlhprice *=unit;
					System.out.println("--------------------------------------");
					System.out.println("Your Total units bill : "+ dlhprice);
					System.out.println("--------------------------------------");
					Total_bill+=dlhprice;
				}else if(unit > 101) {
					double dhprice=3;
					dhprice *=unit;
					System.out.println("--------------------------------------");
					System.out.println("Your Total units bill : "+ dhprice);
					System.out.println("--------------------------------------");
					Total_bill+=dhprice;
				}

			}
			case "com" -> {
				System.out.println("Enter the Your Units");
				int unit = sc.nextInt();
				
				
				if(unit <= 0 ) {
					System.out.println("Your entered invaild units , So please enter the Correct units");
					System.out.println("---------------------------------------------------------------");
				}else if(unit <= 100) {
					double clhprice=4;
					clhprice *=unit;
					System.out.println("--------------------------------------");
					System.out.println("Your Total units bill : "+ clhprice);
					System.out.println("--------------------------------------");
					Total_bill+=clhprice;
				}else if(unit >= 101 && unit <= 300) {
					double chprice=6;
					chprice *=unit;
					System.out.println("--------------------------------------");
					System.out.println("Your Total units bill : "+ chprice);
					System.out.println("--------------------------------------");
					Total_bill+=chprice;
				}else if(unit > 301) {
					double cthprice=8;
					cthprice *=unit;
					System.out.println("--------------------------------------");
					System.out.println("Your Total units bill : "+ cthprice);
					System.out.println("--------------------------------------");
					Total_bill+=cthprice;
				}

			}
			default -> System.out.println("Your Entered Invaild Connection Type");
			}
			System.out.println("Do you want other Connection types.? Click yes for y or No for anything");
			cyn = sc.next();
		} while (cyn.equalsIgnoreCase("y"));
		System.out.println("******************************************");
		System.out.println("Your Total Electricity Bill : " + Total_bill );
		System.out.println("******************************************");
	}

}
