package booking;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import loginpack.login_servlet;
import loginpack.return_log;
@WebServlet("/app5")
public class booking_servlets extends HttpServlet
{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
	
		booking_return bookr=new booking_return();
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		String name=req.getParameter("name");
		String password=req.getParameter("password");
		String busno=req.getParameter("busno");
		String bustype=req.getParameter("bustype");
		String source=req.getParameter("source");
		String endpoint=req.getParameter("endpoint");
		bookr.setName(name);
		bookr.setPassword(password);
		bookr.setBusno(busno);
		bookr.setBustype(bustype);
		bookr.setSource(source);
		bookr.setEndpoint(endpoint);
		try {
			int rows=booking_db.bookcode(bookr);
			out.println(rows+" rows are insert");
			out.println("<html>"
					+ "<head>"
					+ "<style>"
					+ "p"
					+ "{"
					+ "color:red"
					+ "}"
					+ "</style>"
					+ "</head>"
					+ "<body>"
					+ "<form align=center style=background-color:yellow padding:50px>"
					+ "<h1 style=color:green>"
					+ "BOOKING sucessfully completed"
					+ "</h1>"
					+ "<p>"
					+ "Person Name:  "+name
					+ "</p>"
					+ "<p>"
					+ "Busno:  "+busno
					+ "</p>"
					+ "<p>"
					+ "Bustype:  "+bustype
					+ "</p>"
					+ "<p>"
					+ "Source:  "+source
					+ "</p>"
					+ "<p>"
					+ "Endpoint:  "+endpoint
					+ "</p>"
					+ "</form>"
					+ "");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
