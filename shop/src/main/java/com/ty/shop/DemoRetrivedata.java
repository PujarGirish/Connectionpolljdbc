 package com.ty.shop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DemoRetrivedata {
public static void main(String[] args) {
	String url="jdbc:postgresql://localhost:5432/shop";
	String username="postgres";
	String password="123";
	try {
		Class.forName("org.postgresql.Driver");
	 Connection	con=DriverManager.getConnection(url, username, password);
	 
	 String sql="SELECT * FROM product";
	 
	 Statement Stm=con.createStatement();
      ResultSet rs =Stm.executeQuery(sql);	
      while (rs.next()) {
		int productid=rs.getInt(1);
		String productname=rs.getString(2);
		Double cost=rs.getDouble(3);
		int quantity=rs.getInt(4);
		
		System.out.println("ID is "+ productid);

		System.out.println("Name is "+ productname);
		
		System.out.println("Cost is "+cost);
		
		System.out.println("Quantity "+quantity);
		System.out.println("---------------------");
		
		con.close();
		
      }
		
		
	} catch (ClassNotFoundException e) {
		
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
