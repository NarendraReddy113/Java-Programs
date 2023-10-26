package programs;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Eneter a strong number");
		int n = scanner.nextInt();
		int temp = n;
		int sum = 0;
		while (temp != 0) {
			int fact = 1;
			int r = temp % 10;
			for (int i = r; i >= 1; i--) {
				fact = fact * i;
			}
			sum = sum + fact;
			temp = temp / 10;
		}
		if (sum == n) {
			System.out.println(n + " is a strong number");
		} else {
			System.out.println(n + " is not a strong number");
		}
	}
}
