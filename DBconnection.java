package BusReservation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnection {
	
	private static final String url = "jdbc:mysql://localhost:3306/BusRes";
	private static final String username = "root";
	private static final String passWord = "Saravanan@12345";

	public static Connection getConnection() throws SQLException{
		
		return DriverManager.getConnection(url,username,passWord);
	}
}
