package com.Arrays;

import java.util.Arrays;

public class SumPreviousElement {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50, 60 };
		int[] num = new int[arr.length];

		for (int i = 0; i < arr.length; i += 1) {

			if (i == 0) {
				num[i] = arr[i] + arr[i + 1];
			} else if (i == arr.length - 1) {
				num[i] = arr[i - 1] + arr[i];
			} else {
				num[i] = arr[i - 1] + arr[i + 1];
			}

		}
		System.out.println(Arrays.toString(num));
	}

}
