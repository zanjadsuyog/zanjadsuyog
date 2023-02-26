package Demo;

public class NoElement {

	public static void display(String s1) {

		int count = 0;
		for (int i = 0; i < s1.length(); i++) {
			count++;
		}

		System.out.println(count);
	}

	public static void main(String[] args) {

		String str1 = "hellowworld";

		display(str1);
	}
}
