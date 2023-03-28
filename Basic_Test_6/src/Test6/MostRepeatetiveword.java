package Test6;

public class MostRepeatetiveword {

	public static void wordrepete(String str) {
		String[] words = str.split("\\s");

		String mostRepeatedWord = "";
		int maxCount = 0;

		for (int i = 0; i < words.length; i++) {
			int count = 1;

			for (int j = i + 1; j < words.length; j++) {
				if (words[i].equals(words[j])) {
					count++;
				}
			}

			if (count > maxCount) {
				maxCount = count;
				mostRepeatedWord = words[i];
			}
		}

		System.out.println("Most repeated word: " + mostRepeatedWord);
		System.out.println("Number of occurrences: " + maxCount);
	}

	public static void main(String[] args) {
		String str = "hello world world  this is a test hello hello";
		wordrepete(str);

	}

}
