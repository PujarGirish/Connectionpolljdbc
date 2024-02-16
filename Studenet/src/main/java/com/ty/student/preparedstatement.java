package com.ty.student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class preparedstatement {
	

	
	public static void main(String[] args) {
		
		String url = "jdbc:postgresql://localhost:5432/students";
		String username = "postgres";
		String password = "123";
try {
	Class.forName("org.postgresql.Driver");
	     Connection con=DriverManager.getConnection(url, username, password);
	     
	     String sql="Insert into studentdb values(?,?,?)";
	     
	     PreparedStatement pstm=con.prepareStatement(sql) ;
	     pstm.setInt(1, 21);
	     pstm.setString(2, "Loki");
	     pstm.setInt(3, 100);
	     
	     pstm.execute();

	     con.close();
	     System.out.println("data is written");
	
} catch (ClassNotFoundException e) {
	e.printStackTrace();
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

	}
}
