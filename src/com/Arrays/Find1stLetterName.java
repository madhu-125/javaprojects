package com.Arrays;

import java.util.Scanner;

public class Find1stLetterName {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Array size :");
		int n =sc.nextInt();
		
		String []names=new String[n];
		System.out.println("Enter the "+n +" Names");
		
		for(int i=0;i<n;i++) {
			names[i]=sc.next();
		}
		for(String a:names) {
			if(a.startsWith("m") && a.endsWith("u")) {
				System.out.println(a);
			}
		}
	}

}
