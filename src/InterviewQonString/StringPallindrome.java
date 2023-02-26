package InterviewQonString;

import java.util.Scanner;

public class StringPallindrome {

	public static void reverseDisplay(String str1) {

		String rev = "";
		for (int i = str1.length() - 1; i >= 0; i--) {
			rev = rev + str1.charAt(i);
		}
		
		System.out.println(rev);
		if (str1.equals(rev)) {
			System.out.println("String is Pallindrome........ ");
		} else {
			System.out.println("String is not pallindrome.......");
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str1 = sc.next();
		
		System.out.println(str1);
		
		reverseDisplay(str1);

	}

}
