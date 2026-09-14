package ClassPrograms;

public class Literals {
	
	public static void main(String[] args) {
		System.out.println("main method started");
		
	//	Decimal Literals : Base is 10: 0  to 9
		int a1 = 100;
		int a2 = 200;
		int a3 = 123;
		int a4 =0123;
		
//		Whenever the number starts with 0 will consider as Octal.
//		Octal Literals : Base is 8: 0  to 7
//		0^8*1 + 1^8*2 + 2^8*1 + 3^8*0 = 83
//		
		int a5 = 0345; // 229
		int a6 = 0675; //  423
//		int a7 =0286; // The literal 0286 of type int is out of range  
	    
		
// 		Whenever the number starts with	0x will consider as Hexa-Decimal.
//		Hexa-Decimal Literals  :nThe base is 16 : 0 to 9 and a-f / A-F
// 		a/A = 10, b/B = 11,c\C = 12, d/D = 13,e/E = 14 , f/F = 15
		
		int a7 = 0X123; // 1*16^2 + 2*16^1 + 3*16^0 =  256+32+3 = 291
		int a8 = 0X1a2b; // 1*16^3 + 10*16^2 + 2*16^1 + 11*16^0 = 3+  445
		int a9 = 0XDAD; // 13* 16^2 + 10*16^1 + 13*16^0  = 3328 + 160 +13 =3501
		int a10 =0xbEe; // 11* 16^2 + 14*16^1 + 14* 16^0 = 2816 + 224 + 14 = 3054
		
		
//		int a11 =0Xbeer;// Syntax error on token "r", delete this token
		
		System.out.println(a1);//100
		System.out.println(a2);//200
		System.out.println(a3);//123
		System.out.println(a4);//83
		System.out.println(a5);// 229
		System.out.println(a6);// 445
		System.out.println(a7);// 291
		System.out.println(a8); // 6699
		System.out.println(a9);// 3501
		System.out.println(a10);// 3054
		
		
	}

}
