package DiamondProblem;

interface Interface {
	default void display() {
		System.out.println("The dispaly() method invoked");
	}
}

interface Interface1 extends Interface {

}

interface Interface2 extends Interface {

}

public class DemoClass implements Interface1, Interface2 {
	public static void main(String args[]) {
		DemoClass d1 = new DemoClass();
		d1.display();
	}

}
