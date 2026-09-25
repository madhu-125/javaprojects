package in.Decision_Making;

import java.util.Scanner;

public class Marks {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("What is your Online Test..?");
		int mark = sc.nextInt();
		if(mark ==0 && mark< 35) {
			System.out.println("fail");
		}	
		else if(mark >= 35 && mark < 50) {
			System.out.println("Just pass");
		}
		else if(mark >= 50 && mark < 75) {
			System.out.println("second class");
		}
		else if (mark >= 75 && mark <= 100) {
			System.out.println("first class");	
		}
	sc.close();
	}
}