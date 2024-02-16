package com.ty.shop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DemoSaveProduct {
public static void main(String[] args) {
	//step1 to load the driver clss
	String url="jdbc:postgresql://localhost:5432/shop";
	String username="postgres";
	String password="123";
	try {
		Class.forName("org.postgresql.Driver");
		System.out.println("Driver loaded");
		
		// sstep 2 establish connection
		Connection con=DriverManager.getConnection(url, username, password);
		System.out.println("connected to DB");
		
		String sql="INSERT into product values(1,'LG-31HV008',23400,41)";
		
		// step 3 create a query
		
	Statement	stm=con.createStatement();
	
	//step 4 execute query
	stm.execute(sql);
	// step 5 close the connection 
	
	con.close();
	System.out.println("data inserted");
	
	
	} catch (ClassNotFoundException e) {
		
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
