package com.ty.shop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class updateanddelete {
public static void main(String[] args) {
	String url="jdbc:postgresql://localhost:5432/shop";
	String username="postgres";
	String password="123";
	
	
	
	try {
		Class.forName("org.postgresql.Driver");
		System.out.println("driver loaded");
	Connection	con=DriverManager.getConnection(url, username, password);
	System.out.println("connection etablished");
	
		  String sql="UPDATE product set cost=10000 WHERE productid=3";
		  
		Statement stm=con.createStatement();
		
		stm.execute(sql);
		con.close();
		System.out.println("data udpated");
		
		
		
	} catch (ClassNotFoundException e) {
		
		
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
