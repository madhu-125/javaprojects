package com.loopStatements;

import java.util.Scanner;

public class ForTest3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = sc.nextInt();

		int result = 0;
		for (int i = 0; i < n; i++) {
			result = result + i;
			System.out.println(result);

		}

	}

}
