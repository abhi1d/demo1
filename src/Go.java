import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Go")
public class Go extends HttpServlet {

 public void service(HttpServletRequest req,HttpServletResponse res) throws IOException {
	 
	 int i = Integer.parseInt(req.getParameter("t1"));
	 int j = Integer.parseInt(req.getParameter("t2"));
	 int k = i+j;
	 PrintWriter out = res.getWriter();
	 check obj = new check();
	 try {
		obj.getName();
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 out.println(k);
 }
}
