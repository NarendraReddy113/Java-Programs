package ExceptionsPrograms;

import java.util.Scanner;

public class AccountDriver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Account a = new Account("Lilly", 18000, 1234);
		boolean exit = true;
		while (exit) {
			System.out
					.println("Enter your choice \n1.Withdraw amount \n2.Balance enquiry \n3.Deposite amount \n4.Exit");
			int choice = sc.nextInt();
			switch (choice) {
			case 1: {
				System.out.println("Enter password");
				int pwd = sc.nextInt();
				System.out.println("Enter amount");
				double amount = sc.nextDouble();
				a.withdraw(pwd, amount);
			}
				break;
			case 2: {
				System.out.println("Enter password");
				int pwd = sc.nextInt();
				a.balanceEnquiry(pwd);
			}
				break;
			case 3: {
				System.out.println("Enter password");
				int pwd = sc.nextInt();
				System.out.println("Enter amount");
				double amount = sc.nextDouble();
				a.deposite(pwd, amount);
			}
				break;
			case 4: {
				exit = false;
				System.out.println("Thank you for using this application..!");
			}
				break;
			default: {
				System.err.println("Invalid choice!");
			}
			}
		}

	}

}