package registrationpack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class registrationcode 
{

	public static int  mycode(register_return reg) throws ClassNotFoundException, SQLException
    {
  	  Connection con=boilerpaltecode();
  	  String sql="INSERT INTO register VALUES(?,?,?,?)";
  	  PreparedStatement pst= con.prepareStatement(sql);
  	  pst.setString(1, reg.getName());
  	  pst.setString(2, reg.getPassword());
  	pst.setString(3, reg.getEmail());
	  pst.setString(4,reg.getnumber());
  	  int rows=pst.executeUpdate();
  	  
  	  return rows;
  	 
  	  
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
