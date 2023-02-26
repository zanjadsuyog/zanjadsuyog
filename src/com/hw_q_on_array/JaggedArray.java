package com.hw_q_on_array;

public class JaggedArray {

	public static void main(String[] args) {

		// jaged array print

		int arr[][] = { { 2, 3, 5, 6, 7 },
				{ 4, 7, 8 }, 
				{ 1, 9, 6, 3 },
				{ 1, 2, 3, 21, 23, 4, 5, 6 },
				{10}
				};
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
				
			{
				System.out.print(arr[i][j] + "  ");
			}
			System.out.println();
		}
	
	}

}
