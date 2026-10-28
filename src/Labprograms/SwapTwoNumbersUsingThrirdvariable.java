package Labprograms;

public class SwapTwoNumbersUsingThrirdvariable {

	public static void main(String[] args) {
		
		int a =100;
		int b = 200;
		
		System.out.println("Before the Swaping");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		System.out.println("After Swaping");
		
		int temp = a;
		a=b;
		b=temp;
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}

}
