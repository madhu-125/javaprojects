package Labprograms;

import java.util.Scanner;

//  Write a some programs using methods parameters and return value
//  7 + 13 =20
public class MethodsTest2 {
	static Scanner sc = new Scanner(System.in);

	void main(String[] args) {
		System.out.println("Main Method started");
		System.out.println("Enter Your Name :");
		String name = sc.nextLine();
		String myname = myname(name);
		System.out.println(myname);
		
		System.err.println("Enter something");
		String hw = sc.nextLine();
		String hl = Hello(hw);
		System.out.println(hl);

		System.err.println("Enter the value");
		int a = sc.nextInt();
		Number(a);

		System.err.println("Enter the Starting value");
		int a1 = sc.nextInt();
		System.err.println("Enter the Ending value");
		int b = sc.nextInt();
		Number1(a1,b);

		System.out.println("Enter the any value within 20 Numbers :");
		int n1 = sc.nextInt();
		even(n1);
		
		System.out.println("Enter the Starting Number : ");
		int e1 =sc.nextInt();
		System.out.println("Enter the Ending Number :");
		int e2 = sc.nextInt();
		even1(e1,e2);

		System.out.println("Enter the any Number for Table");
		int t = sc.nextInt();
		table(t);

		System.out.println("Enter the any Value within 20 Numbers");
		int n = sc.nextInt();
		odd(n);

		System.out.println("Enter the starting Number");
		int o = sc.nextInt();
		System.out.println("Enter the ending Number:");
		int o1 = sc.nextInt();
		odd1(o, o1);

		System.err.println("Enter the Starting value  ,Reverse Numbers");
		int r1 = sc.nextInt();
		System.err.println("Enter the Ending value  ");
		int r2 = sc.nextInt();
		reverse(r1,r2);

		System.out.println("Enter any Number");
		int r = sc.nextInt();
		reverse1(r);
		
		System.out.println("Enter the some Number");
		long lo = sc.nextLong();
		divisible(lo);
		System.out.println(lo/7);
		
		System.out.println("Enter the Dividend value");
		long l1 = sc.nextLong();
		System.out.println("Enter the Divisor value");
		long l2 = sc.nextLong();
		divisible1(l1,l2);
		System.out.println("The Quotient is : " + l1/l2);
		System.out.println("The Remainder is : " + l1%l2);


		System.out.println("Main method Ended");
	}

	static String Hello(String hw) {
		return hw;
	}

	static String myname(String name) {
		return name;
	}

// Display the user given to within 20	
	static int Number(int fn) {
		for (int a = fn; a <= 20; a++) {
			System.out.println(a);
		}
		return fn;
	}

// Display the numbers based on the user range
	static int Number1(int a1, int b) {
		for (int i = a1; i <= b; i++) {
			System.out.println(i);
		}
		return a1;
	}

//	 Display the reverse numbers based on the user range

	static long even1(int e1, int e2) {
		for (int i = e1; i <= e2; i++) {
			if (i%2 == 0) {
				System.out.println(i);
			}
		}
		return e1;
	}

//  Diplay the even numbers within 20
	static int even(int n1) {
		for (int i = n1; i <= 20; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		return n1;
	}

// 	Display the odd number within 20
	static int odd(int n) {
		for (int i = n; i <= 20; i++) {
			if (i % 2 == 1) {
				System.out.println(i);
			}
		}
		return n;
	}

//		 Display the reverse numbers based on the user range
	static long odd1(int o, int o1) {
		for (int i = o; i <= o1; i++) {
			if (i % 2 == 1) {
				System.out.println(i);
			}
		}
		return o;
	}

//		Display the Tables user given number
	static int table(int t) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(t + " X " + i + " = " + (t * i));
		}
		return t;
	}

// Display the reverse numbers based on the user range
	static int reverse(int r1, int r2) {

		for (int i = r1; i >= r2; i--) {
			System.out.println(i);
		}
		return r1;
	}

// Display the reverse within 100 
	static int reverse1(int r) {
		for (int i = r; i <= 100; i++) {
			System.out.println(i);
		}
		return r;
	}
	
//	Display the division user giving any number divisible by 7
	static long divisible(long lo) {
		return lo;
	}
	
//	Display the division user giving any number divisible by 7
	static long divisible1(long l1,long l2) {
		return l1;
	}
}
