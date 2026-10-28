package Labprograms;

public class SwapTwoNumberswithoutUsingThrirdvariable {

	public static void main(String[] args) {

		int a = 40;
		int b = 60;

		System.out.println("Before swaping");
		System.out.println("a = " + a);
		System.out.println("b = " + b);

		System.out.println("After swaping");
		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}

}
