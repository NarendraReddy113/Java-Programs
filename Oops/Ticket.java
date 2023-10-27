package Oops;

import java.util.Objects;

public class Ticket {
	private int ticketNo;
	private String boarding;
	private String destination;

	Ticket() {
	}

	Ticket(int ticketNo) {
		this();
		this.ticketNo = ticketNo;
	}

	Ticket(int ticketNo, String boarding) {
		this(ticketNo);
		this.boarding = boarding;
	}

	Ticket(int ticketNo, String boarding, String destination) {
		this(ticketNo, boarding);
		this.destination = destination;
	}

	public int getTicketNo() {
		return ticketNo;
	}

	public String getBoarding() {
		return boarding;
	}

	public void setBoarding(String boarding) {
		this.boarding = boarding;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	@Override
	public String toString() {
		return ticketNo + "\n" + boarding + "\n" + destination;
	}

	@Override
	public boolean equals(Object o) {
		Ticket t = (Ticket) o;
		return this.ticketNo == t.ticketNo && this.boarding.equals(t.boarding)
				&& this.destination.equals(t.destination);
	}

	@Override
	public int hashCode() {
		return Objects.hash(ticketNo, boarding, destination);
	}

	public void ticketDetails() {
		System.out.println("Ticket number : " + ticketNo);
		System.out.println("Boarding point : " + boarding);
		System.out.println("Destination : " + destination);

	}
}
