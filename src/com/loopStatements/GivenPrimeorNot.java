package com.loopStatements;

import java.util.Scanner;

public class GivenPrimeorNot {
	static boolean prime(int n) {
		boolean status = true;
		if (n == 0 || n == 1) {
			return false;
		}
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				status = false;
				break;
			}
		}
		return status;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = sc.nextInt();

		if (prime(a)) {
			System.out.println("The given Number is prime Number");
		} else {
			System.out.println("the given Number is Not Prime Number");
		}
	}
}
