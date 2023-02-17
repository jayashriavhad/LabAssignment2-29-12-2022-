package com.Librarymgmt9_2_2023.Librarymgmt9_2_2023;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class deleteData 
{
	//************************** delete the data into the table ********************************
	 
	   public static void delete()
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
			    String q="delete from student5 where Stud_Id=?";
		        PreparedStatement  psmt=con.prepareStatement(q);
		       //taking data from user
		        Scanner sc=new Scanner(System.in);
		        System.out.println("Enter the ID you want to delete :");
		        int Stud_id=sc.nextInt();
		        //setting the values in the query
		        psmt.setInt(1, Stud_id);
		        System.out.println("Delete data succesfully ");
		        //execute the prepared statement
		        psmt.executeUpdate();
		        //closing the connection
		        con.close(); 
				 
		   }
		   catch(Exception e)
		   {
			   System.out.println(e);
		   }
	   }
	   
}
