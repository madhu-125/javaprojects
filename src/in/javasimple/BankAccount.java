package in.javasimple;

public class BankAccount {
	static long Account = 1234567;
	{
		Accountnumber = Account; 
		Account++;
	}
	long Accountnumber;
	String Accountholder;
	float Balance;

	public static void main(String[] args) {
		
		BankAccount user1 = new BankAccount();
		user1.Accountholder = "ARAVA MADHU";
		user1.Balance = 11000;
		
		System.err.println("user1 Accountnumber : " + user1.Accountnumber);
		System.out.println("user1.Accountholder : " + user1.Accountholder);
		System.out.println("user1.Balance : " + user1.Balance);
		
		BankAccount user2 = new BankAccount();
		user2.Accountholder = "Ashok";
		user2.Balance = 10000;
		
		System.err.println("user2 Accountnumber : " + user2.Accountnumber);
		System.out.println("user2.Accountholder : " + user2.Accountholder);
		System.out.println("user2.Balance : " + user2.Balance);
		
		BankAccount user3 = new BankAccount();
		user3.Accountholder = "Naveen";
		user3.Balance = 3000;
		
		System.err.println("user3 Accountnumber : " + user3.Accountnumber);
		System.out.println("user3.Accountholder : " + user3.Accountholder);
		System.out.println("user3.Balance : " + user3.Balance);
	
	}
}
