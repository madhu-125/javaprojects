package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class NthArrayValue {
	public static void main(String[] args) {
		int[] arr = { 4, 5, 6, 1, 39, 9, 8, 5, 0, 4, };

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n for Nth Largest: ");
		int n = sc.nextInt();

		Arrays.sort(arr);

		if (n > 0 && n <= arr.length) {
			System.out.println(n + "th Largest = " + arr[arr.length - n]);
		} else {
			System.out.println("Invalid n");
		}
	}
}