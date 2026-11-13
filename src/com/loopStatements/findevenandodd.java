package com.loopStatements;

import java.util.Scanner;

public class findevenandodd {
	static boolean evenprime(int n) {
		boolean status=true;
		if(n==0|| n==1) {
			return false;
		}
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				status=false;
				break;
			}
		}
		return status;
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the reange Number");
		int a = sc.nextInt();
		
		for(int i=0;i<=a;i++) {
			if(evenprime(i)) {
				System.out.println(i);
			}
		}
	}

}
