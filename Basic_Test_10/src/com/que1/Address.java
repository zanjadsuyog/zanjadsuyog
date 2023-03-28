package com.que1;

public class Address {

//	Address class (String addr, String City, String State)

	private String addr;
	private String city;
	private String state;
	
	public Address()
	{
		
	}

	public Address(String addr, String city, String state) {
		super();
		this.addr = addr;
		this.city = city;
		this.state = state;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Address [addr=" + addr + ", city=" + city + ", state=" + state + "]";
	}
	

}
