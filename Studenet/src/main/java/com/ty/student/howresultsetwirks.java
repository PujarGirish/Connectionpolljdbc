package com.ty.student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class howresultsetwirks {
public static void main(String[] args) {
	String url = "jdbc:postgresql://localhost:5432/students";
	String username = "postgres";
	String password = "123";
	try {
		Class.forName("org.postgresql.Driver");
		
	Connection	con=DriverManager.getConnection(url,username, password);
	
	String sql="SELECT * from studentdb";
	
Statement	stm=con.createStatement();
ResultSet rs=stm.executeQuery(sql);

while (rs.next()) {
	int age=rs.getInt(1);
	String name=rs.getString(2);
	int id=rs.getInt(3);
	System.out.println("age is "+ age);
	System.out.println("Name "+name);
	System.out.println("id is "+id);
	System.out.println("==================================================");
}
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
