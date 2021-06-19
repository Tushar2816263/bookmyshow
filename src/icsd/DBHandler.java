package icsd;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

import oracle.jdbc.pool.OracleDataSource;

public class DBHandler {

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

	
	

//MOVIEID     NOT NULL NUMBER(5)    
//MOVIENAME            VARCHAR2(20) 
//STARS                VARCHAR2(20) 
//STARTDATE            DATE         
//ENDDATE              DATE         
//SLOT912              VARCHAR2(10) 
//SLOT1215             VARCHAR2(10) 
//SLOT1518             VARCHAR2(10) 
//GOLDPRICE            NUMBER(5)    
//SILVERPRICE          NUMBER(5)    
//IMAGENAME            VARCHAR2(20) 
//LANGUAGE             VARCHAR2(20) 
	
	
	
	public LinkedList<movies> getmovies()
	{
		Connection con=getDbcon();
		
		LinkedList<movies> lst=new LinkedList<>();
		
		
		try {
			PreparedStatement stmt=con.prepareStatement("select * from tblmovies");
			
			ResultSet rset=stmt.executeQuery();
			
			while(rset.next())
			{
				int movieid=rset.getInt("movieid");
				String moviename=rset.getString("moviename");
				String rating=rset.getString("stars");
				Date startdate=rset.getDate("startdate");
				Date enddate=rset.getDate("enddate");
				String slot912=rset.getString("slot912");
				String slot1215=rset.getString("slot1215");
				String slot1518=rset.getString("slot1518");
				int gold=rset.getInt("goldprice");
				int silver=rset.getInt("silverprice");
				String image=rset.getString("imagename");
				String language=rset.getString("language");
				
				movies objmovie=new movies(movieid,moviename,gold,silver,startdate,image,enddate,slot912,slot1215,slot1518,rating,language);
				
				lst.add(objmovie);
				
			}
			
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		return lst;
	}
	
	
	
	public movieid getmoviebyid(int movid)
	{
		
		Connection con=getDbcon();
		
		
		movieid objmovie=null;
		
		try
		{
		
		PreparedStatement stmt=con.prepareStatement("select * from tblmovies where movieid=?");
		stmt.setInt(1, movid);
		
		
		ResultSet rset=stmt.executeQuery();
		
		if(rset.next())
		{
			int movieid=rset.getInt("movieid");
			String moviename=rset.getString("moviename");
			String rating=rset.getString("stars");
			Date startdate=rset.getDate("startdate");
			Date enddate=rset.getDate("enddate");
			String slot912=rset.getString("slot912");
			String slot1215=rset.getString("slot1215");
			String slot1518=rset.getString("slot1518");
			int gold=rset.getInt("goldprice");
			int silver=rset.getInt("silverprice");
			String image=rset.getString("imagename");
			String language=rset.getString("language");
			
			
		 objmovie=new movieid( movieid, moviename, rating, startdate, enddate, slot912,
					 slot1215, slot1518, gold, silver, image, language);
		
			
			
			
		}
		
		
		}
		
		catch(SQLException se)
		{
			se.printStackTrace();
		}
		
		return objmovie ;
		
	}
	
	
	
	
	
	
	
	
	public int tblseatsbookedid()

	{

		
		System.out.println("seatsbooked id called");
		
		
		
	Connection con=getDbcon();
	
	int id=0;
	
	try {

		PreparedStatement stmt=con.prepareStatement("select max(id1) as id from tblseatsbooked");
		
		ResultSet rset=stmt.executeQuery();
		
		if(rset.next())
		{
			id=rset.getInt("id");
			id=id+1;
		
		}
		
		else
		{
			id=0;
		}
	
		
		
		
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
		return id;
		
		

}	
	
	
	
	
	
	public int IntMovieid()

	{

		
		System.out.println("movie id called");
		
		
		
	Connection con=getDbcon();
	
	int id=0;
	
	try {

		PreparedStatement stmt=con.prepareStatement("select max(movieid) as id from tblmovies");
		
		ResultSet rset=stmt.executeQuery();
		
		if(rset.next())
		{
			id=rset.getInt("id");
			id=id+1;
		
		}
		
		else
		{
			id=0;
		}
	
		
		
		
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
		return id;
		
		

}

	
	
	
	
}
