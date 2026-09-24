package in.Constructors;

public class BankingApplication {
	long accountNumber;
	String HolderName;
	String Ac_type;
	double balance;

	BankingApplication() {
		accountNumber = 101510393033L;
		HolderName = "ARAVA MADHU";
		Ac_type = "Saving";
		balance = 30000;
	}

	BankingApplication(long accountNumber, String HolderName, String Ac_type, double balance) {
		this.accountNumber = accountNumber;
		this.HolderName = HolderName;
		this.Ac_type = Ac_type;
		this.balance = balance;

	}

	public static void main(String[] args) {
		BankingApplication a = new BankingApplication();
		BankingApplication a1 = new BankingApplication(221510393033l, "Arva Sudharshan", "Saving", 38000);

		System.out.println("****************** Account_Info-1 **********************");
		a.Account_Info();
		System.out.println("****************** Account_Info-2 **********************");
		a1.Account_Info();
	}

	void Account_Info() {
		System.out.println("Account Number :" + accountNumber);
		System.out.println("Account Holder Name :" + HolderName);
		System.out.println("Account Type :" + Ac_type);
		System.out.println("Account balance :" + balance);
	}

}
