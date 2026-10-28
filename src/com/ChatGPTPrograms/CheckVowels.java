package com.ChatGPTPrograms;

import java.util.Scanner;

public class CheckVowels {

	public static void main(String[] args) {
		String yn = "";

		do {
			Scanner m = new Scanner(System.in);
			System.out.println("Enter the Character");
			String c = m.next();
			if (c.equalsIgnoreCase("a") || c.equalsIgnoreCase("e") || c.equalsIgnoreCase("i") || c.equalsIgnoreCase("o")
					|| c.equalsIgnoreCase("u")) {
				System.out.println("The given Character is Vowel");
			} else {
				System.out.println("The given Character is Alphabet");
			}
			System.out.println("Do you want continue comparing ..? Click yes /No");
			yn = m.next();

		} while (yn.equalsIgnoreCase("yes"));
		System.out.println("Checking Stop.");

	}

}
