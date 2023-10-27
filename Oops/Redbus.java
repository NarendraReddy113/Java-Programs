package Oops;

public class Redbus {

	private Ticket ticket;

	public void bookTicket(Ticket ticket) {
		if (ticket!=null) {
			this.ticket=ticket;
			System.out.println("Ticket is booked succesfully");
		}else {
			System.out.println("Ticket is not booked");
		}
	}
	public void selectTravels() {
		
	}
}
