package registrationpack;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/app4")
public class register_servlet extends HttpServlet
{

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		String name=req.getParameter("name");
		String pssword=req.getParameter("password");
		String email=req.getParameter("email");
		String number=req.getParameter("number");
		register_return reg=new register_return();
		 reg.setName(name);
		 reg.setPassword(pssword);
		 reg.setEmail(email);
		 reg.setnumber(number);
		 try {
			int rows=registrationcode.mycode(reg);
			out.println(rows+"rows are inserted");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
     
}
