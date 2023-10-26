package programs;

public class Calculator {

	public static void addition(int a, int b) {
		int res = a + b;
		System.out.println(a + " + " + b + " = " + res);
	}

	public static void subtraction(int a, int b) {
		int res = a - b;
		System.out.println(a + " - " + b + " = " + res);
	}

	public static void mutliplication(int a, int b) {
		int res = a * b;
		System.out.println(a + " * " + b + " = " + res);
	}

	public static void division(int a, int b) {
		int res = a / b;
		System.out.println(a + " / " + b + " = " + res);
	}

	public static void modulus(int a, int b) {
		int res = a % b;
		System.out.println(a + " % " + b + " = " + res);
	}
}
