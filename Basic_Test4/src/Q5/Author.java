package Q5;

public class Author {

	private  Book id;
	private String name;
	private String address;

	public Author( Book id,String  name, String address) {
	    this.id = id;
		this.name = name;
		this.address = address;
	}

	public Book getId() {
		return id;
	}

	public void setId(Book id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "    " + id + "   " + name + "   " + address;
	}

}
