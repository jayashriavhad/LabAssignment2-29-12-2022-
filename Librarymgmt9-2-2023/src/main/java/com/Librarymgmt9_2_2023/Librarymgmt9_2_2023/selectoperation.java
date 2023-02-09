package com.Librarymgmt9_2_2023.Librarymgmt9_2_2023;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.Scanner;

public class selectoperation
{
	public static void main(String args[]) throws SQLException
	{
		//create the connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/jdbchw","root","jayshri");
		// show the table 
		String q="select * from Library";
		PreparedStatement psmt=con.prepareStatement(q);
		psmt=con.prepareStatement(q);
     	System.out.println("show the table Successfully");
	}
}
