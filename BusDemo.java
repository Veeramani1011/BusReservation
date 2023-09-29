package BusReservation;

import java.sql.SQLException;
import java.util.*;

public class BusDemo {

	public static void main(String[] args) {
		
		BusDAO busdao = new BusDAO();
		try {
		busdao.displaybusinfo();
		
		int userOpt = 1;
		Scanner scan = new Scanner(System.in);
		
		while(userOpt == 1) {
			System.out.println("Enter 1 to Book and 2 to Exit");
			userOpt =scan.nextInt();
			if(userOpt==1) {
				Booking booking= new Booking();
				if(booking.isAvailable()) {
					BookingDAO bookingdao = new BookingDAO();
					bookingdao.addBooking(booking);
					System.out.println("Your Booking is Confirmed");
				}
				else {
					System.out.println("Sorry.. Bus isn't Available. Try another Bus or Date. Thank You! ");  
				}
			}
			scan.close();
		}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}   
	}

