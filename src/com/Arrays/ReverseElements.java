package com.Arrays;

public class ReverseElements {

	public static void main(String[] args) {
		int[] arr = { 11, 12, 13, 14, 15, 16 };
		String[] rev = { "11", "12", "13", "14", "15", "16" };
		for (int i = arr.length - 1; i >= 0; i--) {

			System.out.println(new StringBuilder(arr[i]).reverse().toString());
			System.out.println(rev[i]);

		}

			}
}
