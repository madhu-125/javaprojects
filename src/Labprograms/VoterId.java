package Labprograms;

import java.util.Scanner;

public class VoterId {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Are You Indian citizen .?, true / false");
		boolean indian = sc.nextBoolean();
		
		System.out.println("what is your age");
		int age = sc.nextInt();
		
		System.out.println("Do you have a Voter Id.!, ture/false");
		boolean voterId = sc.nextBoolean();
		
		if (!indian) {
			System.out.println("Your are not Eligible for vote because your not indian citizen.");
		}else if(age < 0) {
			System.out.println("your entered invalid age So, please enter the correct age");
		}else if(age < 18) {
			System.out.println("wait for coming 18 year old");
		}else if (!voterId) {
			System.out.println("Voter Id is required");
		}else {
			System.out.println("Your eligible to vote");
		}
		sc.close();
	}

}
