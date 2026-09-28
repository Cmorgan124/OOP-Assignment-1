package classes;

public class TicketManager {
	private TicketBook ticketBook;
	private int idGenerator;
	
	TicketManager(TicketBook ticketBook){
		if (ticketBook == null)
		{
			throw new IllegalArgumentException("A ticket book is required for this manager.");
		}
		this.ticketBook = ticketBook;
		this.idGenerator = 1;
	}
	
	public void createTicket(Event event, TicketType type, String studentName) {
		ticketBook.createTicket(idGenerator, event, type, studentName);
		idGenerator++;
	} 
	
	public boolean cancelTicket(int id) {
		return ticketBook.findById(id).cancel();
	}
	
	public boolean admitTicket(int id) {
		return ticketBook.findById(id).admit();
	}
}
