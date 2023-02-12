package com.Librarymgmt9_2_2023.Librarymgmt9_2_2023;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class deleteoperation {
	static Scanner sc = new Scanner(System.in);

	public static void deleteData()
	{
		try {
			// create a connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/jdbchw", "root", "jayshri");
			
			//*********************** delete the data into the table **************************
			
			String q = "delete from  Library where Stud_id=?";
			PreparedStatement psmt = con.prepareStatement(q);

			Scanner sc = new Scanner(System.in);// take the input into the user
			System.out.println("Enter student id");
			int Stud_id = sc.nextInt();
			psmt.setInt(1, Stud_id);
			psmt.executeUpdate();
			System.out.println("Delete data successfully");// check the data is deleted successfully or not
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
}
