package com.hw_q_on_array;

public class Mul1DMatrix {

	public static void main(String[] args) {

		// multiplecation of two matrix

		// 1 d array

		int[] a= { 2, 3, 4, 5 };
		int product = 1;
		for (int i = 0; i <a.length; i++) {
			product =product* a[i];
		}
		System.out.println("Product: " + product);
	}

}
