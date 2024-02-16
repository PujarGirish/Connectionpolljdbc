package com.ty.shop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class getconnectionbysingleargs {
public static void main(String[] args) {
	String url="jdbc:postgresql://localhost:5432/shop?user=postgres&password=123";
	//step1 load the driver software
	
	try {
		Class.forName("org.postgresql.Driver");
		
	Connection	con=DriverManager.getConnection(url);
		System.out.println(con
				);
		
		
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
