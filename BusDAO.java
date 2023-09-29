package BusReservation;

import java.sql.*;

public class BusDAO {

	public void displaybusinfo() throws SQLException {
		
		String s = "Select * from bus";
		
		Connection con =DBconnection.getConnection();
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(s);
        
        
        while(rs.next()) {
        	System.out.println("Bus_No is: "+rs.getInt(1));
        	if(rs.getInt(2)==0)
        		System.out.println("Ac : No" );
        	else
        		System.out.println("Ac : Yes");
        System.out.println("Capacity : " +rs.getInt(3));
        }
        System.out.println("----------------------------------------");
	}

	public int getCapacity(int id) throws SQLException{
		String  s = "Select Capacity from bus where id =" +id;
		Connection con =DBconnection.getConnection();
		  Statement st = con.createStatement();
	        ResultSet rs = st.executeQuery(s);
	        rs.next();
	        return rs.getInt(1);
	}
	
}
