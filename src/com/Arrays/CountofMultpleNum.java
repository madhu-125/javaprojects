package com.Arrays;

import java.util.Scanner;

public class CountofMultpleNum {

	public static void main(String[] args) {
		int[] num = { 2, 33, 65, 7, 8, 98, 98, 9, 4, 2, 30, 55, 65 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A number");
		int n = sc.nextInt();
		int count = 0;

		for (int i = 0; i < num.length; i++) {
			count++;
			if (num[i] == n) {
				System.out.println("element " + num[i]);
				System.out.println("Element index value" + count);
			}
		}
		System.out.println("invaild");

	}

}
