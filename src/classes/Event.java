package classes;

public class Event {
	private final String eventName;
	private final String location;
	
	public Event(String eventName, String location)
	{
		if(eventName == null || eventName.isBlank()) 
		{
			throw new IllegalArgumentException("Name of event is required.");
		}
		if(location == null || location.isBlank()) 
		{
			throw new IllegalArgumentException("Location of event is required.");
		}
		this.eventName = eventName;
		this.location = location;
	}
	
	public String getEventName()
	{
		return this.eventName;
	}
	
	
	public String getLocation()
	{
		return this.location;
	}
	
	public String toString() 
	{
		return this.eventName + "@" + this.location;
	}
}
