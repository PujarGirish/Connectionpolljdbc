package com.ty.student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class inpreparedupdate {
public static void main(String[] args) {
	String url = "jdbc:postgresql://localhost:5432/students";
	String username = "postgres";
	String password = "123";
	
	try {
		Class.forName("org.postgresql.Driver");
		
Connection	con=DriverManager.getConnection(url, username, password);

String sql="UPDATE  studentdb set age=? WHERE name=?";

PreparedStatement pstm=con.prepareStatement(sql);
pstm.setString(2,"Giri");
pstm.setInt(1, 24);

pstm.execute();
System.out.println("data updated");

		
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
