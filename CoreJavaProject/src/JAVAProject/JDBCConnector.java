package JAVAProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


public class JDBCConnector {

	Connection con; //connection is an interface.
	Statement st;   //Statement is an interface.
	
	
	public void connectDB() //here we have connected our program to database.
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con= DriverManager.getConnection("jdbc:mysql://localhost:3307/Event_management", "root", "");
			
			System.out.println("Connected Sucessfully");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void createDB() //here we have created our database.
	{
		connectDB();
		
		try
		{
			String sql = "create database Event_management";
			
			st = con.createStatement();
			st.executeUpdate(sql);
			
			System.out.println("Database create success");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	public void createTable()  //here we have created table to our database i.e cricket.
	{
		connectDB();
		
		String sql = "create table SignUp (SName varchar(20), SEmail varchar(20),SUsername varchar(20), SMobile varchar(10), SPassword varchar(20))";
				//(pNo varchar(10) not null primary key, pName varchar(20), pRank varchar(10))";
		                                
		try
		{
			st = con.createStatement();
			
			st.executeUpdate(sql);
			System.out.println("Table created succesfully");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public int insertData(String name, String emailid, String username,String password, String mobile) //inserted data to the database.
	{
		connectDB();
		String sql= "insert into Signup values(?,?,?,?,?)";
		int res=0;
		try
		{
			PreparedStatement ps=con.prepareStatement(sql); //PreparedStatement is an interface and ps is the reference variable and preparedStatement() is a method of connection so preparedStatement() method is used to take the input from user. 
			ps.setString(1, name); //here setInt() is the method of PreparedStatement interface.
 			ps.setString(2, emailid);
			ps.setString(3, username);
			ps.setString(4, mobile);
			ps.setString(5, password);
			
			res= ps.executeUpdate();
			System.out.println("Data Inserted Sucessfully "+res);
			return res;
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return res;
	}
	
	public ResultSet readData(int srno, String str) //here we have read specific data that user wants to read.
	{
		connectDB();
		ResultSet rs = null;
		//String v = null;
		//String sql="select * from anniversariesservices where srno ="+pNo;
		//String str[] = new String[7];
		
		try
		{
			st=con.createStatement();
			rs = st.executeQuery("select * from "+str+" where srno ="+srno);
			
			//rs = st.executeQuery(sql);
			//System.out.println("Vaish : "+rs);
			/*
			while(rs.next())
			{
				System.out.println("player number "+rs.getInt(1)+"\tplayer name "+rs.getString(2)+"\tplayer rank "+rs.getInt(3));
				
			}
			*/
			return rs;
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		
		return rs;

		/*
		try
		{
			st=con.createStatement();
			
			rs = st.executeQuery(sql);
			
			
	        
			while(rs.next())
			{
				
				String str1 = rs.getString(1);
				String str2 = rs.getString(2);
				String str3 = rs.getString(3);
				String str4 = rs.getString(4);
				String str5 = rs.getString(5);
				String str6 = rs.getString(6);
				String str7 = rs.getString(7);
				
				
				str[0] = str1;
				str[1] = str2;
				str[2] = str3;
				str[3] = str4;
				str[4] = str5;
				str[5] = str6;
				str[6] = str7;
				System.out.println("player number "+rs.getInt("srno")+"\tplayer name "+rs.getString("A_venue")+"\tplayer rank "+rs.getInt(3));
				v = rs.getString(2);
				System.out.println("v : "+v);
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return str;
		
		
		*/
		
		
		
	}
	
	public ResultSet readAllData() //here we have read all the records from table that we have created.
	{
		connectDB();
		ResultSet rs = null;
		
		String sql="select * from anniversariesservices";
		try
		{
			st=con.createStatement();
			
			rs=st.executeQuery(sql);
	        
			/*
			while(rs.next())
			{
				System.out.println("player number "+rs.getInt(1)+"\tplayer name "+rs.getString(2)+"\tplayer rank "+rs.getInt(3));
			}*/
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return rs;
		
	}
	
	void deleteData(int del)  //here we have deleted database.
	{
		connectDB();
		
		try
		{
			String sql="delete from player where pNo= "+del;
			
			st =con.createStatement();
			st.executeUpdate(sql);
			System.out.println("record deleted sucessfully ");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	void updateData( String s,int id, int rank)
	{
		connectDB();
		
		String sql= "update player set pname=? , pRank =? where pNo= ?";
		try
		{
			PreparedStatement ps= con.prepareStatement(sql);
			
			ps.setString(1, s);
			ps.setInt(2, rank);
			ps.setInt(3, id);
			
			ps.executeUpdate();
			System.out.println("Record update sucessfully "+ps);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public ResultSet readSingleData(String name) 
	{
		connectDB();
		ResultSet rs = null;
		
		//String sql="select * from signup where SUsername = 'rohit45' ";
		try
		{
			st=con.createStatement();
			
			rs=st.executeQuery("select * from signup where SUsername = '"+name+"'");
	        
			/*
			while(rs.next())
			{
				System.out.println("player number "+rs.getInt(1)+"\tplayer name "+rs.getString(2)+"\tplayer rank "+rs.getInt(3));
			}*/
			return rs;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return rs;
		
	}
	
	
	

}
