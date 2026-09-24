package classes;

public class TicketBook {
	private Ticket[] tickets;
	private int count; 
	
	TicketBook() {
		this.count = 0;
		this.tickets = new Ticket[10];
	}
	
	public void createTicket(int id, Event event, TicketType type, String studentName) {
		if (count != 10) {
			this.tickets[count] = new Ticket(id, event, type, studentName, false, false);
			count++;
		} else
		{
			throw new IllegalArgumentException("Tickets at capacity, the ticket book is full!"); // Error handling for if tickets array is full
		}
	}
	
	public Ticket findById(int id) {
		for (int i=0; i<count; i++) {
			if (this.tickets[i].getId() == id) {
				return this.tickets[i];
			}
		}
		return null;
	}
	
	public void printAll() {
		for (int i=0; i<count; i++) {
			System.out.println(this.tickets[i].toString());
		}
	}
	
	public void printForEvent(Event event) {
		for (int i=0; i<count; i++) {
			if (this.tickets[i].getEvent() == event) {
				System.out.println(this.tickets[i].toString());
			}
		}
	}
}