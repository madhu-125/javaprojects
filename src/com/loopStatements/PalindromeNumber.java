package com.loopStatements;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = sc.nextInt();
//		boolean rev =palind(n);
		int original = n;
		int reverse = 0;
		
		
		while (n != 0) {
			int digits = n % 10;
			n = n / 10;
			
			reverse = reverse*10 + digits;
		}
//		System.out.println(reverse);
		if(original==reverse) {
			System.out.println("The given Number is Palindrome ");
		}else {
			System.out.println("The given Number is not Palindrome ");
		}
	}
//	static boolean palind(int n) {
//		boolean status = false;
//		
//		
//		
//		return status;
//	}

}
