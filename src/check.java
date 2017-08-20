import java.io.IOException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
public class check extends HttpServlet{
	public void getName() throws ClassNotFoundException, SQLException
	{
		String url = "jdbc:mysql://localhost:3306//studentDetails";
		String uname = "root";
		String pass = "root";
		String query = "select *from student";
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = (Connection) DriverManager.getConnection(url,uname,pass);
		Statement st = (Statement) con.createStatement();
		ResultSet rs = st.executeQuery(query);
	        rs.next();
			String name = rs.getString("name");
           System.out.println(name);
           
 	
		st.close();
		con.close();
		
	}	
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException {
		try {
			getName();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
}
