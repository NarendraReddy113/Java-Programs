package programs;


import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Number:");
		int n = scanner.nextInt();
		fact(n);
	}

	public static void fact(int n) {
		int fact = 1;
		for (int i = n; i >= 1; i--) {
			fact = fact * i;
		}
		System.out.println("Factorial of " + n + " is " + fact);
	}
}
