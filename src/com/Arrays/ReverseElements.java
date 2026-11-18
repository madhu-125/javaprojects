package com.Arrays;

public class ReverseElements {

	public static void main(String[] args) {
		int[] arr = { 11, 12, 13, 14, 15, 16,32,12,65,87 };
//		String[] rev = { "11", "12", "13", "14", "15", "16" };
//		for (int i = arr.length - 1; i >= 0; i--) {
//
//			System.out.println(new StringBuilder(arr[i]).reverse().toString());
//			System.out.print(rev[i]+" ");
//
//		}

		int n=0;
		int[] num = new int[arr.length];
		for (int i = arr.length-1; i >= 0; i--) {
			for (int j = 0; j < arr.length; j++) {
			num[j] = arr[i];
			n=num[j];
			}
			System.out.println(n);
		}
	

//		for (int i = arr.length - 1; i >= 0; i--) {
//			System.out.println(arr[i]);
//		}
	}
}
