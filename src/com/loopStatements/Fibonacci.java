package com.loopStatements;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a value");
		int a = sc.nextInt();
		
		int n =0;
		int n1=1;
		
		System.out.print(n + " " + n1);
		for(int i=0;i<=a;i++ ) {
			
			int n2 = n + n1;
			System.out.print( "  " +n2);
			n=n1;
			n1=n2;
		}

	}

}
