package com.que1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShipmentTest {

	// Create List<Shipment>in which sorting is done according cities and if two
	// order have same cities than according to shipment date(Ascending)

	public static void main(String[] args) {

		myDate m1 = new myDate(15, 04, 2020);
		myDate m2 = new myDate(17, 02, 2022);
		myDate m3 = new myDate(25, 5, 2021);

		Address a1 = new Address("Wagholi", "Pune", "Maharashtra");
		Address a2 = new Address("Parner", "Anagar", "Maharashtra");
		Address a3 = new Address("Sangavi", "Mumbai", "UP");
     	Address a4 = new Address("Sangavi", "Latur", "UP");


		List<Shipment> list = new ArrayList<>();
	/*	list.add(new Shipment(101, "Zanjad Suyog", a1, m1));
		list.add(new Shipment(102, "Adinath Patil", a2, m2));
		list.add(new Shipment(103, "Omkar Dhamane", a3, m3));
		list.add(new Shipment(104, "Vivek Dange", a1, m3));
*/
		 list.add(new Shipment(101,"Suyog zanjad",a1,m1));
		 list.add(new Shipment(102, "Adinath Patil", a2, m2));
		 list.add(new Shipment(103, "Omkar Dhamane", a3, m3));
		 list.add(new Shipment(103, "Adinath patil", a4, m3));

		 System.out.println("Before Sorting..............");
		 System.out.println("=================================================");
		 for(Shipment s1:list)
		 {
			 System.out.println(s1);
		 }
		 System.out.println("=================================================");

		 System.out.println("After Sorting..............");
		 System.out.println("=================================================");


		 Collections.sort(list, new SortBasicOfCities());
		 
		 for(Shipment s1:list)
		 {
			 System.out.println(s1);
		 }
	}

}
