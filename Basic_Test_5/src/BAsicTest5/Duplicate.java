package BAsicTest5;

public class Duplicate {

	public static void duplicate(char input[]) {
		for (int i = 0; i < input.length; i++) {
			for (int j = i + 1; j < input.length; j++) {
				if (input[i] == input[j])
					System.out.println(input[j]);
			}
		}
	}

	public static void main(String[] args) {

		// Write a program which deletes the duplicate elementts from Array
		// input :[a,b,b,n,u,y,x,s,y]
		// output: [a,n,u,x,s]

		char input[] = { 'a', 'b', 'b', 'n', 'u', 'y', 'x', 's', 'y' };

		// int output[]= {'a','n','u','x','x'};
		// System.out.println(Arrays.toString(input));
		duplicate(input);

		
		}

}
