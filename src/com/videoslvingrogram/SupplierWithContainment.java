package com.videoslvingrogram;

class Supplier1 {

	int supid;
	String supName, mobileNo;
	Item[] itemssupplied;

	@Override
	public String toString() {
		return "Supplier id:" + supid + "\nSupplier Name;" + supName + "\nMobile Number:" + mobileNo
				+ Arrays.toString(itemssupplied);
	}

	public Supplier1() {

	}

	public Supplier1(int supid, String supName, String mobileNo, Item[] items) {
		this.supid = supid;
		this.supName = supName;
		this.mobileNo = mobileNo;
		this.itemssupplied = items;
	}
}

public class SupplierWithContainment {

	public static void main(String args[]) {
		Item items[] = new Item[2];
		items[0] = new Item(1, "Soap");
		items[1] = new Item(2, "facewash");
		Supplier1 s1 = new Supplier1(100, "Mr.ABC", "1854346253", items);

		Supplier1 s[];
		s = new Supplier1[5];

		s[0] = new Supplier1(100, "Mr.ABC", "6511516111631", items);
		s[1] = new Supplier1(100, "Mr.DEF", "8452153132112", items);
		s[2] = new Supplier1(100, "Mr.DVB", "7845132151359", items);
		s[3] = new Supplier1(100, "Mr.JFG", "9845115615151", items);
		s[4] = new Supplier1(100, "Mr.DXB", "4548514151545", items);

		/*
		 * System.out.println("Suppliers record are:"); for (int i = 0; i < s.length;
		 * i++) { System.out.println(s[i]);
		 * System.out.println("----------------------------"); }
		 */
	}

}
