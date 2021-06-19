package icsd;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.org.apache.xml.internal.security.Init;

import oracle.jdbc.pool.OracleDataSource;

@WebServlet("/movieupload")
public class movieupload extends HttpServlet {

Connection con;
	PreparedStatement stmt=null;
	PreparedStatement stmt1=null;
	PreparedStatement stmt2=null;
	ResultSet rset=null;
	
	
	
	public Connection getDbcon()
	{
		 con=null;
		
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
	

	
	public void init(ServletConfig config) throws ServletException
	{
		 con=getDbcon();
		
		try {
		 stmt=con.prepareStatement("insert into tblmovies values(?,?,?,?,?,?,?,?,?,?,?,?)");
	
		 stmt1=con.prepareStatement("insert into tblseatsbooked values(?,?,?,?,?,?,?,?,?,?)");
					
		 stmt2=con.prepareStatement( "select to_date(?,'DD-MM-YY') + level - 1 as d from dual connect by level <= to_date(?,'DD-MM-YY') - to_date(?,'DD-MM-YY') + 1");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
		
	
	public movieupload() {

	
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

			
		DBHandler objdh=new DBHandler();
		
		int id=0;
	    String slot1;
	    String slot2;
	    String slot3;
	    
	    
		int goldseats=30;
		int silverseats=20;
		String goldseatsbooked=null;
		String silverseatsbooked=null;
		int goldavailableseats=30;
		int silveravailableseats=20;
		 
		
		System.out.println("movie upload fired");
		
		
		String strmovieid1=request.getParameter("txtmovieid");
		int strmovieid=Integer.parseInt(strmovieid1);
		String strmoviename=request.getParameter("txtmoviename");
		
		
		int goldprice=Integer.parseInt(request.getParameter("txtGprice"));
		int silverprice=Integer.parseInt(request.getParameter("txtSprice"));
		
		Date startdate=Date.valueOf(request.getParameter("txtstartdate"));
		
		
		
		String img=request.getParameter("file");
		
		Date enddate=Date.valueOf(request.getParameter("txtenddate"));
		


		
		
		
		 slot1=request.getParameter("slot912");
		
		
		
		 slot2=request.getParameter("slot1215");
		
		
		
		 slot3=request.getParameter("slot1518");
		
		
		String rating=request.getParameter("txtOpt");
		String language=request.getParameter("txtlang");
		
		
		
		
		
		System.out.println(enddate+" "+startdate+" "+rating+" "+slot1+" "+slot2+" "+slot3+" "+strmovieid+" "+strmoviename+" "+goldprice+" "+silverprice+" "+language);
		

try
{
		
			stmt.setInt(1,strmovieid);
			stmt.setString(2, strmoviename);
			stmt.setString(3,rating);
			stmt.setDate(4,startdate);
			stmt.setDate(5,enddate);
			stmt.setString(6, slot1);
			stmt.setString(7, slot2);
			stmt.setString(8, slot3);
			
			stmt.setInt(9,goldprice);
			stmt.setInt(10,silverprice);
			stmt.setString(11,img);
			stmt.setString(12, language);
			
		stmt.executeUpdate();
		
		
		System.out.println("movie inserted successfully");
		
		stmt1.setInt(2, strmovieid);
		stmt1.setInt(3,goldseats);
		stmt1.setInt(4,silverseats);
		stmt1.setString(5, goldseatsbooked);
		stmt1.setString(6, silverseatsbooked);
		
		
		stmt1.setInt(8,goldavailableseats);
		stmt1.setInt(9, silveravailableseats);
		
		
		if(slot1.equals("true"))
		{
			String slot="9-12";
			
			stmt2.setDate(1, startdate);
			stmt2.setDate(2, enddate);
			stmt2.setDate(3, startdate);
			
			rset=stmt2.executeQuery();
			
			
			System.out.println("date fired");
			
			while(rset.next())
			{
				id++;
				
				Date slotofshow=rset.getDate("d");
				
				try
				{
				
				stmt1.setDate(7, slotofshow);
				stmt1.setInt(1, id);
				stmt1.setString(10, slot);
				
				
				stmt1.executeUpdate();
				}
				
				catch(SQLException se)
				{
					se.printStackTrace();
				}
			}
			
		}
		
		
		if(slot2.equals("true"))
		{
			
			String slot="12-15";
			try
			{
			
			stmt2.setDate(1, startdate);
			stmt2.setDate(2, enddate);
			stmt2.setDate(3, startdate);
			
			rset=stmt2.executeQuery();
			
			while(rset.next())
			{
				id++;
				
				Date slotofshow=rset.getDate("d");
				
				stmt1.setInt(1, id);
				stmt1.setDate(7, slotofshow);
				stmt1.setString(10, slot);
				
				stmt1.executeUpdate();
				
			}
			
			
			
			}
			
			catch(SQLException se)
			{
				se.printStackTrace();
			}
		}
		
		if(slot3.equals("true"))
		{
			String slot="15-18";
		
			try
			{
			
			stmt2.setDate(1, startdate);
			stmt2.setDate(2, enddate);
			stmt2.setDate(3, startdate);
			
			rset=stmt2.executeQuery();
			
			while(rset.next())
			{
				id++;
				
				Date slotofshow=rset.getDate("d");
				
				stmt1.setInt(1, id);
				stmt1.setDate(7, slotofshow);
				stmt1.setString(10, slot);
				
				stmt1.executeUpdate();
				
			}
			
			
			
			}
			
			catch(SQLException se)
			{
				se.printStackTrace();
			}
			
			
			
		}
}
		
		
		
		
		
		
		
		
	catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
		
		
		
		
		

		
		
		
		



}