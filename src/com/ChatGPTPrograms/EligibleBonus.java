package com.ChatGPTPrograms;

import java.util.Scanner;

public class EligibleBonus {

	public static void main(String[] args) {
		String yes ="";
		do {
			Scanner ma = new Scanner(System.in);
			System.out.println("Enter the Year");
			int year = ma.nextInt();
			
			if(year > 5) {
				System.out.println("Eligible for a Bonus");
			}else {
				System.out.println("Your are Not Eligible for a Bonus,wait for 5 years Experience ");
			}
			
			System.out.println("Do you continue Find the checking  Bonus.? Type the Yes / No");
			yes=ma.next();
		}while(yes.equalsIgnoreCase("yes"));
	}
}
