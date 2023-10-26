package programs;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = scanner.nextInt();
		int temp = n;
		int sum = 0;
		while (temp != 0) {
			int rem = temp % 10;
			sum = (sum * 10) + rem;
			temp = temp / 10;
		}
		if (n == sum)
			System.out.println(n + " is a Palindrome number");
		else
			System.out.println(n + " is not a Palindrome number");
	}
}
