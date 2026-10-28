package com.ChatGPTPrograms;

import java.util.Scanner;

public class FindtheGreatherthan {

	public static void main(String[] args) {
		String yes ="";
		do {
			Scanner ma = new Scanner(System.in);
			System.out.println("Enter the a Value");
			int a = ma.nextInt();
			
			System.out.println("Enter the b Value");
			int b = ma.nextInt();
			
			System.out.println("Enter the c Value");
			int c = ma.nextInt();
			if(a>b && a>c) {
				System.out.println("A value is Higest Value : "+ a);
			}else if(b>a && b>c) {
				System.out.println("B value is Higest Value : " + b);
			}else {
				System.out.println("C value is Higest Value : "+ c);
			}
			
			System.out.println("Do you continue Find the highest Value.? Type the Yes / No");
			yes=ma.next();
		}while(yes.equalsIgnoreCase("yes"));
	}

}
