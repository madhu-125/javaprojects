package com.Arrays;

import java.util.Arrays;

public class FindDuclpicateElements {

	public static void main(String[] args) {
		int[] arr = { 12, 23, 34, 54, 56, 12, 34, 54, 56, 87, 9 };
		System.out.println("before Find Array Elements :");
		System.out.println(Arrays.toString(arr));

		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = i + 1; j < arr.length; j++) {
				count++;
				if (arr[i] == arr[j]) {
					System.err.print(" " + arr[i] + " ");
//					System.out.println("-- " + count);
					break;
				}
			}
		}

	}

}
