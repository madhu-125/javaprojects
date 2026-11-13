package com.loopStatements;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {

		String yn = "";
		do {
			Random g = new Random();
			int guess = g.nextInt(10 + 1);
			System.out.println(guess);
			Scanner sc = new Scanner(System.in);

			for (int i = 0; i < 3; i++) {
				System.out.println("Guess The Random Number : ");
				int num = sc.nextInt();

				if (guess > num) {
					System.out.println("Your Gussed Number is Low");
				} else if (guess < num) {
					System.out.println("Your Gussed Number is High");
				} else if (guess == num) {
					System.out.println("Your Gussed the Correct Number");
					break;
				}
			}
			System.out.println("Game is over.!");
			System.out.println("***************************************");
			System.out.println("Do you play Again .");
			yn = sc.next();
		} while (yn.equalsIgnoreCase("y"));
	}
}
