package ExamQuestions;

class A{
	
}
public class Exam3 {

	
	public static void main(String [] args) {
		
//		user-defined class loader
		System.out.println("A classloader : " + A.class.getClassLoader());
		
		System.out.println("Exam3 classLoader : " + Exam3.class.getClassLoader());
		
		
//		String classLoader
		System.out.println("String classLoader : " + String.class.getClassLoader());
		
//		Object classLoader
		System.out.println("Object classLoader : " + Object.class.getClassLoader());
	
		
	}
}
