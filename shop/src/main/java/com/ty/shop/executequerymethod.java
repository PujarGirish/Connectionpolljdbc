package com.ty.shop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class executequerymethod {
	public static void main(String[] args) {
		try {
			String url = "jdbc:postgresql://localhost:5432/shop";
			String username = "postgres";
			String password = "123";
			Class.forName("org.postgresql.Driver");
			Connection con = DriverManager.getConnection(url, username, password);

			String sql = "SELECT * from product";
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				double cost=rs.getDouble(3);
				int quantity=rs.getInt(4);
				
				System.out.println("ID is "+id);
				System.out.println("name is "+name);
				System.out.println("cost is "+cost);
				System.out.println("quantity are "+quantity);
				System.out.println("===============================================");
			}

		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
