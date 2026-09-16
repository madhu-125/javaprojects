package Labprograms;

public class LocalVariable {
	 int v ;
	
	public static void main (String [] args) {
		int a ;
		int b;
		int c;
		a=3;
		b=4;
		c =10;
		LocalVariable z = new LocalVariable();
		z.v= 9;
		a=3;
		b=4;
		c =10;
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println(c);
		System.out.println(z.v);
		a=13;
		System.out.println(a);
		
	}

}
