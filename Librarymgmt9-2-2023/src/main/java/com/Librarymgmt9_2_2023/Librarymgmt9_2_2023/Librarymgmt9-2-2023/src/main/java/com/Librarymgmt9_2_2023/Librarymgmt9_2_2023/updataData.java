package com.Librarymgmt9_2_2023.Librarymgmt9_2_2023;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class updataData
{
	public static  void update()
	{
		try
		{
			// create a connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/jdbchw", "root", "jayshri");
			 if(con.isClosed()) 
			 {
        		 System.out.println("The connection is close");
        	 }
       	    else
       	    {
       	    	System.out.println("The connection is established");
       	    }
			 
			//************************** update the data into the table ********************************
			 
			 String q = "update Student5 set Stud_id=?,Stud_name=?,Book_name=? where Lib_id=?";
	        	PreparedStatement psmt=con.prepareStatement(q);
	        	Scanner sc = new Scanner(System.in);
	        	//taking data from the user
	        	
	        	System.out.println("Enter the Student id");
	    		int Stud_id = sc.nextInt();
	    		psmt.setInt(1, Stud_id);// setting the value for Stud_id

	    		System.out.println("Enter the Student name");
	    		String Stud_name = sc.next();
	    		psmt.setString(2, Stud_name);// setting the value for Stud_name

	    		System.out.println("Enter the Book name");
	    		String Book_author = sc.next();
	    		psmt.setString(3, Book_author);// setting the value for Book_author
	    		
//	    		System.out.println("Enter the Book issue date");
//	        	Date book_issuedate = Date.valueOf(sc.next());
//	        	//String date="2023-2-10";
//	        	psmt.setDate(5, book_issuedate);

	    		System.out.println("Enter the Library id");
	    		int Lib_id = sc.nextInt();
	    		psmt.setInt(4, Lib_id);// setting the value for Li_id

	    		psmt.executeUpdate();
	    		con.close();
	        	System.out.println("Update data succesfully");
	   }
		catch(Exception e)
		{
			System.out.println(e);
		}
	}	
}
