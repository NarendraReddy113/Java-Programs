package programs;

import java.util.Scanner;

public class ArmStrongNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a ArmStrongnumber: ");
		int n = scanner.nextInt();
		if (isArmstrong(n))
			System.out.println(n + " is an Armstrong Number");
		else
			System.out.println(n + " is not a Armstrong number");
	}

	private static boolean isArmstrong(int n) {
		// TODO Auto-generated method stub
		int temp;
		int digits = 0;
		temp = n;
		while (temp != 0) {
			temp = temp / 10;
			digits++;
		}
		temp = n;
		int last;
		double sum = 0;
		while (temp > 0) {
			last = temp % 10;
			sum = sum + Math.pow(last, digits);
			temp = temp / 10;
		}
		if (sum == n)
			return true;
		else
			return false;
	}

}
