package ClassPrograms;

public class Literals1 {
	
	
	public static void main(String [] madhu) {
		
//		float salary = 50000.50; // Type mismatch: cannot convert from double to float
		float salary = 50000.506f; // 50000.508  
		float a = 1234.12f;
		double sal =1234567.123456789D;
		
		char grade = 'A';
		char digit = '9';
		char symbol ='@';
		char ch ='\n'; 
		char b ='\u0078';
		
		String s = "234rfvbnm@')"
				+ "'(*&^%<>?/$|}{[]=-09876543kiu";
//		char ch = "As"; //Type mismatch: cannot convert from String to char.
//							because char a only any one value stored letter,symbol,number and ASCII values 
		
	
		System.out.println(salary);
		System.out.println(sal);
		System.out.println(a);
		System.out.println(grade);
		System.out.println(digit);
		System.out.println(symbol);
		System.out.println(ch);
		System.out.println(b);
		System.out.println(s);
	}

}
