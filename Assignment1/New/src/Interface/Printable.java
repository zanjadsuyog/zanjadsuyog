package Interface;

public interface Printable {
	void print();
}

interface Showable {
	void show();
}

class Display implements Printable, Showable {
	@Override
	public void print() {
		System.out.println("Hello");
	}

	@Override
	public void show() {
		System.out.println("Welcome");
	}


}
