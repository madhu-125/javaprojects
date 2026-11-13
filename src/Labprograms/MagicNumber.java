package Labprograms;

import java.util.Scanner;

public class MagicNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();

		int r = 0;

		while (n > 9) {
			int sum = 0;

			while (n > 0) {
				r = n % 10; // 123 %10 =3,
				n = n / 10; // 123/10=12
				sum = sum + r;

				
			}
			n = sum;

		}
		if (n == 1) {
			System.out.println("The given Number is  Magic Number ");
		} else {
			System.out.println("The given Number is not Magic Number");
		}
	}
}