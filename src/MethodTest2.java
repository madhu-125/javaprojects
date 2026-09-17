
public class MethodTest2 {
	static int a = 9;

	public static void main(String[] args) {
		MethodTest2.divisible(5);
		table();
		addition();

	}

//11		display the divisible by 5 from 1 to 100 numbers
	static void divisible(int a) {
		System.err.println("display the divisible by 5 from 1 to 100 numbers");
		for (a = 1; a <= 100; a++) {
			if (a % 5 == 0) {
				System.out.println(a);
			}
		}
	}

//12		display the table of a given number using class variable
	static void table() {
		System.err.println("display the table of a given number using class variable");
		for (int i = 0; i <= 10; i++) {
			System.out.println(a + " x " + i + " = " + (a * i));
		}
	}

//13		display the sum of numbers from 1 to 10

	static void addition() {
		System.err.println("display the sum of numbers from 1 to 10");
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
			System.out.println(sum);
		}
	}
//	

}
