package com.ty.shop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.postgresql.Driver;

public class Demoloaddriver {
public static void main(String[] args) {
	try {
//		Class.forName("org.postgresql.Driver");
		Driver driver=new Driver();
		DriverManager.registerDriver(driver);
		System.out.println("driver class is loaded");
		   
		Connection con=DriverManager.getConnection(null, null, null);
//	} catch (ClassNotFoundException e) {
//		
//		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
