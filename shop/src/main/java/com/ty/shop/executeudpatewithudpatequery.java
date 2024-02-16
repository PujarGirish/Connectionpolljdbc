package com.ty.shop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class executeudpatewithudpatequery {
public static void main(String[] args) throws SQLException {
	
	String url="jdbc:postgresql://localhost:5432/shop";
	String username="postgres";
	String password="123";
	try {
		Class.forName("org.postgresql.Driver");
	Connection	con=DriverManager.getConnection(url, username, password);
	                String sql="UPDATE product set cost=500 where productid=6";
	                Statement stm=con.createStatement();
	                int res=stm.executeUpdate(sql);
		System.out.println(res);
		
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
}
}
