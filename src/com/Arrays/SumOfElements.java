package com.Arrays;

public class SumOfElements {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, };

		int[] sum = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			int result = 0;
			for (int j = 0; j < arr.length; j++) {
				if (i != j) {
					result = result + arr[j];
				}
				sum[i] = result;
			}
		}
		for (int s : sum) {
			System.out.print(s + " ");
		}

	}
}
