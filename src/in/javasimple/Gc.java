package in.javasimple;

class A{
	B b;
}

class B{
	A a;
}

public class Gc {

	public static void main(String[] args) { 
		System.out.println("Main method called");
		
		 A obj1 = new A();
		 B obj2 = new B();
		 
		System.out.println(obj1);
		System.out.println(obj2);
		
		obj1 = null;
		System.out.println(obj1);
		
		
		System.gc();
	}

}
