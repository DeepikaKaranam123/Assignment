package Assessment;

import java.util.ArrayList;

public class Airport extends Flight {
	Address address;
	ArrayList<Flight> flight;
	ArrayList<Traveller> traveller;
	public Airport() {}
	public Airport(Address address, ArrayList<Flight> flight, ArrayList<Traveller> traveller) {
	
		this.address = address;
		this.flight = flight;
		this.traveller = traveller;
	}
	public boolean addFlight(Flight flights)
	{
		if(flights instanceof Flight)
		{
			flight.add(flights);
			
			return true;
		}
		return false;
	}
	public void bookTicket(String flightId, Traveller travellers)
	{
		if(travellers instanceof Traveller && this.id==id)
		{
			traveller.add(travellers);
			availableSeats-=1;
			
		}
	}
	public ArrayList<Flight> searchFlightBySourceAndDestination(String source,String destination)
	{
		if(this.source==source && this.destination==destination)
		{
			return flight;
		}
		
		return null;
		
		
	
	}
}
