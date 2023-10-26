package programs;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		long n = scanner.nextInt();
		long sum = 0;
		while (n != 0) {
			long rem = n % 10;
			sum = (sum * 10) + rem;
			n = n / 10;
		}
		System.out.println(sum);
	}
}
