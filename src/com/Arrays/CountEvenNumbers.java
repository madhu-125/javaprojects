package com.Arrays;

import java.util.Scanner;

public class CountEvenNumbers {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the Array Size Number");
//		int a = sc.nextInt();
//		int num[] = new int[a];
//		System.out.println("Enter " + a + " elements");
//
//		for (int i = 0; i < a; i++) {
//			num[i] = sc.nextInt();
//		}
//
//		int even = 0;
//		int odd = 0;
//		for (int i = 0; i < a; i++) {
//			if (num[i] % 2 == 0) {
//				even++;
//			} else {
//				odd++;
//			}
//		}
		
		int num[]= {
				11,23,76,99,87,65,446,21,1,2,3,90
		};
		int even =0;
		int odd=0;
		for(int n:num) {
			if(n%2==0) {
				even++;
			}else {
				odd++;
			}
		}
	
		System.out.println("The Even Number are : " + even);
		System.out.println("The odd Number are : " + odd);

	}

}
