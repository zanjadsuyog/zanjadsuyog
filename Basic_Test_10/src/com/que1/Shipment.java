package com.que1;

public class Shipment {

	/*
	 * Create List<Shipment>in which sorting is done according cities and if two
	 * order have same cities than according to shipment date(Ascending) 
	 * Shipment
	 * class (int shipId, String Cust_name, Address addr, MyDate shipDate)
	 *  Address
	 * class (String addr, String City, String State) 
	 * MyDate class (int dd,mm,yy)
	 */

	private int shipId;
	private String cust_name;
	private Address addr;
	private myDate shipDate;

	public Shipment() {
		super();
	}

	public Shipment(int shipId, String cust_name, Address addr, myDate shipDate) {
		super();
		this.shipId = shipId;
		this.cust_name = cust_name;
		this.addr = addr;
		this.shipDate = shipDate;
	}

	public int getShipId() {
		return shipId;
	}

	public void setShipId(int shipId) {
		this.shipId = shipId;
	}

	public String getCust_name() {
		return cust_name;
	}

	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}

	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}

	public myDate getShipDate() {
		return shipDate;
	}

	public void setShipDate(myDate shipDate) {
		this.shipDate = shipDate;
	}

	@Override
	public String toString() {
		return "Shipment [shipId=" + shipId + ", cust_name=" + cust_name + ", addr=" + addr + ", shipDate=" + shipDate
				+ "]";
	}

}
