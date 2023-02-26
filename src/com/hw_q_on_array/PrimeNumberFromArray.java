package com.hw_q_on_array;

public class PrimeNumberFromArray {

	
	public static void display(int arr[])
	{
		for (int i = 0; i <arr.length; i++) {
			boolean isPrime = true;
		     int flag=0;
			
			for (int j = 2; j <arr[i]; j++) {
				if (arr[i] % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime &&  arr[i] > 1) {
				System.out.print(arr[i] + " ");
			}
		}
	}
	public static void main(String[] args) {
		
		int arr[]= { 2, 4, 7, 9, 12, 13, 16, 18, 19, 23 };
		
		System.out.print("Prime numbers in the array: ");
		display(arr);
		
	}
}
