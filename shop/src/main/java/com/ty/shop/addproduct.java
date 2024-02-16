package com.ty.shop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class addproduct {
public static void main(String[] args) {
	String url="jdbc:postgresql://localhost:5432/shop";
	String username="postgres";
	String password="123";
	//step 1 load the driver sofwtare
	try {
		Class.forName("org.postgresql.Driver");
		System.out.println("Driver loaded");
		
		// step 2 establish connection 
	Connection	con=DriverManager.getConnection(url, username, password);
	System.out.println("connected");
	
	String sql="INSERT into product values(2,'laptop',38000,21)";
	String sqql="INSERT into product values(3,'Smart Phone',14000,50)";
	
Statement	stm=con.createStatement();

stm.execute(sql);
stm.execute(sqql);

con.close();
	
		
	} catch (ClassNotFoundException e) {
		
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
