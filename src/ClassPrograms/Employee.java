package ClassPrograms;



class Address{
	
		String flat = "LIG-9";
		String plot="109";
		String city = "kurnool";
		String street = "BC-Colony";	
	}
	
public class Employee {
 	int eid = 505;
 	String ename = "Madhu";
 	Address address = new Address();
 	
	public static void main(String [] args) {
		Employee e = new Employee();
		System.out.println(e.eid);//0
		System.out.println(e.ename);//null
		System.out.println(e.address);//Address of the object
		System.out.println(e.address.flat);//Address of the object
		System.out.println(e.address.plot);//Address of the object
		System.out.println(e.address.city);//Address of the object
		System.out.println(e.address.street);//Address of the object

	}

}
