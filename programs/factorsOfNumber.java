package programs;

import java.util.Scanner;

public class factorsOfNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number:");
		int number = scanner.nextInt();
		factor(number);
	}

	public static void factor(int number) {
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				System.out.println(i);
			}
		}

	}
}
