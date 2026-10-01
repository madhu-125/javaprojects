package in.Constructors;

public class BankAccountcopy {

	long AccountNumber;
	String HolderName;
	double balance;
	String branch;
	String location;

	BankAccountcopy(long AccountNumber, String HolderName, double balance, String branch, String location) {
		this.AccountNumber = AccountNumber;
		this.HolderName = HolderName;
		this.balance = balance;
		this.branch = branch;
		this.location = location;
	}

	BankAccountcopy(BankAccountcopy other) {
		this.AccountNumber = 12101344L;
		this.HolderName = "Madhu Sudhan";
		this.balance = 5000;
		this.branch = other.branch;
		this.location = other.location;

	}

	public static void main(String[] args) {
		BankAccountcopy b = new BankAccountcopy(15103930332L, "Madhu", 40000, "SBI", "Kbhp Phase-1");
		b.display();

		BankAccountcopy b1 = new BankAccountcopy(b);
		b1.display();

	}

	void display() {
		System.out.println("Account Number is : " + AccountNumber);
		System.out.println("Account Holder Name is : " + HolderName);
		System.out.println("Account balance is : " + balance);
		System.out.println("Account branch is : " + branch);
		System.out.println("Branch location : " + location);
		System.out.println("**************************************************");
	}

}
