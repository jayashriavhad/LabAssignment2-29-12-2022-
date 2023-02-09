package com.Librarymgmt9_2_2023.Librarymgmt9_2_2023;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;


public class App 
{
    public static void main( String[] args ) throws SQLException
    {
    	//creating the connections
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/jdbchw","root","jayshri");
       
        	try
        	{
        		//insert the data into the table
	        String q="insert into Library(Stud_id,Stud_name,Lib_id,Book_name,Book_author,Book_issuedate,Book_Returndate) values(?,?,?,?,?,?,?)";
	        PreparedStatement psmt=con.prepareStatement(q);
        
	        Scanner sc=new Scanner(System.in); // use the scanner class because the taking the  value into user
	        
	       // Add the data in Library table 
	        
	        System.out.println("Enter the Student id");
	        int Stud_id=sc.nextInt();// convert the integer
	        psmt.setInt(1,Stud_id);// set the value for Student id
	        
	        System.out.println("Enter the Student name");
	        String Stud_name=sc.next();//convert the string 
	        psmt.setString(2,Stud_name);// set the value for student name
	        
	        System.out.println("Enter the Library Id");
	        int Lib_id=sc.nextInt();//convert the intger
	        psmt.setInt(3,Lib_id);//set the value for Library id
	        
	        System.out.println("Enter the book name");
	        String Book_name=sc.next();
	        psmt.setString(4,Book_name);//set the value for book name

	        
	        System.out.println("Enter the Book Author name");
	        String Book_author=sc.next();
	        psmt.setString(5,Book_author);//set the value for book author
	        
	        System.out.println("Enter the book issue date");
	        String Book_issuedate=sc.next();
	        psmt.setString(6,Book_issuedate);//set the value for book issue date
	        
	        System.out.println("Enter the Book_Return date");
	        String Book_Returndate=sc.next();
	        psmt.setString(7,Book_Returndate);//set the value for book return date

	        
	        psmt.executeUpdate();
	        System.out.println("the data is inserted");//checking the data is inserted or not
    	
      //closing the connection
        con.close();
     } 
        catch(Exception e)
        {
     	   System.out.println();
        }
     
    }
}
