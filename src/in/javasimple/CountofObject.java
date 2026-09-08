package in.javasimple;

public class CountofObject {
	static int count;
	
	CountofObject(){
		count++;
	}
	
	public static void main(String [] args) {
		
		CountofObject c = new CountofObject();
		CountofObject c1 = new CountofObject();
		CountofObject c2 = new CountofObject();
		CountofObject c3 = new CountofObject();
		CountofObject c4 = new CountofObject();
		CountofObject c5 = new CountofObject();
		
		System.out.println(count);
		
		
	}

}
