package in.Constructors;

public class Bankaccount1 {
	long AccountNumber;
	String HolderName;
	double balance;
	String branch;

	Bankaccount1(long AccountNumber, String HolderName, double balance, String branch) {
		this.AccountNumber = AccountNumber;
		this.HolderName = HolderName;
		this.balance = balance;
		this.branch = branch;
	}
	Bankaccount1(Bankaccount1 other) {
		this.AccountNumber = other.AccountNumber;
		this.HolderName = other.HolderName;
		this.balance = other.balance;
		this.branch = other.branch;
		
	}
	
	public static void main(String[] args) {
		Bankaccount1 b = new Bankaccount1(15103930332L,"Madhu",40000,"SBI");
		b.display();
		
		Bankaccount1 b1 = new Bankaccount1(b);
		b1.display();
		
	}
	void display() {
		System.out.println("Account Number is : "+ AccountNumber);
		System.out.println("Account Holder Name is : "+ HolderName);
		System.out.println("Account balance is : "+ balance);
		System.out.println("Account branch is : "+ branch);
		System.out.println("**************************************************");
	}
	

}
