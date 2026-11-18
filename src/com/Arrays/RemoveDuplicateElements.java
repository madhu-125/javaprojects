package com.Arrays;

import java.util.Arrays;

public class RemoveDuplicateElements {
	public static void main(String[] args) {

		int[] arr = { 12, 23, 34, 54, 56, 12, 34, 54, 56, 87, 9 };

		System.out.println("Before Sorting Arrays:");
		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			boolean duplicate = false;
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					duplicate = true;
					break;
				}
			}
			if (!duplicate) {
				System.out.print(" " + arr[i] + " ");
			}
		}
	}

}