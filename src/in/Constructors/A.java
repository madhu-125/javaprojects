package in.Constructors;

public class A {
	{
		System.out.println("A instance block");
	}
	A(){
		System.out.println("A constructor block");
	}
//	A(int x){
//		System.out.println("A  parameterized constructor block");
//	}
}

class B extends A{
	{
		System.out.println("B instance block");
	}
	B(){
		this(10);
		System.out.println("B constructor block");
	}
	B(int x){
		super();
		System.out.println("B parameterized constructor block");
	}
	public static void main(String[] args) {
		B b = new B();
	}
}