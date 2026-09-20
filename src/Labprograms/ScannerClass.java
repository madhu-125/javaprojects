package Labprograms;

import java.util.Scanner;

public class ScannerClass {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] madhu) {
		ScannerClass l = new ScannerClass();
		
		method();
		divisible();
		l.name();
		l.method1();
		l.addition();
		l.subtraction();
		method2();
		even();
		l.odd();
		l.reverse();
		l.reverse1();
		l.table();
		divisible1();
		addition1();
		sscMarks();
		Fullname();
		Fathername();
		Mothername();
		l.Sistername1();
		Sistername2();
		college();
		Friendname();
		favGame();
		course();
		
		
		
	}

//1
	static void divisible() {
		System.out.println("Enter the Value");
		int i = sc.nextInt();
		for (int a = 0; a <= 100; a++) {
			if (a % i == 0) {
				System.out.println(a);
			}
		}
	}
//2		 Static method and no return value
	static void method(){
		System.out.println("Hello World");
	}

//3		  print only my name instance method and no return value
	  void name() {
		System.err.println("Enter the name");
		 sc.nextLine(); 
		String name = sc.nextLine(); 
		System.out.println(name); // madhu
	}

//4		  display the my name and age
	void method1() {
		System.err.println("Display My name and age ");
		System.out.println("Enter Your Name ");
		String name = sc.nextLine();
		System.out.println("Enter Your age ");
		int age = sc.nextInt();
		System.out.println(name);
		System.out.println(age);
	}

//		instance method and no return value 
// 5		 addition of two numbers
	void addition() {
		System.err.println("addition operation");
		System.out.println("Enter the a value ");
		int a = sc.nextInt();
		System.out.println("Enter the b value ");
		int b = sc.nextInt();
		int sum = (a + b);
		System.out.println("The sum of two values :" + (sum));
	}

//6 	subtraction of two numbers
	void subtraction() {
		System.err.println("subtraction operation");
		System.out.println("Enter the a value ");
		int a = sc.nextInt();
		System.out.println("Enter the b value ");
		int b = sc.nextInt();
		int sub = (a - b);
		System.out.println("The sub of two values :" + (sub));
	}

//7		 display the from given number to 100
	static void method2() {
		System.err.println("Display the from given number to 100");
		System.out.println("Enter the a value ");
		int a = sc.nextInt();
		for (int i =a; i <= 100; i++) {
			System.out.println(i);
		}
	}

//8		 display the even of numbers from given number to 100
	static void even() {
		System.err.println("Display the even of numbers from given number to 100");
		System.out.println("Enter the a value ");
		int i = sc.nextInt();
		for (int a = i; a <= 100; a++) {
			if (a % 2 == 0) {
				System.out.println(a);
			}
		}
	}

//9		display the odd of numbers from given number to 100
	void odd() {
		System.err.println("Display the odd of numbers from given number to 100");
		System.out.println("Enter the a value ");
		int i = sc.nextInt();
		for (int a= i; a <= 100; a++) {
			if (a % 2 == 1) {
				System.out.println(a);
			}
		}
	}

//10	 display the reverse  numbers from given number  to 1
	void reverse() {
		System.err.println("Display the reverse  numbers from given number  to 1 ");
		System.out.println("Enter the a value ");
		int i = sc.nextInt();
		for (int a=i; a > 0; a--) {
			System.out.println(a);
		}
	}
// 11		 display the reverse  numbers from given number decreasing - 5 to 1		
	void reverse1() {
		System.err.println("Display the reverse  numbers from given number decreasing - 5 to 1 ");
		System.out.println("Enter the a value ");
		int i = sc.nextInt();
		for (int a=i; a >= 0;) {
			int sub = 5; 
			 System.out.println(a);
			 a-= sub;
		}
	}
	
//12	  display the given number table
	void table() {
		System.err.println("Display the given number table ");
		System.out.println("Enter the a value ");
		int a = sc.nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.println(a + " x " + i + " = " + (i * a));
		}
	}
//13		display the divisible by given number from 1 to 100 number
	static void divisible1() {
		System.err.println("Display the divisible by given number from 1 to 100 numbers");
		System.out.println("Enter the a value ");
		int i = sc.nextInt();
		for (int a = i; a <= 100; a++) {
			if (a % i == 0) {
				System.out.println(a);
			}
		}
	}

//14		display the sum of numbers from given number to 100

	static void addition1() {
		System.err.println("Display the sum of numbers from given number to 100");
		System.out.println("Enter the a value ");
		int a = sc.nextInt();
		int sum = 0;
		for (int i = a; i <= 100; i++) {
			sum += i;
			System.out.println(sum);
		}
	}
	
//15

	static void sscMarks() {
		System.err.println("Display the Avg SSCMarhs");
		System.out.println("Enter the your Telugu marks ");
		int Telugu = sc.nextInt();
		System.out.println("Enter the your English marks ");
		int English = sc.nextInt();
		System.out.println("Enter the your Hindi marks ");
		int Hindi = sc.nextInt();
		System.out.println("Enter the your Maths marks ");
		int Maths = sc.nextInt();
		System.out.println("Enter the your Scince marks ");
		int Scince = sc.nextInt();
		System.out.println("Enter the your Social marks ");
		int Social = sc.nextInt();
		double sum = Telugu+English+Hindi+Maths+Scince+Social;
		System.out.println("The sum Total SSC marks : " + (sum));
		double avg = sum/ 6;
		System.out.println("The Avg  SSC marks : " +(avg));
	}

//16

	static void Fullname() {
		System.err.println("Fullname:");
		System.out.println("Enter the a first name ");
		String fname = sc.nextLine();
		System.out.println("Enter the a Last name ");
		String lname = sc.nextLine();
		System.out.println(fname + lname);
	}
//	17

	static void Fathername() {
		System.err.println("Father name:");
		System.out.println("Enter the a Father name ");
		String name = sc.nextLine();
		System.out.println(name );
	}
//18	
	static void Mothername() {
		System.err.println("Mother name:");
		System.out.println("Enter the a Mother name ");
		String name = sc.nextLine();
		System.out.println(name );
	}
//19	
	 void Sistername1() {
		System.err.println("Sister name:");
		System.out.println("Enter the a Sister1 name ");
		String name = sc.nextLine();
		System.out.println(name );
	}
//20
	static void Sistername2() {
		System.err.println("Sister name:");
		System.out.println("Enter the a Sister2 name ");
		String name = sc.nextLine();
		System.out.println(name );
	}
	
//21	
	static void Friendname() {
		System.err.println("Friend name:");
		System.out.println("Enter the a Friend name ");
		String name = sc.nextLine();
		System.out.println(name );
	}


//22	
	static void college() {
		System.err.println("College name:");
		System.out.println("Enter the a college name ");
		String name = sc.nextLine();
		System.out.println(name);
	}
//23
	static void favGame() {
		System.err.println("FavGame name:");
		System.out.println("Enter the a favGame name ");
		String name = sc.nextLine();
		System.out.println(name);
	}
//24	
	static void course() {
		System.err.println("Course name:");
		System.out.println("Enter the a course name ");
		String name = sc.nextLine();
		System.out.println(name);
	}
}