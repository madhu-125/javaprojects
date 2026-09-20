package Labprograms;

import java.util.Scanner;

// 3 + 4 = 7
public class findtheArea {

	public static void main() {
		System.out.println("MAin method Started");
		Scanner sc = new Scanner(System.in);

		System.out.println("**************Area of the Square*****************");
		System.out.println("Enter the Side value");
		int s = sc.nextInt();
		int s1 = findAreaofsqu(s);
		System.out.println(s1);
		System.out.println("**************Area of the Rectangle*****************");
		System.out.println("Enter the lenght");
		long l = sc.nextLong();
		System.out.println("Enter the width");
		long w = sc.nextLong();
		double a = findAreaofrec(l, w);
		System.out.println(a);
		System.out.println("**************Area of the Circle*****************");
		System.out.println("Enter the Radius");
		float r = sc.nextFloat();
		double cr = findAreaofcir(r);
		System.out.println(cr);
		System.out.println("**************Area of the Triangle*****************");
		System.out.println("Enter the Breath");
		float b = sc.nextFloat();
		System.out.println("Enter the Length");
		float h = sc.nextFloat();
		double tri = findAreaoftri(b, h);
		System.out.println(tri);
		System.out.println("Main method Ended");
	}

	static int findAreaofsqu(int s) {
		return s * s;
	}

	static float findAreaofrec(long l, long w) {

		return l * w;
	}

	static double findAreaofcir(float r) {
		return Math.PI*r*r;
	}

	static double findAreaoftri(float b, float h) {
		return 0.5*b*h;
	}

}
