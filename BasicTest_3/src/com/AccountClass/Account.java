package com.AccountClass;

public class Account {
	// 3. Create a Account class having accid, name, balance, bankname, pan card.
//	Create constructors and getter setters. 
//	a.)	Overload the deposit method in which if the balance is greater than 50000, we need to enter pan card number also.
//	b.)	Create withdraw method and withdraw if only after withdrawal the balance is greater than 500(maintain min balance 500)
//	c.)	Create min 3 objects. Later change the bank name of all objects to “Punjab bank”.

	private int acid;
	private String name;
	private int balance;
	private String bankname;
	private double pancardno;

	public Account() {

	}

	public Account(int acid, String name, int balance, String bankname, double pancard) {
		super();
		this.acid = acid;
		this.name = name;
		this.balance = balance;
 		this.bankname = bankname;
		this.pancardno = pancard;
	}

	public int getAcid() {
		return acid;
	}

	public void setAcid(int acid) {
		this.acid = acid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public String getBankname() {
		return bankname;
	}

	public void setBankname(String bankname) {
		this.bankname = bankname;
	}

	public double getPancard() {
		return pancardno;
	}

	public void setPancard(double pancard) {
		this.pancardno = pancard;
	}

	@Override
	public String toString() {
		return "Account [acid=" + acid + ", name=" + name + ", balance=" + balance + ", bankname=" + bankname
				+ ", pancardno=" + pancardno + "]";
	}
	

}
