package in.javasimple;

public class Studentdetails {
	static String CollegeName = "SANK";
	String name;
	int age;

	void display() {
		System.err.println("CollegeName : " + CollegeName);
		System.out.println("Student Name : " + name);
		System.out.println("Student age : " + age);

	}

	public static void main(String[] args) {

		Studentdetails s = new Studentdetails();
		s.name = "Madhu";
		s.age = 23;
		
		s.display();
	}

}
