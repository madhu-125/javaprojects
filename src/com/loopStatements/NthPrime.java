package com.loopStatements;

import java.util.Scanner;

public class NthPrime {
	static boolean prime(int n) {
		boolean status = true;
		if (n == 0 || n == 1) {
			return false;
		}
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				status = false;
				break;
			}
		}
		return status;
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int a =sc.nextInt();
		int count =0;
		for(int  i =0;;i++) {
			
			if(prime(i)) {
				count++;

			if(count==a)
				System.out.println(i);
			}
		}

	}

}