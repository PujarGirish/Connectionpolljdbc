package com.ty.shop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class executeupdate {
public static void main(String[] args) {
	String url="jdbc:postgresql://localhost:5432/shop";
	String username="postgres";
	String password="123";
	
	try {
		Class.forName("org.postgresql.Driver");
		
		
	Connection	con=DriverManager.getConnection(url, username, password);
	String sql="INSERT into product values(11,'clothes',850,100)";
	
Statement	stm=con.createStatement();
		int resl=stm.executeUpdate(sql);
		System.out.println(resl);
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
