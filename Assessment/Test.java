package Assessment;

import java.util.Date;
import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
	ArrayList<Flight> ft=new ArrayList<>();
	ft.add(new Flight("554","vizag","hyd",1000.0,100,50,"10am","9pm","indian railways"));
	
	ArrayList<Traveller> tr=new ArrayList<>();
	tr.add(new Traveller("deepika",78575867,"gdfhdfg@gmail.com","67576gh",new Date()));
	
	Airport ap=new Airport(new Address("444","gandinagar","vzm","AP"),ft,tr);
	System.out.println(ap.addFlight(new Flight("554","vizag","hyd",1000.0,100,50,"10am","9pm","indian railways")));
	ap.bookTicket("67576gh",new Traveller("deepika",78575867,"gdfhdfg@gmail.com","67576gh",new Date()));
	System.out.println(ap.searchFlightBySourceAndDestination("vizag","hyd"));


}
}
