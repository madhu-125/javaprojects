package com.loopStatements;

import java.util.Scanner;

public class ForTest7 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number");
		int num =sc.nextInt();
		int n=0;
		for(int i=1;i<num;i++) {
			n=i*i*i;
			System.out.print(n +" ");
//			System.out.println(Math.pow(i, 3));
		}

	}

}
