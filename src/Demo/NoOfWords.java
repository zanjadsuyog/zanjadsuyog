package Demo;

public class NoOfWords {

	public static void main(String[] args) {

		String input = "This is a sample input string.";

		String[] words = input.split("\s+");

		int wordCount = words.length;

		System.out.println("The number of words in the input string is: " + wordCount);
	}

}
