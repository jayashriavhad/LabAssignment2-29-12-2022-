package com.JDBCSwitchcase.JDBCSwitchcase6_2_2023;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import java.util.Scanner;

public class Showdata
{
	  static Scanner sc=new Scanner(System.in);
	  public static void showData()
	  {
		  try
		  {
			  //create a connection
			  Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/jdbchw","root","jayshri");
			  // show all data into the table
			  String q="select * from Student";
			  PreparedStatement psmt=con.prepareStatement(q);
			  ResultSet rset=psmt.executeQuery();
			  while(rset.next())//use while loop because resultset check the condition in each every condition 
			  {
				  int Stud_id=rset.getInt(1);
				  String Stud_name=rset.getString(2);
				  String Stud_class=rset.getString(3);
				  int Stud_age=rset.getInt(4);
				  Date Stud_DoB=rset.getDate(5);
				  //print the values
				  System.out.println("Stud_id  : " +Stud_id +"Stud_name:  "+Stud_name+"Stud_class: "+Stud_class+"Stud_age :  "+Stud_age+"Stud_DOB :  "+Stud_DoB);
				  
			  }
			  
		  }
		  catch(Exception e)
		  {
			System.out.println(e);  
		  }
		  }
}
