package com.loopStatements;

import java.util.Scanner;

public class PrefactwithWhile {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number");
	
	int n = sc.nextInt();

	boolean status = find(n);
	if(status) {
		System.out.println("the given number is perfect");
	}else {
		System.out.println("the given number is not-perfect");
	}
	}
	
	static boolean find(int n) {
		boolean status=false;
		int sum = 0;
		int i=1;
		while (i<=n/2) {
			sum = sum + i;
			if(n ==sum) {
				status=true;
			}
		}i++;
		return status;
	}

}