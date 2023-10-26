package programs;

import java.util.Iterator;
import java.util.Scanner;

public class InvertedHalfPyramid1 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int num=scanner.nextInt();
		
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= 5 - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
