package classes;

public class TicketManager {
	private TicketBook ticketBook;
	private int idGenerator;
	
	TicketManager(TicketBook ticketBook){
		this.ticketBook = ticketBook;
		this.idGenerator = 1;
	}
	
	public void createTicket(Event event, TicketType type, String studentName) {
		this.ticketBook.createTicket(idGenerator, event, type, studentName);
		idGenerator++;
	} 
	
	public boolean cancelTicket(int id) {
		return this.ticketBook.findById(id).cancel();
	}
	
	public boolean admitTicket(int id) {
		return this.ticketBook.findById(id).admit();
	}
}
