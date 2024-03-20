package loginpack;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class login_servlet extends HttpServlet
{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		  resp.setContentType("text/html");
		  PrintWriter out=resp.getWriter();
		  return_log lcode=new return_log();
		  String name=req.getParameter("name");
		  String password=req.getParameter("password");
		  lcode.setName(name);
		  lcode.setPassword(password);
		    
		  try {
			ResultSet rs=login_db.logcode(lcode);
			if(rs.next())
			{
				RequestDispatcher rd=req.getRequestDispatcher("bookingpage.html");
				rd.forward(req, resp);
			}
			else
			{
				out.println("person not available");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
	}

}
