package com.ChatGPTPrograms;

import java.util.Scanner;

public class CheckLeapYear {

	public static void main(String[] args) {
		String yn = "";

		do {
			Scanner m = new Scanner(System.in);
			System.out.println("Enter the Year");
			int year = m.nextInt();
			if(year%400==0) {
				System.out.println("The given Year is Leap year");
			}else if(year%100==0){
				System.out.println("The given Year is Normal year");
			}else if(year%4==0) {
				System.out.println("The given Year is Leap year");
			}else {
				System.out.println("The given Year is Normal year");
			}
			
			System.out.println("Do you want continue Checking Years ..? Click yes /No");
			yn = m.next();
		} while (yn.equalsIgnoreCase("yes"));
		System.out.println("Checking Stop.");

	}

}
