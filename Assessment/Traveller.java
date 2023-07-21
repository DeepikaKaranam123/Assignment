package Assessment;

import java.util.Date;

public class Traveller {
	private String name;
	private double mobile;
	private String email;
	private String flightId;
	private Date date;
	public Traveller() {}
	public Traveller(String name, int mobile, String email, String flightId,Date date) {
		
		this.name = name;
		this.mobile = mobile;
		this.email = email;
		this.flightId = flightId;
		this.date=date;
	}
	
}
