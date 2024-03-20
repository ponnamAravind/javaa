package booking;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import loginpack.login_db;
import loginpack.login_servlet;
import loginpack.return_log;

public class booking_db 
{
	public static int bookcode(booking_return bookr) throws ClassNotFoundException, SQLException
	{
		 
		Connection con=login_db.boilerpaltecode();
		
		PreparedStatement pst=con.prepareStatement("insert into b_ticket_book values(?,?,?,?,?,?)");
		pst.setString(1,bookr.getName());
		pst.setString(2, bookr.getPassword());
		pst.setString(3, bookr.getBusno());
		pst.setString(4, bookr.getBustype());
		pst.setString(5, bookr.getSource());
		pst.setString(6, bookr.getEndpoint());
		 return pst.executeUpdate();
	}
	
	
}
