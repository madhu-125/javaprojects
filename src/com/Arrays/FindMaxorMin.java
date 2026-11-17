package com.Arrays;

public class FindMaxorMin {

	public static void main(String[] args) {
		int[] num = { 12, 32, 43, 54, 6, 798, 99, 5, 8, 9, 1 };

		int max = num[0];
		int min = num[0];

		for (int n : num) {
			if (n < min) {
				min = n;
			} else if (n > max) {
				max = n;
			}
		}
		System.out.println("Maximum : " + max);
		System.out.println("Minimum : " + min);

	}

}
