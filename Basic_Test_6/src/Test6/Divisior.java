package Test6;

public class Divisior {

	
	//example divisors of 6 are 1, 2, 3 and 6, so divisor_sum should return 12.
	public static int divisor_sum(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				sum += i;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		int n = 6;
		int sum = divisor_sum(n);
		System.out.println("The sum of the divisors of " + n + " is " + sum);
	}
}
