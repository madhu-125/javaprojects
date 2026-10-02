package in.Constructors;

import java.util.Scanner;

public class Employee_payroll {
	Scanner sc = new Scanner(System.in);

	int emp_Id;
	String name;
	double basic_sal;

	Employee_payroll() {
		System.out.println("Enter the Employee Id : ");
		int emp_Id = sc.nextInt();

		System.out.println("Enter the Employee name : ");
		String name = sc.next();

		System.out.println("Enter the Employee Basic Salary : ");
		double basic_sal = sc.nextDouble();

		this.emp_Id = emp_Id;
		this.name = name;
		this.basic_sal = basic_sal;
	}

	void salaryslip() {
		double sal_per = basic_sal / 100;
		double HRA = sal_per * 20;
		double DA = sal_per * 10;
		double grass_sal = basic_sal + HRA + DA;

		System.out.println("Employee id is : " + emp_Id);
		System.out.println("Employee name is : " + name);
		System.out.println("Employee basic Salary is : " + basic_sal);
		System.out.println("Employee HRA is : " + HRA);
		System.out.println("Employee DA is : " + DA);
		System.out.println("Employee Total Salary : " + grass_sal);

	}

	public static void main(String[] args) {
		Employee_payroll e = new Employee_payroll();

		e.salaryslip();

	}

}
