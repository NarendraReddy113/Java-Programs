package programs;

import java.util.Scanner;

public class CheckTheGivenCharacter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char ch = scanner.next().charAt(0);

		String string = (ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') ? " is an alphabet"
				: (ch >= '0' && ch <= '9') ? " is a number" : " is a special character";
		System.out.println(ch + string);
	}
}
