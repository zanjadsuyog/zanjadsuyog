package InterviewQonString;

public class SplitMethod {

	public static void display(String str) {
		String[] arr = str.split(",");
		for (String s : arr) {
			System.out.println(s);
		}

	}

	public static void main(String[] args) {

		String str = "apple,banana,orange,mango";
		display(str);

	}
}
