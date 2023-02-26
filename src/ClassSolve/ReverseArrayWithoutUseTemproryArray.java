package ClassSolve;

public class ReverseArrayWithoutUseTemproryArray {

	public static void main(String[] args) {
		int[] arr = { 3, 90, 45, 29, 37, 78 };

		// Iterate over the array in reverse order and print the elements
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
	}

}
