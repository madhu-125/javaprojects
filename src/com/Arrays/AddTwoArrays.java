package com.Arrays;

import java.util.Arrays;

public class AddTwoArrays {

	public static void main(String[] args) {
		int[] b = { 12, 11, 43, 64, 96 };
		int[] a = { 0, 75, 87, 35, 13, 2, 4, 5 };

		int[] c = new int[9];

		for (int i = 0; i < b.length; i++) {
			c[i] = (a[i] + b[i]);
		}
		System.out.println(Arrays.toString(c));
	}

}
