package Oops;

import java.util.Scanner;

public class AirportDriver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Airport a = new Airport();
		boolean exit = true;
		while (exit) {
			System.out.println(
					"Enter your choice \n1.Book ticket \n2.Cancel ticket \n3.Modify ticket \n4.Ticket details \n5.Exit");
			int choice = sc.nextInt();
			switch (choice) {
			case 1: {
				System.out.println("Enter user name");
				String userName = sc.next();
				System.out.println("Enter contact number");
				long cno = sc.nextLong();
				System.out.println("Enter your gender");
				String gender = sc.next();
				System.out.println("Enter ticket number");
				int ticketNo = sc.nextInt();
				System.out.println("Enter boarding point");
				String boarding = sc.next();
				System.out.println("Enter destination");
				String destination = sc.next();
				a.bookTicket(new User(userName, cno, gender), new Ticket(ticketNo, boarding, destination));
			}
				break;
			case 2: {
				System.out.println("Enter ticket number");
				int ticketNo = sc.nextInt();
				a.cancelTicket(ticketNo);
			}
				break;
			case 3: {
				System.out.println("Enter ticket number");
				int ticketNo = sc.nextInt();
				if (a.modifyTicket(ticketNo)) {
					System.out.println("1.Boarding \n2.Destintion \n3.Both boarding point & destination");
					int choices = sc.nextInt();
					switch (choices) {
					case 1: {
						System.out.println("Enter new boarding point");
						String newBoarding = sc.next();
						a.t.setBoarding(newBoarding);
						System.out.println("Boarding point has been changed");
					}
						break;
					case 2: {
						System.out.println("Enter new destination");
						String newDestination = sc.next();
						a.t.setDestination(newDestination);
						System.out.println("Destination has been changed");
					}
						break;
					case 3: {
						System.out.println("Enter new boarding point");
						String newBoarding = sc.next();
						a.t.setBoarding(newBoarding);
						System.out.println("Enter new destination");
						String newDestination = sc.next();
						a.t.setDestination(newDestination);
						System.out.println("Boarding & Destination has been set");
					}
						break;
					default: {
						System.out.println("Invalid choice!");
					}
					}
				} else {
					System.out.println("User & Ticket is not found");
				}
			}
				break;
			case 4: {
				System.out.println("Enter ticket number");
				int ticketNo = sc.nextInt();
				a.ticketDetails(ticketNo);
			}
				break;
			case 5: {
				exit = false;
				System.out.println("Thank you..!");
			}
				break;
			default: {
				System.out.println("Check the options & give valid input");
			}
			}
		}
	}

}
