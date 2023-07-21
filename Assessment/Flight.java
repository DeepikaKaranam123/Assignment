package Assessment;

public class Flight {
	public String id;
	public String source;
	public String destination;
	public double fare;
	public int totalSeats;
	public  int availableSeats;
	public String arrivalTime;
	public String departureTime;
	public String companyName;
	
	public Flight() {}

	public Flight(String id, String source, String destination, double fare, int totalSeats,int availableSeats
			,String arrivalTime, String departureTime, String companyName) {
		
		this.id = id;
		this.source = source;
		this.destination = destination;
		this.fare = fare;
		this.totalSeats = totalSeats;
		this.availableSeats=availableSeats;
		this.arrivalTime = arrivalTime;
		this.departureTime = departureTime;
		this.companyName = companyName;
	}
	
	
}
