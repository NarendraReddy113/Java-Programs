package programs;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a perfect number");
		int n = scanner.nextInt();
		long l = perfect(n);
		if (n == 1) {
			System.out.println(n + " is a perfect number");
		} else {
			System.out.println(n + " is not a perfect number");

		}
	}

	private static long perfect(long n) {
		int sum = 0;
		for (int i = 1; i <= n / 2; i++) {//1<=3
			if (n % i == 0) {
				sum = sum + i;
			}
		}
		return sum;
	}
}
