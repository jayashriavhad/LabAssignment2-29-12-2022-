package com.Librarymgmt9_2_2023.Librarymgmt9_2_2023;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class insertData 
{
	public static void insert()
	{
		try
		{
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/jdbchw", "root", "jayshri");
			if(con.isClosed()) {
        		System.out.println("The connection is close");
        	}
			else
			{
				System.out.println("The Connection is Established");
			}
			String q="insert into Student5(Stud_id,Stud_name,Lib_id,Book_name,book_issuedate) values(?,?,?,?,?)";
        	PreparedStatement psmt=con.prepareStatement(q);
        	Scanner sc=new Scanner(System.in);
			
        	System.out.println("Enter the enter Student id");
        	int id=sc.nextInt();
        	psmt.setInt(1,id);

			System.out.println("Enter the Student name");
			String name = sc.next();
			psmt.setString(2, name);// setting the value for name
			
			System.out.println("Enter the Student Library Id");
        	int Lib_id=sc.nextInt();
        	psmt.setInt(3,Lib_id);
        	
        	System.out.println("Enter the book name");
			String Book_name = sc.next();
			psmt.setString(4, Book_name);// setting the value for ssname
        	
        	System.out.println("Enter the Book issue date");
        	Date book_issuedate = Date.valueOf(sc.next());
        	//String date="2023-2-10";
        	psmt.setDate(5, book_issuedate);
        	psmt.executeUpdate();
        	con.close();
        	System.out.println("Data is inserted Successfully");
        
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
		
	


}
