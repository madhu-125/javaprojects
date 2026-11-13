package com.Arrays;

import java.util.Arrays;

public class FindSecondHighN {

	public static void main(String[] args) {
		int[] arr = { 29, 7, 21, 5, 8, 26, 26, 13, 18, 81 };

		int large = 0;
		int temp = 0;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > large && large != arr[i]) {
				temp = large;
				large = arr[i];

			}
			if (arr[i] < large && arr[i] > temp) {
				temp = arr[i];
			}

		}
		System.out.println(large);
		System.out.println(temp);

	}
}
