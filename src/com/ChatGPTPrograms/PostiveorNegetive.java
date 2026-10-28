package com.ChatGPTPrograms;

import java.util.Scanner;

public class PostiveorNegetive {

	public static void main(String[] args) {
		String yn = "";
		
		do {
			Scanner m = new Scanner(System.in);
			System.out.println("Enter the Number");
			int number = m.nextInt();
			if(number >= 0) {
				System.out.println("The given Number is Postive");
			}else {
				System.out.println("The given Number is Negetive");
			}
			System.out.println("Do you want continue comparing ..? Click yes /No");
			yn = m.next();
			
		}while(yn.equalsIgnoreCase("yes"));
		System.out.println("Checking Stop.");
	}

}
