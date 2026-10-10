package com.rays.encapsulation;

public class TestAccount {

	public static void main(String[] args) {

		Account a = new Account();
		
		a.deposite(2000);
		a.Withdrwal(1000);
	}
}

//Output:
//	Balance After Deposite = 2000.0
//	Balance after Withdrawal = 1000.0
