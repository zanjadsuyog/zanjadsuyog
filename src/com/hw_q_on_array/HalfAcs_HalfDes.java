package com.hw_q_on_array;

import java.util.Arrays;

public class HalfAcs_HalfDes {

	public static void display(int arr[]) {

		int len = arr.length;
		int mid = len / 2;

		Arrays.sort(arr, 0, mid);

		for (int i = mid; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
				if (arr[j] > arr[i]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}
			}
		}

	}

	public static void main(String[] args) {

		int arr[] = { 12, 33, 42, 67, 97,95,87, 60, 45, 6, 72, 91, 84 };

		display(arr);
		System.out.println(Arrays.toString(arr));
	}

}
