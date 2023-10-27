package Oops;

import java.util.Scanner;

public class MobileDriver {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Mobile mobile = new Mobile("Redmi", 34000);
		boolean exit = true;
		while (exit) {
			System.out.println(
					"Enter your choice \n1.insert earphone \n2.remove earphone \n3.earphone&mobile datils \n4.exit");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1: {
				System.out.println("Enter earphone brand");
				String brand = scanner.next();
				System.out.println("Enter the price");
				int price = scanner.nextInt();
				System.out.println("Enter the color");
				String color = scanner.next();
				mobile.insertEarphone(new Earphone(brand, price, color));
			}
				break;
			case 2: {
				mobile.removeEarphone();
			}
				break;
			case 3: {
				mobile.mobileWithEarphoneDetails();
			}
				break;
			case 4: {
				exit = false;
				System.out.println("Thank You!....");
			}
			default: {
				System.out.println("Invalid Choice");
			}
				break;
			}
		}
	}
}
