package Labprograms;

public class BankAccount {
	static int balance = 1000;

	static void deposit(int amount) {
		System.out.println("Before deposit balance : " + (balance));
		balance = balance + amount;
		System.out.println("After deposit current balance : " + (balance));

	}

	static void withdraw(int amount) {
		balance = balance - amount;
		System.out.println("After current balance : " + (balance));
	}

	public static void main(String[] args) {
		deposit(500);
		withdraw(300);
	}

}
