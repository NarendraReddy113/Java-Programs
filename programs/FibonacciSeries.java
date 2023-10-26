package programs;

import java.util.Scanner;

//public class FibannociSeriesProgram {
//
//	public static void main(String[] args) {
//		Scanner scanner=new Scanner(System.in);
//		System.out.println("Enter the number of terms: ");
//		int n1=scanner.nextInt();
//		int n2=scanner.nextInt();
//		
//		int n11 = 0;
//		int n21 = 1;
//
//		System.out.println("Fibonacci Series: ");
//		int count = 20;
//		for (int i = 2; i < count; i++) {
//			int n3 = n11 + n21;
//			System.out.print(n3 + " ");
//			n11 = n21;
//			n21 = n3;
//		}
//
//	}
//}



public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int numTerms = scanner.nextInt();
        
        int firstTerm = 0;
        int secondTerm = 1;
        
        System.out.print("Fibonacci Series: ");
        for (int i = 1; i <= numTerms; i++) {
            System.out.print(firstTerm + " ");
            
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
        
        scanner.close();
    }
}
