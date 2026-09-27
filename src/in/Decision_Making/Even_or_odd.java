package in.Decision_Making;
import java.util.Scanner;

public class Even_or_odd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		if(number%2 ==0) {
			System.out.println("The given number is even number");
		}
		else if(number % 2 == 1){
			System.out.println("The given number is Odd Number ");
		}
		sc.close();
	}

}
