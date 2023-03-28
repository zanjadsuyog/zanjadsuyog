package Q7;

class Super {

	void method1() {
		System.out.println("I am method of Super class..");
	}

	void method2() {
		System.out.println("I am method of Super class...");
	}
}

public class Sub extends Super {
	@Override
	void method2() {
		System.out.println("I am method of sub class..");
	}

	void method3() {
		System.out.println("I am method of sub class..");
	}


	public static void main(String[] args) {
		Sub super1 = new Sub();
		super1.method2();
		super1.method1();
	}
}
