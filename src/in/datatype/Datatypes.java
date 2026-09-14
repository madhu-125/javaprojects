package in.datatype;

public class Datatypes {
	private static final boolean True = false;
//	private static final boolean  = false;
//	private static final boolean  = false;
	byte b = (byte) -149;// 1byte --->8 bits = -128 to 127
	byte b1 = (byte) 249;
	short s;//2 bytes -----> 16 bites  = -32768 to 32767
	short s1= (short) -32769;
	short s2 = (short) 326798;
	int i;//4 bytes ---->32 bites  = -2147483648 to 2147483647
	int i1 = -2147483648;
	long l;
	long l1= 9223372036854775807L;//8 bytes ---->64 bites =  -9223372036854775808 to 9223372036854775807
	float f;//4 bytes ---->32 bites  = -2147483648 to 2147483647
	float f1 = 2147483.64f;
	
	double d;//8 bytes ---->64 bites =  -9223372036854775808 to 9223372036854775807
	double d1 = 9223372.92233720368547758079223372036854775807D;
	
	char c;//2 bytes -----> 16 bites ----> -32768 + 32767 = 65535
	char c1 = 65;
	char c2 = 6535;
	 
	boolean db =True;
	private boolean False;
	boolean db1 =False;
	

	public static void main(String[] args) {
		Datatypes t = new Datatypes();
		System.out.println("byte value :"+ t.b);
		System.out.println("byte value1 :"+ t.b1);
		System.out.println("short value :"+ t.s);
		System.out.println("short value1 :"+ t.s1);
		System.out.println("short value2 :"+ t.s2);
		System.out.println("int value :"+ t.i);
		System.out.println("int value1 :"+ t.i1);
		System.out.println("long value :"+ t.l);
		System.out.println("long value1 :"+ t.l1);
		System.out.println("float value :"+ t.f);
		System.out.println("float value1 :"+ t.f1);
		System.out.println("double value :"+t.d);
		System.out.println("double value1 :"+t.d1);
		System.out.println("char value :"+ t.c);
		System.out.println("char value1 :"+ t.c1);
		System.out.println("char value2 :"+ t.c2);
		 
		 
	}

}
