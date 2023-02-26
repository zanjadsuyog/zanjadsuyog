package InterviewQonString;

import java.util.Arrays;

public class SortingWord {

	public static void display(String str[]) {
		
		String temp;
		for (int i = 0; i < str.length; i++) {
			for (int j = i + 1; j < str.length; j++) {

				if (str[i].length() == str[j].length()) {
					if ((str[i]).compareTo(str[j]) > 1) {
						temp = str[i];
						str[i] = str[j];
						str[j] = temp;

					} else {
						if (str[i].length() > str[j].length()) {
							temp = str[i];
							str[i] = str[j];
							str[j] = temp;

						}
					}
					Arrays.toString(str);
				//	System.out.println(str);
				}
			}
		}
	}
	public static void main(String[] args) {

		String str[] = { "java", "c", "python", "sql", "Html" };
		display(str);
		
		
	}

}
