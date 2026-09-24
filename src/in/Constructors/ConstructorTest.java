package in.Constructors;

//  Constructor overloading
public class ConstructorTest {
	int id;
	String name;
	String fname;
	String village;

	ConstructorTest() {
		id = 10;
		name = "madhu";

	}

	ConstructorTest(int id, String name) {
		this.id = id;
		this.name = name;
	}

	ConstructorTest(int id, String name, String fname) {
		this.id = id;
		this.name = name;
		this.fname = fname;
	}
	 ConstructorTest(int id,String name,String fname,String village) {
		 this.id = id;
			this.name = name;
			this.fname = fname;
			this.village = village;
			
		}

	public static void main(String[] args) {
		ConstructorTest c = new ConstructorTest();
		ConstructorTest c1 = new ConstructorTest(11, "Ram");
		ConstructorTest c2 = new ConstructorTest(10, "madhu", "Arava");
		ConstructorTest c3 = new ConstructorTest(11, "ram", "gopal","Mukkella");

		c.Test();
		c1.Test();
		c2.Test();
		c3.Test();

	}

	void Test() {
		System.out.println("Id : " + id);
		System.out.println("Name : " + name);
		System.out.println("Full_Name : " + fname);
		System.out.println(" village Name : " + village);
	}

}
