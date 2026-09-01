package in.javasimple;

public class NullifyObject {
	
	public static void main(String[] args) {
	
	NullifyObject obj1 = new NullifyObject();
	
	
	NullifyObject obj2 = new NullifyObject();
	obj2 =obj1;
	 
	System.out.println(obj1);
	System.out.println(obj2);
    obj1 = null;
    obj2 = null;
    System.out.println(obj1);
	System.out.println(obj2);
	

	}

}
