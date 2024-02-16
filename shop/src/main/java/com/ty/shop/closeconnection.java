package com.ty.shop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class closeconnection {
public static void main(String[] args) {
	String url="jdbc:postgresql://localhost:5432/shop";
	String username="postgres";
	String password="123";
	Connection con=null;

	try {
		Class.forName("org.postgresql.Driver");
		System.out.println("driver class loaded");
		
		con=DriverManager.getConnection(url, username,password); 
		System.out.println("connection esatblished");
		
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace(); 
	}
	finally {
		try {
			if(con!=null) {
			con.close();
			System.out.println("close the connection");
		
			}
				} catch (SQLException e) {
			e.printStackTrace();
		
	}
}
}
}
