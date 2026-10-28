package com.logicalStatements;

import java.util.Scanner;

public class Ages {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your's age");
		int age = sc.nextInt();

		if (age <= 0 || age < 130) {
			System.out.println(" Your Entered invalid age .");
		} else if (age > 61 && age <= 130) {
			System.out.println("old age");
		} else if (age >= 36 && age <= 60) {
			System.out.println("Middle age");
		} else if (age >= 20 && age <= 35) {
			System.out.println("Young age");
		} else if (age >= 13 && age <= 19) {
			System.out.println("Teenage");
		} else if (age > 5 && age <= 12) {
			System.out.println("Childrens age");
		} else if (age > 0 && age <= 5) {
			System.out.println("kids age");
		}
		sc.close();
	}

}
