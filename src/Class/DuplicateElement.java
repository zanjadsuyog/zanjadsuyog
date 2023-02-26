package Class;

public class DuplicateElement {

	public static void main(String[] args) {

		int a[] = { 2, 3, 4, 5, 6, 4, 3, 2, 8, 4 };

		System.out.println("Duplicate value are=>");
		for (int i = 0; i <= a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if ((a[i] == a[j]) && (i != j))

				{
					System.out.println(a[j] + " ");
				}
			}
		}
	}

}
