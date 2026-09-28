package classes;

public class Main {
	public static void main(String[] args) {
		TicketBook ticketBook = new TicketBook();
		TicketManager ticketManager = new TicketManager(ticketBook);
		
		//create 2 events
		System.out.println("Creating Events");
		Event event1 = new Event("Football Game", "Memorial Stadium");
		Event event2 = new Event("Campus Concert", "Memorial Union");
		System.out.println("Created: " + event1);
        System.out.println("Created: " + event2);
        System.out.println();
		
		//create 2 ticket types
		System.out.println("Creating Ticket Types");
		TicketType standard = new TicketType("Standard", 49.99);
        TicketType vip = new TicketType("VIP", 99.99);
        System.out.println("Created: " + standard);
        System.out.println("Created: " + vip);
        System.out.println();
        
		//create 5 tickets with different events/types
		System.out.println("Creating Tickets");
		ticketManager.createTicket(event1, standard, "Bob");
		ticketManager.createTicket(event1, standard, "Jean");
		ticketManager.createTicket(event1, vip, "Brian");
		ticketManager.createTicket(event2, standard, "Thomas");
		ticketManager.createTicket(event2, vip, "Kate");
		System.out.println("Tickets Created");
		System.out.println();
		
		//cancel 1 ticket
		System.out.println("Cancelling Ticket ID: 3");
		boolean cancelSuccess = ticketManager.cancelTicket(3);
		System.out.println("Cancelled Ticket 3: " + cancelSuccess);
        System.out.println();
        
		//admit ticket
        System.out.println("Admitting Ticket ID: 1");
        boolean admitSuccess = ticketManager.admitTicket(1);
        System.out.println("Admitted Ticket 1: " + admitSuccess);
        System.out.println();
        
		//try to admit a cancelled ticket
        System.out.println("Attempting to Admit Cancelled Ticket ID: 3");
        boolean admitCancelledResult = ticketManager.admitTicket(3);
        System.out.println("Admitted Ticket 3: " + admitCancelledResult + " (Expected: false)");
        System.out.println();
        
		//print all tickets
        System.out.println("Printing All Tickets");
        ticketBook.printAll();
        System.out.println();
        
		//print a tickets for a specific event
        System.out.println("Printing Tickets for Event 1: " + event1.getEventName());
        ticketBook.printForEvent(event1);
	}
}
