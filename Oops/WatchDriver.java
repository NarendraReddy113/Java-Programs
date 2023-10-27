
package Oops;

import java.util.Scanner;

public class WatchDriver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Watch w = null;
		boolean exit = true;
		while (exit) {
			System.out.println(
					"Enter your choice \n1.Add watch \n2.Fetch watch \n3.Check price \n4.Customize watch \n5.Exit");
			int choice = sc.nextInt();
			switch (choice) {
			case 1: {
				System.out.println("Enter the brand");
				String brand = sc.next();
				System.out.println("Enter the color");
				String color = sc.next();
				System.out.println("Enter the price");
				double price = sc.nextDouble();
				w = new Watch(brand, color, price);
				System.out.println("Watch is added");
			}
				break;
			case 2: {
				if (w != null) {
					w.watchDetails();
				} else {
					System.out.println("Sorry :-( watch is not available");
				}
			}
				break;
			case 3: {
				System.out.println((w != null) ? w.getPrice() : "Not available");
			}
				break;
			case 4: {
				if (w != null) {
					System.out.println("Enter new color");
					String color = sc.next();
					w.setColor(color);
				} else {
					System.out.println("Sorry :-( watch is not available");
				}
			}
				break;
			case 5: {
				exit = false;
				System.out.println("Thank you!");
			}
				break;
			default: {
				System.out.println("Invalid choice");
			}
			}
		}
	}
}
