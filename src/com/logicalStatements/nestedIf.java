package com.logicalStatements;

import java.util.Scanner;

public class nestedIf {

	public static void main(String[] args) {
		System.err.println("Welcome to the Matrimony");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Your name :");
		String name = sc.nextLine();
		System.out.println("Nice to meet to Mr. " + name);
		
		System.out.println("what about your assets.?");
		double assets =sc.nextDouble();
		if(assets >= 20000000) {
			System.out.println("OK Lets goto continue here");
			
			System.out.println("Do you have job.?");
			boolean job = sc.nextBoolean();
			if(job) {
				System.out.println("Our are move the next step");
				
				System.out.println("How much package for You .?");
				double salary = sc.nextDouble();
				
			}else {
				System.out.println("Sorry !, Mr. " + name + "wev are Sreching job person");
			}
		}else {
			System.out.println("Sorry !, not match for your assets");
		}
	}

}
