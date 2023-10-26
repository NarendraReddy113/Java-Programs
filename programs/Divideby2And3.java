package programs;

import java.util.Scanner;

public class Divideby2And3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number whichis divide by both 2 &3");
		int number = scanner.nextInt();

		if (number % 2 == 0 && number % 3 == 0) {
			System.out.println(number + " is divided by 2");
		} else {
			System.out.println(number + " is not divdied by 2& 3");
		}

		String res = (number % 2 == 0 && number % 3 == 0) ? "is divisible" : "is not didvisible";
		System.out.println(number + res);
	}
}
