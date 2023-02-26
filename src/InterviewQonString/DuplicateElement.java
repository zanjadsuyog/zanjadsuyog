package InterviewQonString;

public class DuplicateElement {

	public static void DisplayDuplicate(String s) {

		char arr[] = s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j < s.length(); i++) {
				if (arr[i] == arr[j]) {
					break;
				}
				System.out.println("Duplicate : " + arr[j]);

			}
		}

	}

	public static void main(String[] args) {

		String s = "mumbai indainss ";
		DisplayDuplicate(s);

	}

}
