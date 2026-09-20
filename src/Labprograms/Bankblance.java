package Labprograms;

import java.util.Scanner;

//		Write a program by using methods and No parameters and With Return Value
//  3 methiods
public class Bankblance {
	double balance = 100000;
	Scanner sc = new Scanner(System.in);

	void main() {
		System.out.println("Your Transction Started ");
		System.out.println("Enter The Your Withdraw Amount : ");
		withdraw();
		System.out.println("After Withdraw Your currently balance : "+ balance);
		System.out.println("Enter The Your Deposit Amount : ");
		deposit();
		System.out.println("After Deposit your Currently balance : " + balance);
		Checkbalance();
		System.out.println(" Your Transcation Successfully Completed");
	}

	double withdraw() {
		double wb = sc.nextDouble();
		if(balance >= wb) {
			balance = balance - wb;
		}
		else {
			System.out.println("Your Entering Insufficent balance");
		}
		  return balance; 
	  }

	double deposit() {
		double dp = sc.nextDouble();
		if(dp >= 100) {
			balance = balance + dp;
		}
		else {
			System.out.println("Maximum Deposit Amount is 100 Rupees");
			
		}
		return balance;
	}

	double Checkbalance() {
		System.out.println("Your Currently Blance : " + balance);
		return balance;

	}
}
