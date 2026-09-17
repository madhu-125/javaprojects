package Labprograms;

public class MethodsTest {

	public static void main(String[] args) {
		MethodsTest m = new MethodsTest();
		method();
		m.name("Madhu");
		m.method1("madhu", 23);
		m.addition(10, 200);
		m.subtraction(200, 50);
		method2(1);
		even(1);
		m.odd(1);
		m.reverse(1);
		m.table(5);
	}

//1		Static method and no return value
	static void method() {
		System.err.println("print Hello world");
		System.out.println("Hello World");
	}

//2	print only my name 	instance method and no return value 
	void name(String name) {
		System.err.println("print My name");
		System.out.println(name); // madhu
	}

//3		display the my name and age
	void method1(String name, int age) {
		System.err.println("printMy name and age ");
		System.out.println(name);
		System.out.println(age);
	}

//	instance method and no return value 
//4			addition of two numbers
	void addition(int a, int b) {
		System.err.println("  addition operation");
		int result = (a + b);
		System.out.println(result);
	}

//5		subtraction of two numbers
	void subtraction(int a, int b) {
		System.err.println("  subtraction operation");
		int sub = a - b;
		System.out.println(sub);
	}

//6		print a = 1 t0 100 numbers
	static void method2(int a) {
		System.err.println("print 1 to 100 numbers");
		for (a = 1; a < 101; a++) {
			System.out.println(a);
		}
	}

//7			print even numbers 1 to 20
	static void even(int a) {
		System.err.println("print 1 to 20 even numbers");
		for (a = 0; a < 20; a++) {
			if (a % 2 == 0) {
				System.out.println(a);
			}
		}
	}

//8	print odd numbers 1 to 20
	void odd(int a) {
		System.err.println("print 1 to 20 odd numbers");
		for (a = 0; a < 20; a++) {
			if (a % 2 == 1) {
				System.out.println(a);
			}
		}
	}

//9		print 10 to 1 number reverse 

	void reverse(int a) {
		System.err.println("print 10 to 1 number reverse ");
		for (a = 10; a > 0; a--) {
			System.out.println(a);
		}
	}
	
//10  print 5 table
	void table(int a) {
		System.err.println("display 5table ");
		for(int i = 1; i<=10; i++) {
			 System.out.println(a + " x " + i + " = " + (i * a)) ;
	}
	}
}