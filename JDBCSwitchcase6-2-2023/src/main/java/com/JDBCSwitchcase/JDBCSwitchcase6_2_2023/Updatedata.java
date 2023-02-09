package com.JDBCSwitchcase.JDBCSwitchcase6_2_2023;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Updatedata {

	static Scanner sc=new Scanner(System.in);
	  public static void updateData()
	  {
		  try
		  {
			  //create connection
			  Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/jdbchw","root","jayshri");
			  //update student data
			  String q="update Student set Stud_name=?,Stud_class=?,Stud_age=?,stud_BOD=?where Stud_id=?";
			  PreparedStatement psmt=con.prepareStatement(q);
			  System.out.println("Enter the Student name");//give the input to the user
			  String Stud_name=sc.next();
			  System.out.println("Enter Student class:");
			  String Stud_class=sc.next();
			  System.out.println("Enter Student Age:");
			  int Stud_age=sc.nextInt();
			  System.out.println("Enter Student BOD(yyyy-mm-dd):");
			  Date Stud_BOD=Date.valueOf(sc.next());
			  System.out.println("Enter Student Id:");
			  int Stud_id=sc.nextInt();
			  
			  //set the values for the Stud_id,name,age,class,DOB
			  psmt.setString(1,Stud_name);
			  psmt.setString(2,Stud_class);
			  psmt.setInt(3,Stud_age);
			  psmt.setDate(4,Stud_BOD);
			  psmt.setInt(5,Stud_id);
			  psmt.executeUpdate();
			  System.out.println("update data successfully");
		  }
		  catch(Exception e)
		  {
			  System.out.println(e);
		  }
}
}