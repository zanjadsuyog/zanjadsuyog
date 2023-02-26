package InterviewQonString;

import java.util.Arrays;

public class Sorting {
	
	public static void display(String str) {
		char[] chars = str.toCharArray();

		Arrays.sort(chars);

		String sortedStr = new String(chars);
		System.out.println(sortedStr);
	}

	public static void main(String[] args) {
		String str = "kaykarto";
		display(str);
		
	}
}
