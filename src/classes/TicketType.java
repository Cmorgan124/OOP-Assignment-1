package classes;

public class TicketType {
	private final String typeName;
	private final double price;
	
	public TicketType(String typeName, double price)
	{
		if(typeName == null || typeName.isBlank())
		{
			throw new IllegalArgumentException("A name for the ticket type is required.");
		}
		if(price < 0)
		{
			throw new IllegalArgumentException("Price must be greater or equal to 0.");
		}
		this.typeName = typeName;
		this.price = price;
	}
}
