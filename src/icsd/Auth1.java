package icsd;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import oracle.jdbc.pool.OracleDataSource;



@WebServlet("/Auth1")
public class Auth1 extends HttpServlet {


	public Connection getDbcon()
	{
		Connection con=null;
		
	
		try {
			OracleDataSource ods=new OracleDataSource();
			ods.setURL("jdbc:oracle:thin:@localhost:1521:xe");
			
			con=ods.getConnection("abhi","icsd");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return con;
		
	}
	
	
	
	
	
	
	public Auth1() {

	
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Connection con=getDbcon();
		
		
	String strUnm=request.getParameter("txtUnm");
	String strPwd=request.getParameter("txtPwd");
		
		
		
		
		try {
			PreparedStatement stmt=con.prepareStatement("select * from admin where anm=? and apwd=?");
		
			stmt.setString(1, strUnm);
			stmt.setString(2, strPwd);
		
			
			ResultSet rset=stmt.executeQuery();
			
			
			if(rset.next())
			{
				response.sendRedirect(request.getContextPath()+"/admindashboard.jsp");
			}
			else
			{
				response.sendRedirect(request.getContextPath()+"/errorpage");
			}
			
			con.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	
	}

}
