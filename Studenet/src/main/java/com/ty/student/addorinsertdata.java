package com.ty.student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class addorinsertdata {
public static void main(String[] args) {
	
	String url = "jdbc:postgresql://localhost:5432/students";
	String username = "postgres";
	String password = "123";
	try {
		Class.forName("org.postgresql.Driver");
		
	Connection	con=DriverManager.getConnection(url, username, password);
	
	 String sql="INSERT into studentdb values(25,'Spoo',108)";
	 
	Statement stm=con.createStatement();
	stm.execute(sql);
	System.out.println("data inserted");
	
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
}
}
