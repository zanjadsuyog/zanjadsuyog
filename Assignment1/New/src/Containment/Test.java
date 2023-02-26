package Containment;

public class Test {

	public static void main(String[] args) {

		Author a1 = new Author(1, "Suyog");

		Author a2 = new Author(2, "Omkar");
		
		Book b1=new Book(11,"Java",243,a1);
		Book b2=new Book(12,"Html",123,a2);
		
		System.out.println(b1);
		System.out.println(b2);
	}

}
