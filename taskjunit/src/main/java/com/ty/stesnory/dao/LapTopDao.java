package com.ty.stesnory.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.ty.stastnory.Laptop;

public class LapTopDao {
	public Connection getconnConnection() {

		String url = "jdbc:postgresql://localhost:5432/Laptop";
		String username = "postgres";
		String password = "123";
		try {
			Class.forName("org.postgresql.Driver");

			return DriverManager.getConnection(url, username, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}
	public Laptop savelaptop(Laptop laptop)
	{
		
		Connection con=getconnConnection();
		if (con!=null) {
			String sql="insert into laptop values(?,?,?,?,?)";
		PreparedStatement pstm;
		try {
			pstm = con.prepareStatement(sql);
			pstm.setInt(1,laptop.getId());
			pstm.setString(2,laptop.getBrand());
			pstm.setString(4, laptop.getProcessor());
			pstm.setInt(5,laptop.getRom());
			pstm.setInt(3,laptop.getRam());
			if (pstm.executeUpdate()==1) {
				return laptop;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
		return laptop;
	}
	
}
