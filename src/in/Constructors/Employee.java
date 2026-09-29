package in.Constructors;

public class Employee {
	
	int empId;
	String name;
	double salary;
	public Employee(int empId,	String name) {
		this.empId = empId;
		this.name = name;
	}
	public Employee(int empId,	String name,double salary) {
		this(empId,name);
		this.salary =salary;
	}
	public static void main(String[] args) {
		Employee madhu = new Employee(101, "madhu",10000.0);
		madhu.display();
	}
	
	public void display() {
		System.out.println("Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + "]");
	}
}
