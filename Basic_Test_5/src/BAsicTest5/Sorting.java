package BAsicTest5;

import java.util.Arrays;

public class Sorting {
	public static void display(int num[]) {
		int n = num.length;

		Arrays.sort(num);

		
		System.out.println("Second Highest Number: " + num[n - 2]);
	}

	public static void main(String[] args) {

		int num[] = { 1, 9, 5, 2, 8, -1, 3, 55 };
        
		display(num);
	}

}
