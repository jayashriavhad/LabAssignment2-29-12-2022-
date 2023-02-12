package com.Librarymgmt9_2_2023.Librarymgmt9_2_2023;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.JDBCSwitchcase.JDBCSwitchcase6_2_2023.Insertoperation;
import com.JDBCSwitchcase.JDBCSwitchcase6_2_2023.insertData;
import com.mysql.cj.x.protobuf.MysqlxCrud.Insert;

public class App {
	public static void main(String[] args) throws SQLException
	{
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/jdbchw", "root", "jayshri");
		System.out.println("1. Insert Data  \n 2. Update Data \n 3. Delete Data \n 4. Show all data");
		Scanner sc = new Scanner(System.in);
		System.out.println("choose any one operation :");
		int choose = sc.nextInt();

		switch (choose) {
		case 1:
			Insertoperation.insertdata();
			break;

		case 2:
			updateOperation.updateData();
			break;

		case 3:
			deleteoperation.deleteData();
			break;

		case 4:
			selectoperation.showdata();
			break;

		default:
			System.out.println("something wrong");
		}

	}
}
