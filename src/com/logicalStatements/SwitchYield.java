package com.logicalStatements;

import java.util.Scanner;

public class SwitchYield {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your marks.");
		int mark = sc.nextInt();
		
		String Grade = switch (mark / 60) {
		case 9 -> {
			System.out.println("we are using Yield key word");
			yield "A";
		}
		case 8 -> "B";
		case 7 -> "c";
		case 6 -> "D";
		case 5, 4 -> "E";
		case 3,2,1 -> "F";
		default ->"Your entered the invaild marks";
		};
		System.out.println("Your Grade is : " + Grade);
	}
}