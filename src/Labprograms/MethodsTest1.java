package Labprograms;

public class MethodsTest1 {
	static int a = 9;

	public static void main(String[] args) {
		MethodsTest1.divisible(5);
		table();
		addition();
		name("Madhu", "Sudhan");
		sscMarks(80, 89, 98, 78, 97, 87);
		Fathername("Sudharshan");
		Mothername("Saraswathi");
		Sistername1("Suvarna");
		Sistername2("Suguna");
		Friendname("Yashwanth");
		edu("B.Tech");
		goal();
		college();
		from();
		mandal();
		Birthplace();
		favFood();
		favGame();
		favPerson();
		course();

	}

//11		display the divisible by 5 from 1 to 100 numbers
	static void divisible(int a) {
		System.err.println("display the divisible by 5 from 1 to 100 numbers");
		a = 200;
		System.out.println(a / 5);
	}

//12		display the table of a given number using class variable
	static void table() {
		System.err.println("display the table of a given number using class variable");
		for (int i = 0; i <= 10; i++) {
			System.out.println(a + " x " + i + " = " + (a * i));
		}
	}

//13		display the sum of numbers from 1 to 10

	static void addition() {
		System.err.println("display the sum of numbers from 1 to 10");
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
			System.out.println(sum);
		}
	}
//14

	static void sscMarks(int t, int e, int h, int m, int sc, int so) {
		System.err.println("display the Avg SScMarhs");
		double sum = t + e + h + sc + m + so;
		System.out.println("the sum Total SSC marks : " + (sum));
		double avg = sum / 6;
		System.out.println("the Avg  SSC marks : " + (avg));
	}

//15

	static void name(String fname, String lname) {
		System.err.println("Fullname:");
		System.out.println(fname + lname);
	}
//	16

	static void Fathername(String name) {
		System.err.println("Father name:");
		System.out.println(name);
	}

//17	
	static void Mothername(String name) {
		System.err.println("Mother name:");
		System.out.println(name);
	}

//18	
	static void Sistername1(String name) {
		System.err.println("Sister name:");
		System.out.println(name);
	}

//19
	static void Sistername2(String name) {
		System.err.println("Sister name:");
		System.out.println(name);
	}

//20	
	static void Friendname(String name) {
		System.err.println("friend name:");
		System.out.println(name);
	}

//21	
	static void edu(String name) {
		System.err.println("Edu name:");
		System.out.println(name);
	}

//	22
	static void goal() {
		System.err.println("Edu name:");
		String goal = "Become a software";
		System.out.println(goal);
	}

//23	
	static void college() {
		System.err.println("College name:");
		String name = "Audisankara college of engineering and Technology";
		System.out.println(name);
	}

//24	
	static void from() {
		System.err.println("village name:");
		String name = "Mukkella";
		System.out.println(name);
	}

//25
	static void mandal() {
		System.err.println("Madal name:");
		String name = "Tuggali";
		System.out.println(name);
	}

//26	
	static void Birthplace() {
		System.err.println("Birthplace name:");
		String name = "Patthikonda";
		System.out.println(name);
	}

//27
	static void favFood() {
		System.err.println("favFood name:");
		String name = "Sweet";
		System.out.println(name);
	}

//28
	static void favGame() {
		System.err.println("favGame name:");
		String name = "kabbadi";
		System.out.println(name);
	}

//29
	static void favPerson() {
		System.err.println("favPerson name:");
		String name = "mom";
		System.out.println(name);
	}

//30	
	static void course() {
		System.err.println("course name:");
		String name = "Java Full Stack development";
		System.out.println(name);
	}
}
