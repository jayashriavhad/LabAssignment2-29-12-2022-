package com.JDBCSwitchcase.JDBCSwitchcase6_2_2023;

import java.util.Scanner;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JDBCoperationex
{
    
	static Scanner sc=new Scanner(System.in);
  public static void insertData()
  {
	  try
	  {
		  //create a connection
		  Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/jdbchw","root","jayshri");
		  //insert the data into the Student table
		  String q="insert into Student(Stud_id,Stud_name,Stud_class,Stud_age,stud_BOD)values(?,?,?,?,?)";
		  PreparedStatement psmt=con.prepareStatement(q);
		  System.out.println("Enter Student Id:");// access the data into the user
		  int Stud_id=sc.nextInt();// convert the integer
		  System.out.println("Enter Student name:");
		  String Stud_name=sc.next();// convert the String
		  System.out.println("Enter Student class:");
		  String Stud_class=sc.next();// convert the String
		  System.out.println("Enter Student Age:");
		  int Stud_age=sc.nextInt();// convert the integer
		  System.out.println("Enter Student BOD:");
		  Date Stud_BOD=Date.valueOf(sc.next());
     
		  //set the values for the Stud_id,name,age,class,DOB

		  psmt.setInt(1,Stud_id);
		  psmt.setString(2,Stud_name);
		  psmt.setString(3,Stud_class);
		  psmt.setInt(4,Stud_age);
		  psmt.setDate(5,Stud_BOD);
		  psmt.executeUpdate();
		  System.out.println("data insert successfully");
			
	 }
	  catch(Exception e)
	  {
		  System.out.println(e);
	  }
  }
  
}
