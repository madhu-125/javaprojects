package in.javasimple;

public class Student {
	static String
	collegename = "Vcube";
	
	int student_id;
	String student_name;
	int marks;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(collegename);
		
		
		Student st = new Student();
		st.student_id = 7681;
	    st.student_name ="madhu";
	    st.marks=98;
	  
	  System.out.println("student1_id :" + st.student_id);
	  System.out.println("student1_name :" + st.student_name);
	  System.out.println("marks: "+ st.marks);
	  
	   
		st.student_id = 505;
	    st.student_name ="madhu sudhan";
	    st.marks=100;
	  
	  System.err.println("student1_id :" + st.student_id);
	  System.err.println("student2_name :" + st.student_name);
	  System.err.println("marks: "+ st.marks);

	  
	    st.student_id = 909;
	    st.student_name ="navven";
	    st.marks=98;
	  
	  System.out.println("student3_id :" + st.student_id);
	  System.out.println("student3_name :" + st.student_name);
	  System.out.println("marks: "+ st.marks);
	}

}
