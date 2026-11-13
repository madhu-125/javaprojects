package com.logicalStatements;

import java.util.Scanner;

public class NeonNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n =sc.nextInt();
		
		int mul = n*n;
		
		int result=0;
		
		while(mul!=0) {
			result=mul%10+result;
			mul=mul/10;
		
		}

		if(result==n) {
		System.out.println("The given Number is Neon Number " + result);
		}else {
			System.out.println("The given Number is Not"
					+ " Neon Number " + result);
		}
		
	}

}
