package Test2;

import java.util.Scanner;

public class Automorphic {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number=>");
		int num = sc.nextInt();
		int rem;
		int square = num * num;
		int count = 0;
		int originalno = num;

		while (originalno > 0) {
			rem = originalno % 10;
			count++;
			originalno = originalno / 10;

		}
		int last = (int) (square % (Math.pow(10, count)));
		if (num == last) {
			System.out.println("The number Automorphic");
		} 
		else {
            System.out.println("The number  is Not Automorphic");
			}
	}

}
