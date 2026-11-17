package com.Arrays;

import java.util.Scanner;

public class CheckGivenNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] num = {12,32,13,43,54,75,78,9,0,5,};
		System.out.println("Check the Number");
		int n=sc.nextInt();
		boolean status=false;
//		for(int a:num) {
//			if(a==n) {
//				status=true;
//				System.out.println("The given Number "+n+" is Found from Array" );
//				break;
//			}
//		}
		
		
		for(int i=0;i < num.length;i++) {
			if(num[i]==n) {
				status=true;
				System.out.println("The given Number "+n+" is Found from Array" );
				break;
			}
		}
		if(!status) {
			System.out.println("The given Number "+n+ " is Not Found from Array");
		}
	}

}
