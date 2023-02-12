package com.Librarymgmt9_2_2023.Librarymgmt9_2_2023;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class updateOperation {

	public static void updateData() throws SQLException 
	{
		// create a connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/jdbchw", "root", "jayshri");
		
		//************************** update the data into the table ********************************
		
		String q = "update library set Stud_id=?,Stud_name=?,Book_author=? where Lib_id=?";
		PreparedStatement psmt = con.prepareStatement(q);

		// use the scanner class because the taking the value into user
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Student id");
		int Stud_id = sc.nextInt();// convert the integer
		psmt.setInt(1, Stud_id);// setting the value for Stud_id

		System.out.println("Enter the Student name");
		String Stud_name = sc.next();
		psmt.setString(2, Stud_name);// setting the value for Stud_name

		System.out.println("Enter the Book Author name");
		String Book_author = sc.next();
		psmt.setString(3, Book_author);// setting the value for Book_author

		System.out.println("Enter the Library id");
		int Lib_id = sc.nextInt();
		psmt.setInt(4, Lib_id);// setting the value for Li_id

		psmt.executeUpdate();
		System.out.println("update data successdully");// check the data is successfully updated or not

	}
}
