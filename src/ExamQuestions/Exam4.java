package ExamQuestions;

public class Exam4 {
	String Car_Brand;
	double Price;
	
	public static void main(String [] madhu) {
		
		Exam4 e = new Exam4();
		Exam4 e1 = new Exam4();

		e.Car_Brand = "BMW";
		e1.Car_Brand = "KIA";
		e.Price = 9999990.9876D;
		e1.Price = 2575000;
		
		System.err.println("Car1 _details");
		System.out.println(e.Car_Brand);
		System.out.println(e.Price);
		
		System.err.println("Car2 _details");
		System.out.println(e1.Price);
		System.out.println(e1.Car_Brand);
		
	}

}
