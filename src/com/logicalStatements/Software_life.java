package com.logicalStatements;

import java.util.Scanner;

public class Software_life {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("What is this day..?");
		String dayname = sc.nextLine();

		if (dayname.equalsIgnoreCase("monday") || dayname.equalsIgnoreCase("tuesday")
				|| dayname.equalsIgnoreCase("wensday") || dayname.equalsIgnoreCase("thursday")
				|| dayname.equalsIgnoreCase("friday")) {
			System.out.println("Uff this working day ..!");
		} else if (dayname.equals("sunday") || dayname.equals("saturday")) {
			System.out.println("WOw this is week_end ..!");
		}
		sc.close();
	}
}
