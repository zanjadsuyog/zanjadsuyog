package q1;

public class Address {
	private String addr;
	String City;
	private String State;

	public Address() {

	}

	public Address(String addr, String city, String state) {
		super();
		this.addr = addr;
		this.City = city;
		this.State = state;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	@Override
	public String toString() {
		return "Address [addr=" + addr + ", City=" + City + ", State=" + State + "]";
	}

}
