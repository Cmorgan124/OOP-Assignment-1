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
		if (!this.ticketBook.findById(id).isCanceled()) {
			this.ticketBook.findById(id).cancelTicket();
			return true; 
		}
		return false;
	}
	
	public boolean admitTicket(int id) {
		if (!this.ticketBook.findById(id).isAdmitted()) {
			this.ticketBook.findById(id).admitTicket();
			return true; 
		}
		return false;
	}
}
