package Q9;

public class Marks {

	// constructorChanning

	Marks() {
		this(6);
		System.out.println("I am default constrictor");
	}

	Marks(int x) {
		this(5, 9);
		System.out.println(x);
		System.out.println(" I am parameterized Constructor 1");
	}

	Marks(int x, int y) {

		System.out.println(x + y);
		System.out.println("I am parameterized constructor 2");
	}

	public static void main(String[] args) {

		new Marks();
	}

}
