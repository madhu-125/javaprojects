package in.Constructors;

import java.util.Scanner;

public class Scanner_constructor {
	static 	Scanner sc = new Scanner(System.in);
	int Stid;
	String name;
	String Course;
	
	Scanner_constructor(){
		System.out.println("Enter the Student Id number : ");
		 Stid = sc.nextInt();
		
		System.out.println("Enetr the Student Name :");
		 name = sc.next();
		
		System.out.println("Enter the Course Name :");
		 Course = sc.next();
	}

	Scanner_constructor(int Stid, String name, String Course) {
		this.Stid = Stid;
		this.name = name;
		this.Course = Course;
	}
	void display() {
		System.out.println("Student Id is : " + Stid );
		System.out.println("Student Name is : "+ name);
		System.out.println("Course name is "+ Course);
		System.out.println("*****************************************************************************");
	}

	public static void main(String[] args) {

	
		
		System.out.println("Enter the Student Id number : ");
		int Stid = sc.nextInt();
		
		System.out.println("Enetr the Student Name :");
		String name = sc.next();
		
		System.out.println("Enter the Course Name :");
		String Course = sc.next();

		Scanner_constructor sc1 = new Scanner_constructor();
		Scanner_constructor sc2 = new Scanner_constructor(Stid,name,Course);
		
		sc1.display();
		sc2.display();
	}

}
