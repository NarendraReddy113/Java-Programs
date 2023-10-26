package programs;

public class GreatestAndSmallest {

	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 20;
		int n3 = 30;

		// Greatest
		if (n1 > n2 & n2 > n3)
			System.out.println(n1 + "is greatest");
		else if (n2 > n3)
			System.out.println(n2 + "is greatest");
		else
			System.out.println(n3 + "is greatest");

		// Smallest
		if (n1 < n2 & n2 < n3)
			System.out.println(n1 + "is smallest");
		else if (n2 < n3)
			System.out.println(n2 + "is smallest");
		else
			System.out.println(n3 + "is smallest");

	}
}
