package com.logicalStatements;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		String yn ="";
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the X value");
			int x = sc.nextInt();

			System.out.println("Enter the Y value");
			int y = sc.nextInt();

			System.out.println("Enter the Operators like : - + / % * ");
			char oper = sc.next().charAt(0);

			int result =0;

			switch (oper) {
			case '+' -> result = x + y;
			case '-' -> result = x - y;
			case '/' -> result = x / y;
			case '%' -> result = x % y;
			case '*' -> result = x * y;
			default -> System.out.println("Your are entered invalid Symbol");
			
			}
			System.out.println("The result value is : " + result);
			
			System.out.println("Do you want to continue . ?, Click the Yes / No");
			yn = sc.next();
		}while(yn.equalsIgnoreCase("yes"));
		
		System.out.println("Closed the Calculators");
	}

}
