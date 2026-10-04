package in.Constructors;

import java.util.Scanner;

public class EmployeeSal {
	static Scanner sc = new Scanner(System.in);

	short emp_id;
	String name;
	double salary;

	EmployeeSal(short emp_id, String name, double salary) {
		this.emp_id = emp_id;
		this.name =name;
		this.salary= salary;

	}
	void totalSal() {
		double avg = salary /100;
		
		System.out.println("Enter the percentage of bonus : ");
		byte per = sc.nextByte();
		
		double bonus = avg * per;
		double Final_sal = salary +bonus;
		
		System.out.println("-----------------------------------------------------------------");
		System.out.println("Employee Id : " + emp_id);
		System.out.println("Employee Name : " + name);
		System.out.println("Employee salary : " + salary);
		System.out.println("Employee Bonus percentage : " + per + "%");
		System.out.println("Employee Bonus amount : " + bonus);
		System.out.println("Employee Total salary including bonus : " + Final_sal);
	}
	
	public static void main(String []args) {
		
		System.out.println("Enter the Employye id : ");
		short emp_id =sc.nextShort();
		
		System.out.println("Enter the Employee Name : ");
		String name = sc.next();
		
		System.out.println("Enter the Employee Salary : ");
		double salary = sc.nextDouble();
		
		EmployeeSal es =new EmployeeSal(emp_id,name,salary);
		es.totalSal();
		
	}
	
}
