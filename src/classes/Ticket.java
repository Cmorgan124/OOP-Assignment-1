package classes;

public class Ticket {
	private int id;
	private String studentName;
	private Event event;
	private TicketType ticketType;
	private boolean admitted;
	private boolean canceled;

	
	public Ticket(int id, String studentName, Event event, TicketType ticketType, boolean admitted, boolean canceled)
	{
		if(studentName == null || studentName.isBlank())
		{
			throw new IllegalArgumentException("A Student name for the ticket is required.");
		}
		if(id <= 0)
		{
			throw new IllegalArgumentException("ID number must be greater than 0.");

		}
		if (event == null)
		{
			throw new IllegalArgumentException("A ticket is required to have an event.");
		}
		if (ticketType == null)
		{
			throw new IllegalArgumentException("A ticket is required to have an ticket type.");
		}
		if(admitted)
		{
			canceled = false;
		}
		if(canceled)
		{
			admitted = false;
		}
		this.studentName = studentName;
		this.id = id;
		this.event = event;
		this.ticketType = ticketType;
		this.admitted = admitted;
		this.canceled = canceled;
	}

	public boolean admit()
	{
		if(canceled || admitted)
		{
			return false;
		}
		admitted = true;
		return true;
	}

	public boolean cancel()
	{
		if(admitted || canceled)
		{
			return false;
		}
		canceled = true;
		return true;
	}
	
	public boolean isCanceled()
	{
		return canceled;
	}
	
	public boolean isAdmitted()
	{
		return admitted;
	}
	
	public boolean isActive()
	{
		if(admitted || canceled)
		{
			return false;
		}
		return true;
	}
	
	public int getID()
	{
		return id;
	}
	
	public Event getEvent()
	{
		return event;
	}
	

	
}
