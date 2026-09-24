package in.Constructors;

public class Student1 {
	int S_id;
	String name;
	
	static int count;
	
	Student1(){
		count++;
		S_id= 101;
		name = "madhu";
	}
	
	void main(String[] args) {
		
		Student1 s = new Student1();
		Student1 s1 = new Student1();
		Student1 s2 = new Student1();
		Student1 s3 = new Student1();
		Student1 s4 = new Student1();
		Student1 s5 = new Student1();
		
		System.out.println("The count of Objects : " + count);
		System.out.println("Student Id : "+ S_id);
		System.out.println("Student Name : " + name);
	}

}
