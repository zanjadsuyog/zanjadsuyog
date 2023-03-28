package Test6;

import java.util.Scanner;

public class Average_Of_Digit {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number:  ");
		int num = scanner.nextInt();

		int sum = 0;
		int count = 0;

		while (num != 0) {
			int digit = num % 10;
			sum = sum +digit;
			count++;

			num = num / 10;

		}
		
		double average=(double)sum/count;
		System.out.println("Average of Digit in Given number: "+average);
        
	}

}
