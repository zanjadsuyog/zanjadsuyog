package com.Car;

public class Car {

//	. Create a Car class having carid, brand, modelnumber, price, fuel. Create overloaded method to enter car details
//	enterDetails(carid, brand, modelnumber)
//	enterDetails(carid, brand, modelnumber, price)
//	enterDetails(carid,brand,modelnumber,price,fuel)
//
//	Create 3 objects( take input from user) and display the details

	private int carid;
	private String brandname;
	private int modelnumber;
	private int price;
	private String fuel;

	public int getCarid() {
		return carid;
	}

	public void setCarid(int carid) {
		this.carid = carid;
	}

	public String getBrandname() {
		return brandname;
	}

	public void setBrandname(String brandname) {
		this.brandname = brandname;
	}

	public int getModelnumber() {
		return modelnumber;
	}

	public void setModelnumber(int modelnumber) {
		this.modelnumber = modelnumber;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getFuel() {
		return fuel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

	@Override
	public String toString() {
		return "Car Details carid=" + carid + ", brandname=" + brandname + ", modelnumber=" + modelnumber + ", price=" + price
				+ ", fuel=" + fuel + "  ";
	}

}
