package programs;

import java.util.Scanner;

public class MultiplesOfNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Teacher,please tell a number");
		int n = scanner.nextInt();

		for (int i = 1; i <= 10; i++) {
			System.out.println(n + " * " + i + " = " + (n * i));
		}
	}
}
