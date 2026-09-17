package Labprograms;

public class Test {

	void method1(int a, int b) {
		int addition = a + b;
		System.out.println(addition); //20+5 = 25
		method2(addition, 5);  // addition =25
	}

	void method2(int a, int b) {
		int subtraction = a - b;  //25 - 5=20
		System.out.println(subtraction);// 20
		method3(subtraction, 5);// 20,5

	}

	void method3(int a, int b) {
		int mutliplication = a * b;//20 * 5
		System.out.println(mutliplication);// 100
		method4(mutliplication, 10);

	}

	void method4(int a, int b) {
		int division = a / b;  // 100 / 10
		System.out.println(division); // 10

	}

	public static void main(String[] madhu) {
		Test t = new Test();
		t.method1(20, 5);

	}

}
