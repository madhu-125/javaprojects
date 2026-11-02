package Labprograms;

import java.util.Scanner;

public class Print1to20 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();
		
//		for(int i=1;i<=n;i++)
//		{
//			System.out.println(i);
//		}
		
//		for(int i=1;i<=n;i++) {
//			if(i%2==0) {
//				System.out.println("You are entered even : " + i);
//			}
//		}
		for(int i=1;i<=n;i++) {
			if(n %3==0 && n % 5==0) {
				System.out.println("the give number is divisible by 3 and 5");
			}
			else {
				System.out.println("the give number is not divisible by 3 and 5");
			}
		}
	
	}

}
