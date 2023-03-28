package Test6;

import java.util.Arrays;

public class Rev {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 5, 7, 3, 4 };

		int n = arr.length;

		// Determine the mid-point of the array
		int mid = n / 2;

		// Reverse the first half of the array
		for (int i = 0; i < mid; i++) {
			int temp = arr[i];
			arr[i] = arr[mid - i - 1];
			arr[mid - i - 1] = temp;
		}

		// Reverse the second half of the array
		for (int i = mid; i < n; i++) {
			int temp = arr[i];
			arr[i] = arr[n - i + mid - 1];
			arr[n - i + mid - 1] = temp;
		}

		// Reverse the entire array
		for (int i = 0; i < n / 2; i++) {
			int temp = arr[i];
			arr[i] = arr[n - i - 1];
			arr[n - i - 1] = temp;
		}

		// Print the reversed array
		System.out.println(Arrays.toString(arr));
	}

}
