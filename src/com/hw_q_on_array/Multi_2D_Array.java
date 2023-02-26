package com.hw_q_on_array;

public class Multi_2D_Array {

	
	
	public static void main(String[] args) {

		int a[][] = { { 1, 3, 4 }, { 4, 3, 2 } };
		int b[][] = { { 5, 4, 3 }, { 9, 0, 8 } };

		int c[][] = new int[2][3];

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				c[i][j] = (a[i][j] * b[i][j]);

				System.out.print(c[i][j] + "  ");
			}

			System.out.println();
		}
	}
}
