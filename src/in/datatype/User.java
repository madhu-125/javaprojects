package in.datatype;

public class User {
	

	public static void main(String[] args) {
		int money =100;
		int pencil_price = 7;
		
		int NO_of_pencil =money / pencil_price;
		int remaining_balance = money % pencil_price;
		
		System.out.println("NO_of_pencil : " + NO_of_pencil);
 		System.out.println("Remaining_balance : " + remaining_balance);

	}

}
