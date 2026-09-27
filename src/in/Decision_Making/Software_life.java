package in.Decision_Making;
import java.util.Scanner;

public class Software_life {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("What is this day..?");
		String dayname = sc.nextLine();

		if(dayname.equals("monday") || 
				dayname.equals("tuesday")||
				dayname.equals("wensday") ||
				dayname.equals("thursday") || 
				dayname.equals("friday")) {
			System.out.println("Uff this working day ..!");
		}
		else if(dayname.equals("sunday") || dayname.equals("saturday")) {
			System.out.println("WOw this is week_end ..!");
		}
		sc.close();
	}
}
