package in.datatype;

public class employee {
	
	 byte emp_id =1;
	int age = 25;
	double sal =50000;
	char Grade = 'A';
	float Year_of_experience = 2.7f; 
	boolean Active = true;
	int Available_leaves = 15;
	long moblie_number = 7337492377L;
	
	 
	 int leaves;
	employee(){
		Available_leaves--;
	}
	 
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		employee e = new employee();
		employee e1 = new employee();
		employee e2 = new employee();

		
		System.err.println("Employee  : 1");
		System.out.println("emp_id : "+ e.emp_id);
		System.out.println("age : "+ e.age);
		System.out.println("sal : "+ e.sal);
		System.out.println("Grade : "+ e.Grade);
		System.out.println("Year_of_experience : "+ e.Year_of_experience);
		System.out.println("Active : "+ e.Active);
		System.out.println("Available_leaves : "+ e.Available_leaves);
		System.out.println("moblie_number : "+ e.moblie_number);
		System.out.println("leaves : "+ e.leaves);
		
		e1.emp_id = 2;
		e1.age = 27;
		e1.sal = 48000;
		e1.Grade = 66;
		e1.Year_of_experience = 3.2f;
		e1.Active = true;
		e1.Available_leaves = 12;
		e1.moblie_number = 8297848377L;
		
		System.err.println("Employee  : 2");
		System.out.println("emp_id : "+ e1.emp_id);
		System.out.println("age : "+ e1.age);
		System.out.println("sal : "+ e1.sal);
		System.out.println("Grade : "+ e1.Grade);
		System.out.println("Year_of_experience : "+ e1.Year_of_experience);
		System.out.println("Active : "+ e1.Active);
		System.out.println("Available_leaves : "+ e1.Available_leaves);
		System.out.println("moblie_number : "+ e1.moblie_number);
		System.out.println("leaves : "+ e1.leaves);
		
		e2.emp_id = 3;
		e2.age = 27;
		e2.sal = 45000;
		e2.Grade = 'A';
		e2.Year_of_experience = 3f;
		e2.Active = true;
		e2.Available_leaves = 20;
		e2.moblie_number = 7660902031L;
		
		System.err.println("Employee  : 3");
		System.out.println("emp_id : "+ e2.emp_id);
		System.out.println("age : "+ e2.age);
		System.out.println("sal : "+ e2.sal);
		System.out.println("Grade : "+ e2.Grade);
		System.out.println("Year_of_experience : "+ e2.Year_of_experience);
		System.out.println("Active : "+ e2.Active);
		System.out.println("Available_leaves : "+ e2.Available_leaves);
		System.out.println("moblie_number : "+ e2.moblie_number);
		System.out.println("leaves : "+ e2.leaves);
	}

}
