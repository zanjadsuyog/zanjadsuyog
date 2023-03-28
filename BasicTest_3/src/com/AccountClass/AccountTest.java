package com.AccountClass;

import java.util.Scanner;

public class AccountTest {

	Scanner sc = new Scanner(System.in);

	Account a1 = new Account();

	public void deposite() {
		System.out.println("Enter the balance =>");
		a1.setBalance(sc.nextInt());
		System.out.println("The balance is =>" + a1.getBalance());
		if (a1.getBalance() > 50000) {
			System.out.println("balance is greater than 50000, we need to enter pan card number also.");

			System.out.println("Enter the pancard number=> ");
			a1.setPancard(sc.nextDouble());

			System.out.println("pan card number=> " + a1.getPancard());
		} else {
			System.out.println("The balance is less than 50000 ,so no need to enter the pancard..");
		}

		System.out.println("***********************************");
	}

	public void withdraw() {
		System.out.println("Enter the balance =>");
		a1.setBalance(sc.nextInt());

		if (a1.getBalance() < 500) {
			System.out.println("maintain min balance 500");
		} else {

			System.out.println("not maintain min balance 500");
		}
		System.out.println("*************************");
	}

	public static void main(String[] args) {

		AccountTest aTest = new AccountTest();
		aTest.deposite();
		aTest.withdraw();

		Account a2 = new Account(44, "suyog",9471, "sbi", 4923487);
		Account a3 = new Account(45, "omkar", 8921, "maha", 487942);
		Account a4 = new Account(46, "viivek", 3921, "canara",1234487);


		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		
		System.out.println("********************");
		
		System.out.println(" change the bank name of all objects to “Punjab bank”.   ");
		a2.setBankname("Panjab Bank");
		a3.setBankname("Panjab Bank");
		a4.setBankname("Panjab Bank");
		
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		
		
	}

}
