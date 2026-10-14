package com.rays.encapsulation;

public class Account {

	public double balance = 0;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void deposite(double amount) {
		balance = balance + amount;
		System.out.println("Balance After Deposite = " + balance);
	}

	public void Withdrwal(double amount) {
		if (balance < amount) {
			System.out.println("Insufficient Balance");
		} else {
			balance = balance - amount;
			System.out.println("Balance after Withdrawal = " + balance);
		}
	}
	
}
