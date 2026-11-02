package ClassPrograms;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = sc.nextInt();

		findFact(n);

	}

	static void findFact(int n) {
		BigInteger fact = new BigInteger("1");
		for (int i = 1; i <= n; i++) {
			fact = fact.multiply(BigInteger.valueOf(i));
		}
		System.out.println("The given Factorial number is " + fact);
	}

}
