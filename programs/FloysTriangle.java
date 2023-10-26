package programs;

import java.util.Scanner;

public class FloysTriangle {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the numbers of rows: ");
		int num=scanner.nextInt();
		int n = 1;
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(n + " ");
				n++;
			}
			System.out.println();
		}
	}
}
