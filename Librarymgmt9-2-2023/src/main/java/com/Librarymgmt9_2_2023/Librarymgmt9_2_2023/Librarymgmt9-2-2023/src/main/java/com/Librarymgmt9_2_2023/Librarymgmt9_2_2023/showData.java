package com.Librarymgmt9_2_2023.Librarymgmt9_2_2023;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class showData
{
	 //************************** show the data into the table ********************************
	  
	   public static void show()
	   {
		   try 
		   {
			   Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/jdbchw", "root", "jayshri");
        	if(con.isClosed())
        	{
        		System.out.println("The connection is close");
        	}
	       	else 
	       	{
	       		System.out.println("the connection is established");
	       	}
        	String q="select * from student5 ";
	     	PreparedStatement  psmt=con.prepareStatement(q);
	     	ResultSet rset=psmt.executeQuery();
	     	while(rset.next()) 
	     	{
	     		int Stud_id=rset.getInt(1);
	     		String Stud_name=rset.getString(2);
	     		int Lib_id=rset.getInt(3);
	     		String Book_name=rset.getString(4);
	     		Date book_issuedate=rset.getDate(5);
	     		System.out.println("Id "+Stud_id+"         Name :"+Stud_name+"          Lib_id:"+Lib_id+"          Book_name:"+Book_name+"          book_issuedate:"+book_issuedate);
	     	}
	     	con.close();
        }
		   catch(Exception e)
		   {
			   System.out.println(e);
		   }
}
}