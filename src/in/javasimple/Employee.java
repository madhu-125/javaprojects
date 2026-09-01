package in.javasimple;

public class Employee {
	static String  institutename ="Vcube";
	static String Trainer1_name="Jeevan";
	static String Trainer2_name ="Yashwanth";
	
	int employee_id;
	String employee_name;
	int marks ;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Trainer1_name" + Trainer1_name);
		System.out.println("Trainer2_name" + Trainer2_name);
		
			Employee e = new Employee();
			e.employee_id = 10;
			e.employee_name="madhu";
			e.marks=98;
			
		    System.out.println("employee1_id :" + e.employee_id);
		    System.out.println("Name :" + e.employee_name);
		    System.out.println("Marks :" + e.marks);
		    
		    e.employee_id = 11;
			e.employee_name="Naveen";
			e.marks=99;
			
		    System.out.println("employee2_id :" + e.employee_id);
		    System.out.println("Name :" + e.employee_name);
		    System.out.println("Marks :" + e.marks);
		    
		    e.employee_id = 12;
			e.employee_name="Ashok";
			e.marks=100;
			
		    System.out.println("employee2_id :" + e.employee_id);
		    System.out.println("Name :" + e.employee_name);
		    System.out.println("Marks :" + e.marks);
		    
		    e.employee_id = 13;
			e.employee_name="Yashwanth";
			e.marks=99;
			
		    System.out.println("employee3_id :" + e.employee_id);
		    System.out.println("Name :" + e.employee_name);
		    System.out.println("Marks :" + e.marks);
		}

		

	

}
