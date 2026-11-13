package com.Arrays;

import java.util.Scanner;

public class FindNthValue {

	public static void main(String[] args) {
		int[] arr = { 4, 5, 1, 6, 3 };
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Within Range: " + arr.length + " ");
		int n = sc.nextInt();

		int nthlarge = 0;

		for (int i = 1; i <= n; i++) {
			int max = Integer.MIN_VALUE;

			for (int j = 0; j < arr.length; j++) {
				if (arr[j] > max && (i == 1 || arr[j] < nthlarge)) {
					max = arr[j];
				}
			}
			nthlarge = max;
		}
		System.out.println(nthlarge);
	}

}
