package com.JDBCSwitchcase.JDBCSwitchcase6_2_2023;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args ) throws SQLException
    {
    	//create the connections
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/jdbchw","root","jayshri");
      
        System.out.println("press any number ");
        Scanner sc=new Scanner(System.in);//give the input into the user
        int choose=sc.nextInt();
        
       switch(choose)//switch case loop
        {
        	case 1:JDBCoperationex.insertData();//case first can call the JDBCoperationex file
        	break;
        	
        	case 2:Updatedata.updateData();//case second can call the Updatedata file
        	break;
        	
        	case 3:deletedata.deleteData();//case Third  can call the deletedata file
        	break;
        	
        	case 4:Showdata.showData();//case fourth  can call the Showdata file
        	break;
        	
        	default://this is a default case
        		System.out.println("Something wrong");
         }
       con.close();//close the connection
     }
}
