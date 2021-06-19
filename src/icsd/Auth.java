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

@WebServlet("/Auth")
public class Auth extends HttpServlet {

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
	
	
	
	
	
	public Auth() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Connection con=getDbcon();
		
		
		String strUnm,strPwd;
		strUnm=request.getParameter("txtUnm");
		strPwd=request.getParameter("txtPwd");
		
		

	
	try {
		PreparedStatement stmt=con.prepareStatement("select * from admin where anm=? and apwd=?");
		
		stmt.setString(1, strUnm);
		stmt.setString(2, strPwd);
		System.out.println("strUnm="+strUnm+"strpwd="+strPwd);
		
		ResultSet rset=stmt.executeQuery();
		
		if(rset.next())
		{
			response.sendRedirect(request.getContextPath()+"/admindashboard.jsp");
			
		}
		
	
		else
		{
			response.sendRedirect(request.getContextPath()+"/errorpage.jsp");
		}
		
		
		
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
		
	}
}
	
	


