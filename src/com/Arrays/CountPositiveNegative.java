package com.Arrays;

import java.util.Scanner;

public class CountPositiveNegative {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size :");
		int a = sc.nextInt();

		int[] arr = new int[a];
		
		int pos=0;
		int neg=0;
		System.out.println("Enter " +a+" Elements:");
		for(int i=0;i<a;i++) {
			arr[i]=sc.nextInt();
			if(arr[i]>0) {
				pos++;
			}else {
				neg++;
			}
		}
		System.out.println("The count of Postive : "+pos);
		System.out.println("The count of neg : "+neg);

	};
}
