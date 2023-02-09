package com.JDBCSwitchcase.JDBCSwitchcase6_2_2023;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class deletedata
{
    
	static Scanner sc=new Scanner(System.in);
  public static void deleteData()
  {
	  try
	  {
		  //create a connection
		  Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/jdbchw","root","jayshri");
		  //delete the data into the table
		  String q="delete from Student where Stud_id=?";
		  PreparedStatement psmt=con.prepareStatement(q);
		  System.out.println("Enter Student Id:");
		  int Stud_id=sc.nextInt();
		  //set the value for the Stud_id
		  psmt.setInt(1,Stud_id);
		  psmt.executeUpdate();
		  System.out.println("delete data successfully");
	  }
	  catch(Exception e)
	  {
		  System.out.println(e);
	  }
	  }

}
