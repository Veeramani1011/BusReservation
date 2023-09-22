package busresv;

import java.util.*;

public class BusDemo {

	public static void main(String[] args) {
		
		ArrayList<Bus> buses = new ArrayList<Bus>(); 
		ArrayList<Booking> bookings = new ArrayList<Booking>();
		
		buses.add(new Bus(1001,true,3));
		buses.add(new Bus(1011,false,45));
		buses.add(new Bus(1021,true,30));
		
		int userOpt = 1;
		Scanner scan = new Scanner(System.in);
		
		for(Bus b:buses) {
			b.displayBusInfo();
		}
		
		while(userOpt == 1) {
			System.out.println("Enter 1 to Book and 2 to Exit");
			userOpt =scan.nextInt();
			if(userOpt==1) {
				Booking booking= new Booking();
				if(booking.isAvailable(bookings,buses)) {
					bookings.add(booking);
					System.out.println("Your Booking is Confirmed");
				}
				else {
					System.out.println("Sorry.. Bus isn't Available. Try another Bus or Date. Thank You! ");
				}
			}
		}
	

	}

}
