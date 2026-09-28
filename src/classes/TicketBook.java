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
			tickets[count] = new Ticket(id, studentName, event, type,  false, false);
			count++;
		} else
		{
			throw new IllegalArgumentException("Tickets at capacity, the ticket book is full!"); // Error handling for if tickets array is full
		}
	}
	
	public Ticket findById(int id) {
		for (int i=0; i<count; i++) {
			if (tickets[i].getID() == id) {
				return tickets[i];
			}
		}
		return null;
	}
	
	public void printAll() {
		for (int i=0; i<count; i++) {
			System.out.println(tickets[i].toString());
		}
	}
	
	public void printForEvent(Event event) { // for this method, I decided to use a getter from the Ticket class in order to keep the field of "event" private and allow the Ticket class to return it instead, following demeter's law
		for (int i=0; i<count; i++) {
			if (tickets[i].getEvent() == event) {
				System.out.println(tickets[i].toString());
			}
		}
	}
}