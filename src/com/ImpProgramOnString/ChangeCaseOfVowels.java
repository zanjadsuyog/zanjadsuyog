package com.ImpProgramOnString;

public class ChangeCaseOfVowels {

	public static void replacevowels(String str) {

		for (int i = 0; i <= str.length() - 1; i++) {

			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {

				System.out.println(str.toLowerCase());
			}
		}
.
	}

	public static void main(String[] args) {

		String str = "My name Is Zanjad Suyog Haribhau";

		replacevowels(str);

	}

}
