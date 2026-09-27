package in.Decision_Making;
import java.util.Scanner;

public class Switch_operator {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the First Number :");
		int a = sc.nextInt();
		
		System.out.println("Enter the Second Number :");
		int b = sc.nextInt();
		
		System.out.println("Enter the operator:");
		String oper = sc.next();
		
		
		switch(oper) {
		case "+":
			System.out.println(a + b);
		break;
		case "-":
			System.out.println(a - b);
		break;
		case "*":
			System.out.println(a * b);
		break;
		case "/":
			System.out.println(a / b);
		break;
		case "%":
			System.out.println(a % b);
		break;
		default:
			System.err.println("The given operator is invaild...");
		}
		sc.close();
	}
}
