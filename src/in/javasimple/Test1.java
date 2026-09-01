package in.javasimple;

public class Test1 {
	static int count;
	
	Test1 (){
		count++;
	}
	
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Test1 t1 = new Test1();
		 Test1 t2 = new Test1(); 
		 Test1 t3 = new Test1();
		 Test1 t4 = new Test1();
		 Test1 t5 = new Test1(); 
		 Test1 t6 = new Test1();
	 
	 
		System.out.println(count);

	}

}
