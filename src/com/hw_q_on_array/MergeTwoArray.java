package com.hw_q_on_array;

public class MergeTwoArray {

	public static void display() {
		
	}
	public static void main(String[] args) {

		int a[] = { 20, 30, 50, 60, 80, 70 };
		int b[] = { 10, 40, 90, 100, 110 };
		int a_length = a.length;
		int b_length = b.length;

		int c_length = a_length + b_length;

		int c[] = new int[c_length];
		for (int i = 0; i < a.length; i++) {
			c[i] = a[i];
		}

		for (int i = 0; i < b_length; i++) {
			c[a.length + i] = b[i];
		}

		System.out.println("After merge two array: ");
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i] + "  ");
		}

	}

}
