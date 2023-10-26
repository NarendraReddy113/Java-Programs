package programs;

import java.util.Scanner;

public class NeonNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a neon number");
		int n = scanner.nextInt();
		int square = n * n;
		int sum = 0;
		while (square != 0) {
			int res = square % 10;
			sum = sum + res;
			square = square / 10;
		}
		if (n == sum) {
			System.out.println(n + " is a neon number");
		} else {
			System.out.println(n + " is not a neon number");
		}
	}
}
