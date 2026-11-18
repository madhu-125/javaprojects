package com.Arrays;

public class SumAVGofElements {

	public static void main(String[] args) {
		int[] arr = { 0, 2, 991, 3, 4, 5, 65, 100, 200 };
//		
//		int max=arr[0];
//		int min=arr[0];
//		
//		for(int n:arr) {
//			
//			if(n<min) {
//				min=n;
//			}else if(n>max) {
//				max=n;
//			}
//		}
//		System.out.println(max);
//		System.out.println(min);
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.println("The sum of Elements Values: " + sum);
		System.out.println("The Avg Value : " + sum / arr.length);
	}

}
