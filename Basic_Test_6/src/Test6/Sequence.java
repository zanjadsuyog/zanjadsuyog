package Test6;

public class Sequence {

	

		public static void main(String[] args) {
			int n = 15;
			int[] num = new int[n];

			num[0] = 0;
			num[1] = 1;

			for (int i = 2; i < n; i++) {
				num[i] = 2 * num[i - 1] + num[i - 2];
			}

			for (int i = 0; i < n; i++) {
				System.out.print(num[i] + " ");
			}
		}

}
