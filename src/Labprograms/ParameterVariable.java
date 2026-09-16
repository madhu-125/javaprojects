package Labprograms;

public class ParameterVariable {
	 
	static void display(int a, int b,String name,int Roll_number) {
		int sum = a+b;
		System.err.println("Static Method parameterVaribles");
		System.out.println(sum);
		System.out.println(name);
		System.out.println(Roll_number);
	}
	
	  void Madhu(int age ,String name,long phone) {
	
		System.err.println("instance Method parameterVaribles");
		System.out.println(age);
		System.out.println(name);
		System.out.println(phone);
	}
	public static void main (String [] Madhu) {
		 display(12,89,"Madhu",505);
		 ParameterVariable p = new ParameterVariable();
		p.Madhu(12,"GAni",7337492377L);
		 
	}
}
