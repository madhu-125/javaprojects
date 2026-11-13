package com.Arrays;

import java.util.Scanner;

public class FindNameFirst {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Array Size");
		int n = sc.nextInt();
		String[] names = new String[n];

		System.out.println("Enter the " + n + " elements");

		for (int i = 0; i < n; i++) {
			names[i] = sc.next();
		}

		for (int i = 0; i < n; i++) {
			if (names[i].toLowerCase().startsWith("m") || names[i].endsWith("n")) {
				System.out.println(names[i]);
			}
		}

	}

}
