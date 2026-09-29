package in.Constructors;

class Account {
	String holder;
	double balance;

	Account(String holder, double balance) {
		
		this.holder = holder;
		this.balance = balance;
		
		System.out.println("Account created for " + holder + " with balance " + balance);
	}
}

class SavingsAccount extends Account {
	
	double interestRate;

	SavingsAccount(String holder, double balance, double interestRate) {
		
		super(holder, balance);
		this.interestRate = interestRate;
		
		System.out.println("SavingsAccount rate set to " + interestRate + "%");
	}

	SavingsAccount(String holder, double balance) {
		this(holder, balance, 4.0);
	}

	SavingsAccount(String holder) {
		this(holder, 0.0);
	}

	double yearlyInterest() {
		return balance * interestRate / 100;
	}
}

class BankAccount extends SavingsAccount {
	
	BankAccount(String holder) {
		super(holder);

	}

	public static void main(String[] args) {
		SavingsAccount a = new SavingsAccount("Madhu");
		System.out.println("--------------------------------");
		SavingsAccount b1 = new SavingsAccount("Saraswathi", 70000);
		SavingsAccount b = new SavingsAccount("Naveen", 50000, 6.5);
		
		System.out.println("Naveen's yearly interest: " + b.yearlyInterest());
//		System.out.println("Saraswathi yearly interest: " + b.yearlyInterest());

	}
}