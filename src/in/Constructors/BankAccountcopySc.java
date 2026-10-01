package in.Constructors;

import java.util.Scanner;

public class BankAccountcopySc {

	long AccountNumber;
	String HolderName;
	double balance;
	String branch;
	String Location;

	BankAccountcopySc(long AccountNumber, String HolderName, double balance, String branch, String Location) {
		this.AccountNumber = AccountNumber;
		this.HolderName = HolderName;
		this.balance = balance;
		this.branch = branch;
		this.Location = Location;
	}

	BankAccountcopySc(BankAccountcopySc bas,long accno,String holname,double bal) {
		this.AccountNumber = accno;
		this.HolderName = holname;
		this.balance = bal;
		this.branch = bas.branch;
		this.Location = bas.Location;
	}

	void display() {
		System.out.println("Account Number : " + AccountNumber);
		System.out.println("Account Holder Name : " + HolderName);
		System.out.println("Account balance : " + balance);
		System.out.println("Branch Name : " + branch);
		System.out.println("Branch location : " + Location);
		System.out.println("**********************************");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Account Number");
		long AccountNumber = sc.nextLong();

		System.out.println("Enetr the Account Holder Name : ");
		String HolderName = sc.next();

		System.out.println("Enetr the Account balance : ");
		double balance = sc.nextDouble();

		System.out.println("Enetr the Branch Name : ");
		String branch = sc.next();

		System.out.println("Enetr the Branch location : ");
		String Location = sc.next();

		BankAccountcopySc b = new BankAccountcopySc(AccountNumber, HolderName, balance, branch, Location);

		b.display();

		System.out.println("Enter the Account Number");
		long AccountNumber1 = sc.nextLong();

		System.out.println("Enetr the Account Holder Name : ");
		String holderName1 = sc.next();

		System.out.println("Enetr the Account balance : ");
		double balance1 = sc.nextDouble();

		BankAccountcopySc b1 = new BankAccountcopySc(b,AccountNumber1,holderName1,balance1);

		b1.display();
		sc.close();
	}

}
