package Demo;

public class DuplicateElement {

	public static void main(String[] args) {

		String myString = "Hello World!";
		char myChar = 'l';

		myString = myString.replaceAll(String.valueOf(myChar), String.valueOf(myChar) + String.valueOf(myChar));

		System.out.println(myString);

	}

}
