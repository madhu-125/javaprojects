package Labprograms;

public class Employee {
	
	int emp_id ;
	String emp_name;
	Double Salary;
	
	public static void main(String [] madhu) {
		
		Employee e = new Employee();
		
		e.emp_id =101;
		e.emp_name="Madhu";
		e.Salary= 40000.12;
		
		System.err.println("Employee_1 Deatails : ");
		System.out.println("Employee_1 ID : " + e.emp_id);
		System.out.println("Employee_1 Name : " + e.emp_name);
		System.out.println("Employee_1 Salary : " + e.Salary);
		
		Employee e1 = new Employee();
		
		e1.emp_id =102;
		e1.emp_name="Naveen";
		e1.Salary= 70000.12;
		
		System.err.println("Employee_2 Deatails : ");
		System.out.println("Employee_2 ID : " + e1.emp_id);
		System.out.println("Employee_2 Name : " + e1.emp_name);
		System.out.println("Employee_2 Salary : " + e1.Salary);
		
		
		Employee e2 = new Employee();
		
		e2.emp_id =103;
		e2.emp_name="Ganesh";
		e2.Salary= 60000.126;
		
		System.err.println("Employee_3 Deatails : ");
		System.out.println("Employee_3 ID : " + e2.emp_id);
		System.out.println("Employee_3 Name : " + e2.emp_name);
		System.out.println("Employee_3 Salary : " + e2.Salary);
		
	}

}
