package com.videoslvingrogram;

import java.util.Arrays;

 class Supplier {
	int supid;
	String supname, mobno;

	public Supplier() {

	}

	public Supplier(int supid, String supname, String mobno) {
		super();
		this.supid = supid;
		this.supname = supname;
		this.mobno = mobno;
	}

	@Override
	public String toString() {
		return "supplier details:" + supid + "     " + supname + "   " + mobno;
	}
	}

	public class SupplierArray {

		public static void main(String[] args) {

			Supplier s1[];
			s1= new Supplier[5];
			s1[0] = new Supplier(1, "Suyog", "7486481687");
			s1[1] = new Supplier(2, "Omkar", "7486481687");
			s1[2] = new Supplier(3, "Vivek", "7486481687");
			s1[3] = new Supplier(4, "Gaurav", "7486481687");
			s1[4] = new Supplier(5, "Adinath", "7486481687");

			System.out.println("The supplier record are =>");

			/*
			 * //for(int i=0;i<s1.length;i++) for(Supplier obj:s1) {
			 * System.out.println(obj.toString());
			 * System.out.println("__________________________________"); }
			 */
			
		//	System.out.println(s1);

			System.out.println(Arrays.toString(s1));
		}

}
