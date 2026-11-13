package com.Arrays;

public class TestArray1 {

	public static void main(String[] args) {
//		without alloction size directlly instalization multi vlaues
//		String [] name =new String []{
//			"Madhu",
//			"Naveen",
//			"Ashok"};
		
//		String [] name =new String[5];
//		name[0]="madhu";
//		name[1]="Naveen";
//		name[2]="Ashok";
		
//		We can do directlly instalization multi value
		String name[]= { "Madhu","Ashok","Rakshith","Yashwanth","Naveen"};
//		Represention using for loop
//		for(int i=0;i<name.length;i++) {
//			System.out.println(name[i]);
//		}
		
//		Represention using foreach
		for(String n:name) {
			System.out.println(n);
		}
	}

}
