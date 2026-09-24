package in.Constructors;

public class Employee2 {

	int eid;
	String name; 
	double sal;
	
	Employee2(){
		eid=10;
		name= "madhu";
		sal=50000;
	}
	
	Employee2(int eid,String name,double sal){
		this.eid = eid;
		this.name = name;
		this.sal = sal;
	}
	
	Employee2(int i,String enam,float al){
		eid = i;
		name = enam;
		sal = al;
	}
	
	public static void main(String[] args) {
		Employee2 e = new Employee2();
		Employee2 e1 = new Employee2(11,"Madhu sudhan",60000);
		Employee2 e2 = new Employee2(12,"Ashok",65000);
		
		e.empInfo();
		e1.empInfo();
		e2.empInfo();
	}
	void empInfo() {
		System.err.println("******************** Employee Infromation ********************");
		System.out.println("Employee Id :" + eid);
		System.out.println("Employee Name : " + name);
		System.out.println("Employee Salary : " + sal);
	}
}
