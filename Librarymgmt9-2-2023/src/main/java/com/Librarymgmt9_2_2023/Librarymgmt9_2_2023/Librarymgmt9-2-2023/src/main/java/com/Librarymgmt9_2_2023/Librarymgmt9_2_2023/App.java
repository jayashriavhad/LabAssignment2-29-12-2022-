package com.Librarymgmt9_2_2023.Librarymgmt9_2_2023;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.Scanner;


public class App
{
	public static void main(String[] args) throws SQLException
	{
		
		System.out.println("1. Insert Data  \n 2. Update Data \n 3. Delete Data \n 4. Show all data");
		Scanner sc = new Scanner(System.in);
		System.out.println("choose any one number :");
		int choose = sc.nextInt();

		switch (choose) 
		{
		case 1:
			insertData.insert();
			break;

		case 2:
			updataData.update();
			break;

		case 3:
			deleteData.delete();
			break;

		case 4:
			showData.show();
			break;
		
		default:
			System.out.println("something wrong");
		}
			   
	}
}
