package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EvenorOdd {

	public static void main(String[] args) {
		int[] arr = { 12, 32, 13, 42, 123, 134, 521, 65, 56, 87, 78 };
		
//		for(int a:arr) {
//			if(a%2==0) {
//				System.out.println(a);
//			}
//		}
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==1) {
				System.out.println(arr[i]);
			}
		}
	}
}
