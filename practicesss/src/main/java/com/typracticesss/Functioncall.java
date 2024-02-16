package com.typracticesss;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Functioncall {
public static void main(String[] args) {
	String url = "jdbc:postgresql://localhost:5432/practcie";
	String username = "postgres";
	String password = "123";
	
	try {
		Class.forName("org.postgresql.Driver");
		
	Connection	con=DriverManager.getConnection(url, username, password);
		
	
CallableStatement	cll=con.prepareCall("select count_by_age(?)");

cll.setInt(1, 25);
ResultSet rs=cll.executeQuery();
rs.next();
int count=rs.getInt(1);
		System.out.println("count of    stds age is grater than 25 "+count);
		
		con.close();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
