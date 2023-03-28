package com.acc_balanace;

public class Account {
	private double balance;

	public Account(double initialBalance) {
		balance = initialBalance;
	}

	public void withdraw(double amount) throws InsufficientBalanceException {
		if (balance < amount) {
			throw new InsufficientBalanceException("Insufficient balance for withdrawal");
		}
		balance -= amount;
	}

	public double getBalance() {
		return balance;
	}
}

class InsufficientBalanceException extends Exception {
	public InsufficientBalanceException(String message) {
		super(message);
	}
}
