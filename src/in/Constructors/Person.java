package in.Constructors;

public class Person {
	 String name;

	Person(String name){
		this.name= name;
	}
}

class emp extends Person{
	int age;
	int emp_id;
	
	emp(String name , int age,int emp_id){
		super("name");
		this.age =age;
		this.emp_id =emp_id;
	}
}

class Manager extends emp{
	int dept_id;
	
	Manager(String name , int age,int emp_id,int dept_id){
		super(name,age,emp_id);
		this.dept_id = dept_id;
	}
	
	public static void main(String[] args) {
		Manager m = new Manager("ram",23,109,1);
		
		m.display();
	}
	void display() {
		System.out.println("emp name : "+ name);
		System.out.println("emp age : "+ age);
		System.out.println("emp emp_id : "+ emp_id);
		System.out.println("emp dept_id : "+ dept_id);
	}
}