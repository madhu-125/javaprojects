package com.ChatGPTPrograms;

import java.util.Scanner;

public class NumberCheck {
	
	public static void main(String [] args ) {
		String yn="";
		
		do {
			Scanner ma = new Scanner(System.in);
			System.out.println("Enter the  A value : ");
			int a = ma.nextInt();
			System.out.println("Enter the B Value");
			int b =ma.nextInt();
			
			if(a > b) {
				System.out.println(a + " is greater than " + b);
			}else {
				System.out.println(a + " is less than " + b);
			}
			System.out.println("Do you want to continue . ?, Click the Yes / No");
			yn = ma.next();
		}while(yn.equalsIgnoreCase("yes"));
		System.out.println("closed the Compared .");
	}

}
