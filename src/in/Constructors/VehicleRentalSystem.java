package in.Constructors;

import java.util.Scanner;

public class VehicleRentalSystem {
	static Scanner sc = new Scanner(System.in);

	int vehicle_Number;
	String model;
	String type_vehicle;
	String vehicle_type;
	double fixed_deposit;

	VehicleRentalSystem(int vehicle_Number, String model, String type_vehicle, String vehicle_type,
			double fixed_deposit) {
		this.vehicle_Number = vehicle_Number;
		this.model = model;
		this.type_vehicle = type_vehicle;
		this.vehicle_type = vehicle_type;
		this.fixed_deposit = fixed_deposit;
	}

	// create a method by using display the vehicle information

	void veh_info() {
		System.out.println(" ****************************************************");
		System.out.println(" The vehicle Number is : " + vehicle_Number);
		System.out.println(" The vehicle model is : " + model);
		System.out.println(" The type vehicle is : " + type_vehicle);
		System.out.println(" The vehicle type is : " + vehicle_type);
		System.out.println(" The vehicle fixed_deposit price is : " + fixed_deposit);
		System.out.println(" ****************************************************");

	}

	// create a method by using calculate the vehicle rent per day and number of
	// days
	// create a method by using calculate the finally Total rental amount for no. of
	// rental days based.

	void calculateRent() {
		System.out.println("Enter the per day rental amout is 200 to  within 300");
		int rent = sc.nextInt();
		// starting amount is 200 to within 300
		if (rent >= 200 && rent <= 300) {
			System.out.println("Your " + type_vehicle + " per day Rental Amount is : " + rent);
		} else {
			System.out.println("Your entered the invaild Rental Amount.. Please enter vaild Rental Amount");
		}
		
		System.out.println("_______________________________________________________________");
		// calculate the finally Total rental amount for no. of rental days based.
		System.out.println("Enter the no. of days Rental " + type_vehicle);
		int days = sc.nextInt();

		double sum = rent * days;// total rental amount calculated
		System.out.println("The total Rntal amount only : " + sum);

		
		System.out.println(" --------------------------------------------------------------------");
		double final_amount = sum + fixed_deposit;// final Total amount including deposit
		System.out.println("The final total amount including deposit : " + final_amount);

	}

	public static void main(String[] args) {

		System.out.println("Enter the vehicle_Number : ");
		int vehicle_Number = sc.nextInt();

		System.out.println("Enter the vehicle model : ");
		String model = sc.next();

		System.out.println("Enter the type vehicle : ");
		String type_vehicle = sc.next();

		System.out.println("Enter the vehicle_type : ");
		String vehicle_type = sc.next();

		System.out.println("Enter the vehicle fixed_deposit price : ");
		double fixed_deposit = sc.nextInt();

		// created a object and calling the parameterized constructor
		VehicleRentalSystem v = new VehicleRentalSystem(vehicle_Number, model, type_vehicle, vehicle_type,
				fixed_deposit);

		// Calling the vehicle information method by using object reference
		v.veh_info();
		v.calculateRent();

	}
	// Scanner class closing because data is liked
	// sc.close();

}
