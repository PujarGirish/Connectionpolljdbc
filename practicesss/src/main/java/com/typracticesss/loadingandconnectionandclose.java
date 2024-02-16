package com.typracticesss;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;




public class loadingandconnectionandclose {
public static void main(String[] args) {
	String url="jdbc:postgresql://localhost:5432/practcie";
	String username="postgres";
	String password="123";
	try(Connection con=DriverManager.getConnection(url,username,password)) {
		Class.forName("org.postgresql.Driver");
		System.out.println("Driver clssloaded");	
	 
	String sql="SELECT * from infromation";
	
	  Statement stm=con.createStatement();
	  ResultSet res=stm.executeQuery(sql);
	  while (res.next()) {
		int id=res.getInt(1);
		String name=res.getString(2);
		int age=res.getInt(3);
		String  DOB=res.getString(4);
		String place=res.getString(5);
		
		
System.out.println("id is "+id);
System.out.println("name is "+ name);
System.out.println("age is "+ age);
System.out.println("DOB is "+DOB);
System.out.println("place is "+place);
System.out.println("===================================");
	}
	  	
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
