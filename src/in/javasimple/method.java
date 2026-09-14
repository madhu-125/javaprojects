package in.javasimple;

public class method {
	
	
	static void  method1(){
		
		System.out.println("method1 calling");
	}
	
	static void method2(){
		
		 System.out.println("method2 calling");
	}
	
	  void method3() {
		
		 System.out.println("method3 calling");
	}
	
	void method4() {
	  	method1();
		method2();
	    method3();
		 System.out.println("method4 calling");
	}

	public static void main(String[] args) {
		method t = new method();
		
		t.method4();
 	}

}
