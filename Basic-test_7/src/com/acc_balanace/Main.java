package com.acc_balanace;

public class Main {
	public static void main(String[] args) {
		
		Account account = new Account(100.0);
		
		try {
			account.withdraw(50.0);
			System.out.println("Withdrawal successful. New balance: " + account.getBalance());
			account.withdraw(75.0); // This will throw an exception
			System.out.println("Withdrawal successful. New balance: " + account.getBalance());
		} catch (InsufficientBalanceException e) {
			System.out.println(e.getMessage());
		}
	}
}
