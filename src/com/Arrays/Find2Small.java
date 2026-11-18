package com.Arrays;

public class Find2Small {

	public static void main(String[] args) {
		int[] arr = { 16,23, 43,54, 89, 12, 21, 3, 9, 87 };

		int min = arr[0];
		int secmin = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				secmin = min;
				min = arr[i];
			}else if(arr[i]<secmin) {
				secmin=arr[i];
			}
		}
		System.out.println(secmin);
		

	}
}
