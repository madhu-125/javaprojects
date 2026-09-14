package in.javasimple;

public class Method2 {
	static void staticmethod1() {
		System.out.println("static method1 calling");
	}
	static void staticmethod2() {
		System.out.println("static method2 calling");
	}
	  void instancemethod1() {
		System.out.println("instancemethod2 calling");
	}
	  void instancemethod2() {
			System.out.println("instancemethod2 calling");
		}

	public static void main(String[] args) {
		
		staticmethod1();
		staticmethod2();
		
		Method2 m = new Method2();
		
		
		m.instancemethod1();
		m.instancemethod2();
	}

}
