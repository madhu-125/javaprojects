package ClassPrograms;

import java.util.Scanner;

public class factoriesNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int a = sc.nextInt();
		FindNumber(a);
		
	}
//	static void FindNumber(int a) {
//		for(int i = 1; i <= a; i++) {
//			if(a%i==0) {
//				System.out.print(i + " ");
//			}
//		}
//	}

	static void FindNumber(int a) {
		for(int i = 1; i <= a/2; i++) {
			if(a%i==0) {
				System.out.print(i + " ");
			}
		}
	}

}
