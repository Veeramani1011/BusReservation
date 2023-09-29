package BusReservation;

import java.util.Date;
import java.sql.*;

public class BookingDAO {

	public int getBookedCount(int bus_No, Date date) throws SQLException {
		
		String s = "Select count(pasanger_name) from booking where bus_no = ? and travel_date = ?";
		Connection con = DBconnection.getConnection();
		
		PreparedStatement pst = con.prepareStatement(s);
		java.sql.Date sqlDate = new java.sql.Date(date.getTime());
		pst.setInt(1, bus_No);
		pst.setDate(2, sqlDate);
		ResultSet rs=pst.executeQuery();
		rs.next();
		return rs.getInt(1);
	}

	public void addBooking(Booking booking) throws SQLException{
		String s = "Insert into Booking values(?,?,?)";
		Connection con = DBconnection.getConnection();
		java.sql.Date sqlDate = new java.sql.Date(booking.date.getTime());
		PreparedStatement pst = con.prepareStatement(s);
		pst.setString(1, booking.passenger_Name);
		pst.setInt(2, booking.bus_No);
		pst.setDate(3,sqlDate);
		
		pst.executeUpdate();
	}
	
	
}
