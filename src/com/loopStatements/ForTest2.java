package com.loopStatements;

import java.util.Scanner;

public class ForTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		int result = 2;
		for (int i = 0; i < num; i++) {
			System.out.println(result);
			result = result * 2;
			
		}
	}

}
