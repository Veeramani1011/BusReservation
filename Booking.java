package BusReservation;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Booking {

	String passenger_Name;
	int bus_No;
	Date date;
	
	Booking(){
		
	    Scanner scan = new Scanner(System.in);
		System.out.println("Enter name of Passenger: ");
		passenger_Name = scan.next();
		System.out.println("Enter the Bus NO :");
		bus_No = scan.nextInt();
		System.out.println("Enter Date this format dd-mm-yyyy");
		String dateInput = scan.next();
		SimpleDateFormat dateformat = new SimpleDateFormat("dd-MM-yyyy");
		
		try {
			date = dateformat.parse(dateInput);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
	public boolean isAvailable() throws SQLException{
		
		BusDAO busdao = new BusDAO();
		BookingDAO bookingdao = new BookingDAO();
		int capacity = busdao.getCapacity(bus_No);

		int booked = bookingdao.getBookedCount(bus_No,date);

		return booked<capacity;
	}
	
}
