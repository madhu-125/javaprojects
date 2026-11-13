package com.loopStatements;

import java.util.Scanner;

public class FizzandTable {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
//		System.out.println("Enter  a vale ");
//		int a = sc.nextInt();
//
//
//		if(i%3==0 && i%5==0) {
//			System.out.println("Fizz and Buzz");
//			}else if(i%3==0) {
//				System.out.println("Buzz");
//			}else if(i%5==0) {
//				System.out.println("Fizz");
//		}
		
//		 write a program print the multiplication table of a given number
		
		System.out.println("Which table do you want.? ");
		int a = sc.nextInt();
		System.out.println("Enter a vale how much range do you want.? ");
		int b = sc.nextInt();
		
		for( int i=1 ; i<=b;i++) {
			System.out.println(a + " X " +i + " = " + (a*i));
		}
	}	
}
