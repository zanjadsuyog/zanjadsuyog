package Q12_Stat_ovr_vrii;

public class StaticMethodOverloading {

	private static void num(int x) {
		System.out.println(x);
	}

	private static void num(int x, int y) {
		System.out.println(x + y);

	}

	private static void num(int x, int y, int z) {
		System.out.println(x + y + z);

	}

	private static void num(float x, float y) {
		System.out.println(x * y);
	}
	
	private static void num(float x) {
		System.out.println(x);

	}
	
	public static void main(String[] args) {
		num(2);
		num(3, 7);
		num(4, 5, 8);
	    num(2.77f);
	    num(34.5f, 90.6f );
	}

}
