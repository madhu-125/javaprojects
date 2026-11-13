package com.loopStatements;

import java.util.Scanner;

public class ForTest1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number");
		int num =sc.nextInt();
		int result=0;
		for(int i=1;i<num;i++) {
			if(i%2==1) {
			 result = result+i;
			System.out.println(result);
			}
		} 
	}

}
