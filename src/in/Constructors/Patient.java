package in.Constructors;

import java.util.Scanner;

public class Patient {
	int patient_id;
	String p_Name;
	int age;
	String disease;
	String patient_type;

//	This is default values assigning using non-args constructor
	Patient() {
		patient_id = 0;
		p_Name = "unknown";
		age = 0;
		disease = "Not-Specified";
		patient_type = "Not-Specified";
	}

//		This is first patient details values assigning using parameterized constructor
	Patient(int patient_id, String p_Name, int age, String disease, String patient_type) {
		this.patient_id = patient_id;
		this.p_Name = p_Name;
		this.disease = disease;
		this.age = age;
		this.patient_type = patient_type;
	}

//	This is Second patient details values assigning using also parameterized constructor
	Patient(long patient_id, String p_Name, int age,String disease, String patient_type) {

	}

	
//	 	The created the method is patient type based on the fees propose
	void patient_fees() {
		double fees;

		switch (patient_type.toLowerCase()) {

		case "general":
			fees = 500;
			break;
		case "emergencey":
			fees = 1500;
			break;
		case "senior":
			fees = 300;
			break;
		default:
			System.out.println("The given type is invaild, Please enter the right type");
			System.out.println("***************************************************");
			return;
		}
		System.out.println("The patient total fees is : " + "Rupees " + fees);
	}
	

	public static void main(String[] args) {
		System.out.println("This is pattern of the patient details :");
		Scanner sc = new Scanner(System.in);
		
//		calling non-arg constructor for default values
		Patient p = new Patient();
		p.patient();
		p.patient_fees();

//		this code is read the console given by first (patient) user data
		System.out.println("Enter the Patient id :");
		int patient_id = sc.nextInt();

		System.out.println("Enter the Patient Name :");
		String p_Name = sc.next();

		System.out.println("Enter the Patient age :");
		int age = sc.nextInt();

		System.out.println("Enter the Patient disease :");
		String disease = sc.next();

		System.out.println("Enter the Patient type  :");
		String patient_type = sc.next();

		
		
//		calling parameterized constructor using default values for first patient
		Patient p1 = new Patient(patient_id, p_Name, age, disease, patient_type);
		System.out.println("This is first patient details :");
		p1.patient();
		p1.patient_fees();
		
//		this code is read the console given by Second (patient) user data
		System.out.println("***************************************************");
		System.out.println("Enter the Patient id :");
		int p_id = sc.nextInt();

		System.out.println("Enter the Patient Name :");
		String p_name = sc.next();

		System.out.println("Enter the Patient age :");
		int p_age = sc.nextInt();

		System.out.println("Enter the Patient disease :");
		String p_disease = sc.next();

		System.out.println("Enter the Patient type  :");
		String p_type = sc.next();

		System.out.println("This is second patient details :");
		
//		calling parameterized constructor using default values for second patient
		Patient p2 = new Patient(p_id, p_name, p_age, p_disease, p_type);

		p2.patient();
		p2.patient_fees();

		sc.close();
	}

	void patient() {
		System.out.println("***************************************************");
		System.out.println("The Patient id is : " + patient_id);
		System.out.println("The Patient Name is : " + p_Name);
		System.out.println("The Patient age is : " + age);
		System.out.println("The Patient disease is : " + disease);
		System.out.println("The Patient patient type is : " + patient_type);
//		System.out.println("***************************************************");
  
	}

	void fees() {

	}

}
