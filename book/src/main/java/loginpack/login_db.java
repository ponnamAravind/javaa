package loginpack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class login_db 
{
	
	public static ResultSet logcode(return_log retlog) throws ClassNotFoundException, SQLException
	{
               
		Connection con=boilerpaltecode();
		PreparedStatement pst =con.prepareStatement("select * from register where name=? and password=?");
		pst.setString(1, retlog.getName());
		pst.setString(2, retlog.getPassword());
		return pst.executeQuery();
		
		
	}
	public static Connection boilerpaltecode() throws ClassNotFoundException, SQLException
	{
		String url="jdbc:mysql://localhost:3306/student";
		String u="root",p="root";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,u,p);
		return con;
	}
}
