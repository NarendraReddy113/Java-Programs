package programs;

import java.util.Scanner;

public class CalculatorDriver {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean exit = true;
		while (exit) {
			System.out.println(
					"Enter your choice \n 1.addition \n 2.subtraction \n 3.mutliplication \n 4.division \n 5.modulus \n 6.exit");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1: {
				System.out.println("Enter the number");
				int a = scanner.nextInt();
				System.out.println("Enter the number");
				int b = scanner.nextInt();
				Calculator.addition(a, b);
			}
				break;
			case 2: {
				System.out.println("Enter the number");
				int a = scanner.nextInt();
				System.out.println("Enter the number");
				int b = scanner.nextInt();
				Calculator.subtraction(a, b);
			}
				break;
			case 3: {
				System.out.println("Enter the number");
				int a = scanner.nextInt();
				System.out.println("Enter the number");
				int b = scanner.nextInt();
				Calculator.mutliplication(a, b);
			}
				break;
			case 4: {
				System.out.println("Enter the number");
				int a = scanner.nextInt();
				System.out.println("Enter the number");
				int b = scanner.nextInt();
				Calculator.division(a, b);
			}
				break;
			case 5: {
				System.out.println("Enter the number");
				int a = scanner.nextInt();
				System.out.println("Enter the number");
				int b = scanner.nextInt();
				Calculator.modulus(a, b);
			}
				break;
			case 6: {
				exit = false;
				System.out.println("Thank You....!");
			}

			default:
				System.out.println("Invalid choice");
				break;
			}
		}
	}
}
