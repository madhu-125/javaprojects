package in.datatype;

public class StringReverse {

	public static void main(String[] args) {

//		This is the String reverse in single line of code by using String Builder
		System.out.println(new StringBuilder("madhu").reverse().toString());
		
//		This is the String reverse in single line of code  by using String buffer
		System.out.println(new StringBuffer("madhu Sudhan").reverse().toString());
		
//		This is the String reverse in two lines of code by using String Builder	
		String s ="Sudharshan";
		System.out.println(new StringBuilder(s).reverse().toString());
		
//		This is the String reverseby using for loop
		String s1="Saraswathi";
		String rev="";
		for(int i =s1.length()-1; i>= 0; i--) {
			rev += s1.charAt(i);
			
			System.out.println(rev);
		}
	}

	

}
