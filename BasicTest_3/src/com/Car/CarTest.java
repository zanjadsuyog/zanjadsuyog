package com.Car;

import java.util.Scanner;

public class CarTest {

	public void details(int carid, String brandname, int modelnumber) {

		System.out.println("overloaded method 1");
		System.out.println(carid + "    " + brandname + "     " + modelnumber);
		System.out.println("****************************");

	}

	public void details(int carid, String brandname, int modelnumber, int price) {

		System.out.println("overloaded method 2");
		System.out.println(carid + "    " + brandname + "     " + modelnumber + "  " + price);
		System.out.println("****************************");

	}

	public void details(int carid, String brandname, int modelnumber, int price, String fuel) {

		System.out.println("overloaded method 3");
		System.out.println(carid + "    " + brandname + "     " + modelnumber + "  " + price + "   " + fuel);
		System.out.println("****************************");
	}

	public static void main(String[] args) {

		Car c = new Car();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the car id=>");
		c.setCarid(sc.nextInt());
		System.out.println("Enter the car brandname=>");
		c.setBrandname(sc.next());
		System.out.println("Enter the car modelnumber=>");
		c.setModelnumber(sc.nextInt());
		System.out.println("Enter the car price=>");
		c.setPrice(sc.nextInt());
		System.out.println("Enter the car fuel=>");
		c.setFuel(sc.next());

		System.out.println(c);

		System.out.println("********************************************");

		CarTest ct = new CarTest();
		ct.details(c.getCarid(), c.getBrandname(), c.getModelnumber());
		ct.details(c.getCarid(), c.getBrandname(), c.getModelnumber(), c.getPrice());
		ct.details(c.getCarid(), c.getBrandname(), c.getModelnumber(), c.getPrice(), c.getFuel());

	}

}
