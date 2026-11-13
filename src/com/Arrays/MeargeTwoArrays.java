package com.Arrays;

import java.util.Arrays;

public class MeargeTwoArrays {

	public static void main(String[] args) {

		int[] a = { 12, 11, 43, 64, 96 };
		int[] b = { 0, 75, 87, 35, 13, 2, 4, 5 };

		int[] c = new int[a.length + b.length];

//		for (int i = 0; i < a.length; i++) {
//			c[i] = a[i];
//		}
//		for (int i = 0; i < b.length; i++) {
//			c[i + a.length] = b[i];
//		}
		System.out.println(Arrays.toString(c));
	}

}
