package Q5;

public class Book {

// Write a program to create a Book class having id, name, price. Create containment of author (id, name, address).
// Create constructor and getter and setters. Create anonymous author object in book.

	private int id;
	private String name;
	private int price;

	public Book(int id, String name, int price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "BookDetails: " + id + "  " + name + "   " + price;
	}

}
