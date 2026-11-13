package com.loopStatements;

import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = sc.nextInt();
		
		int r =0;
		int reverse=0;
		
		while(n>0) {  //234
			r = n%10;   //234%10 = 4,, 23%10 = 3 ,, 2%10 = 2
			n=n/10;		//234/10 = 23,, 23/10 = 2 ,, 2/10 = 0
			reverse=reverse*10+r; // 0*10+4=4,  4*10+3=43  ,43*10+2 =432
		}
		System.out.println(reverse);
	}
}
