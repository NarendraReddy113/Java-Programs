package Oops;

public class Airport {
	static String airportName = "Kempegowda Airport";
	User u;
	Ticket t;

	public void bookTicket(User user, Ticket t) {
		if (this.u == null) {
			this.u = user;
			System.out.println("User is created");
			if (this.t == null) {
				this.t = t;
				System.out.println("Ticket is booked");
			} else {
				System.out.println("Ticket is already booked");
			}
		} else {
			System.out.println("User is already present");
		}
	}

	public void cancelTicket(int ticketNo) {
		if (this.u != null) {
			if (this.t != null) {
				if (t.getTicketNo() == ticketNo) {
					this.t = null;
					System.out.println("Ticket is cancelled");
				} else {
					System.out.println("No ticket found");
				}
			} else {
				System.out.println("No ticket to remove");
			}
		} else {
			System.out.println("No user to cancel the ticket");
		}
	}

	public boolean modifyTicket(int ticketNo) {
		if (this.t != null && this.u != null) {
			if (t.getTicketNo() == ticketNo) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	public void ticketDetails(int ticketNo)
 {
  if(this.t!=null && this.u!=null)
  {
   if(t.getTicketNo()==ticketNo)
   {
    u.userDetails();
    t.ticketDetails();
   }
   else
   {
    System.out.println("Ticket number is not matching");
   }
  }
  else
  {
   System.out.println("No user is present & no ticket is booked");
  }
 }
}