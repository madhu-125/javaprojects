package in.Decision_Making;

import java.util.Scanner;

public class Switch {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter the Day");

		String dayname = sc.nextLine();
		// String dayname = monday;
		switch (dayname) {
		case "monday":
		case "tuesday":
		case "wensday":
		case "thursday":
		case "friday":
			System.out.println("Ufff, this is working day..!");
			break;
		case "saturday":
		case "sunday":
			System.out.println("yayy, this is weekend day");
			break;
		default:
			System.err.println("This is an invaild data");
			break;
		}

		sc.close();
	}
}
