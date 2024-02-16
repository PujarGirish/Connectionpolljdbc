package com.ty.shop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CLOSECONNECTIONUSINGTRYRESORCES {
public static void main(String[] args) {
	String url="jdbc:postgresql://localhost:5432/shop";
	String username="postgres";
	String password="123";
	try {
		Class.forName("org.postgresql.Driver");
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
	try( Connection con=DriverManager.getConnection(url, username, password))
	{
		String sql="insert into product values(18,'trimmer',523,20)";
		
		Statement stm=con.createStatement();
		stm.execute(sql);
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
