package Labprograms;

public class staticVariable1 {
	static int S_id = 505;
	static String S_name = "madhu";
	static int S_id1 ;
	static String S_name1;
	
	static int Roll_number=501;
	static String name = "Ganesh";
	
	static void display() {
	System.out.println(Roll_number);
	System.out.println(name);
	}
//	static variables cannot be declared directly inside a method in java
//	static void  display() {
//		static int S_id = 109;
//		
//	}
	
	public static void main(String [] args) {
		staticVariable1 v = new staticVariable1();
		v.display();
		
//		 we can accessed by using class name
		System.out.println(staticVariable1.S_id);   
		System.out.println(staticVariable1.S_name);
		System.out.println(staticVariable1.S_id1);   
		System.out.println(staticVariable1.S_name1);
		
//		 we can accessed by using Object reference name
		System.out.println(v.S_id);
		System.out.println(v.S_name);
		System.out.println(v.S_id1);
		System.out.println(v.S_name1);
		
//		 we can accessed by using directly variable name
		System.out.println(S_id);
		System.out.println(S_name);
		
		System.out.println(S_id1);
		System.out.println(S_name1);
	}
	  
}
