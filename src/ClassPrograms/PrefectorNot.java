package ClassPrograms;

import java.util.Scanner;

public class PrefectorNot {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number");
	
	int n = sc.nextInt();

	boolean status = find(n);
	if(status) {
		System.out.println("the given number is perfect");
	}else {
		System.out.println("the given number is not-perfect");
	}
	}
	
	static boolean find(int n) {
		boolean status=false;
		int sum = 0;
		
		for (int i=1;i<=n/2 ; i++) {
			sum = sum + i;
			if(n ==sum) {
				status=true;
			}
		}
		return status;
	}

}
