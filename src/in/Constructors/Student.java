package in.Constructors;

public class Student {
	
	int St_id;
	String name;
	

	public Student(int St_id,String name) {
		this.St_id = St_id;
		this.name = name;
	}

	public static void main(String[] args) {
		Student s = new Student(101,"madhu");
	System.out.println(s.St_id);
	System.out.println(s.name);
		
	}

}
