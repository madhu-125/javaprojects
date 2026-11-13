package com.loopStatements;

import java.util.Scanner;

public class PrefectorNot {
	
	public static void main(String [] Args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a Number");
		int n =sc.nextInt();
		
		boolean status=find(n);
		if(status) {
			System.out.println("The given Number is Perfect");
		}else {
			System.out.println("The given Number is not Perfect");
		}
	}
	
	static boolean find(int n) {
		boolean status=false;
		int sum=0;
		
		for(int i=1;i<=n/2;i++) {
			sum=sum+i;
			if(sum==n) {
				status=true;
			}
		}
		
		return status;
	}
}