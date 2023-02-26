package com.ImpProgramOnString;

import java.util.Scanner;

public class PrintNextAlphabate {


public static void nextchar(String str) {
	for (int i = 0; i < str.length(); i++) {
		char c = str.charAt(i);
		if (Character.isLetter(c)) {
			char nextChar = (char) (c + 1);
			if (nextChar > 'z') {
				nextChar = 'a';
			} else if (nextChar > 'Z' && nextChar < 'a') {
				nextChar = 'A';
			}
			System.out.print(nextChar);
		} else {
			System.out.print(c);
		}
	}
	
}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String str = input.nextLine();
		
		nextchar(str);

		
	}
}
