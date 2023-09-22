package busresv;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Booking {

	String passengerName;
	int busNo;
	Date date;
	
	Booking(){
		
	    Scanner scan = new Scanner(System.in);
		System.out.println("Enter name of Passenger: ");
		passengerName = scan.next();
		System.out.println("Enter the Bus NO :");
		busNo = scan.nextInt();
		System.out.println("Enter Date this format dd-mm-yyyy");
		String dateInput = scan.next();
		SimpleDateFormat dateformat = new SimpleDateFormat("dd-MM-yyyy");
		
		try {
			date = dateformat.parse(dateInput);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
	public boolean isAvailable(ArrayList<Booking> bookings, ArrayList<Bus> buses) {
		
		int capacity =0;
		for(Bus bus:buses) {
			if(bus.getbusNo()== busNo)
				capacity = bus.getCapacity();
		}
		int booked = 0;
		for(Booking b:bookings) {
			if(b.busNo == busNo && b.date.equals(date)) {
				booked++;
			}
		}
		
		return booked<capacity?true : false;
	}
	
}
