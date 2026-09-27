package in.Decision_Making;

import java.util.Scanner;

public class Switch_even {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter the First Number :");
		int number = sc.nextInt();
		int remainder = number % 2;
		switch (remainder) {
		case 0:
			System.out.println("The given number is even ");
			break;
		case 1:
			System.out.println("The given number is Odd");
			break;
		default:
			System.err.println("The Given input is invaild");

		}
		sc.close();
	}
}
