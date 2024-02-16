package com.ty.student;

//create statement
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Adddata {
	public static void main(String[] args) {

		String url = "jdbc:postgresql://localhost:5432/students";
		String username = "postgres";
		String password = "123";
		try {

			Class.forName("org.postgresql.Driver");

			Connection con = DriverManager.getConnection(url, username, password);
			System.out.println(con);
			String sql = "DELETE from teacher  where id=9";
			
			Statement stm = con.createStatement();
			stm.execute(sql);
			con.close();

			System.out.println("data written");

		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}
}
