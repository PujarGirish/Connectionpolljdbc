package com.ty.shop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class batchexecution {
public static void main(String[] args) {
	String url="jdbc:postgresql://localhost:5432/shop";
	String username="postgres";
	String password="123";
	try {
		Class.forName("org.postgresql.Driver");
		
		  Connection con=DriverManager.getConnection(url, username, password);
		                 
		                 String sql="INSERT into product VALUES(?,?,?,?)";
		                 PreparedStatement pstm= con.prepareStatement(sql);
		                 pstm.setInt(1, 12);
		                 pstm.setString(2,"Ring");
		                 pstm.setDouble(3, 22000);
		                 pstm.setInt(4, 3);
		                 
		                 pstm.addBatch();
		                 
		                 pstm.setInt(1, 13);
		                 pstm.setString(2,"braclet");
		                 pstm.setDouble(3, 85000);
		                 pstm.setInt(4, 2);
		                 
		                 pstm.addBatch();
		                 
		                 pstm.setInt(1, 14);
		                 pstm.setString(2,"ear rings");
		                 pstm.setDouble(3, 15000);
		                 pstm.setInt(4, 8);
		                 
		                 pstm.addBatch();
		                 
		                 pstm.executeBatch();
		                 
		                 con.close();
		  
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
