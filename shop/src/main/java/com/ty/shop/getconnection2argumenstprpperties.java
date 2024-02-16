package com.ty.shop;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

//getconnectionobject3rdone
public class getconnection2argumenstprpperties {

	public static void main(String[] args) {
		try {
			Class.forName("org.postgresql.Driver");
			FileInputStream fileInputStream = new FileInputStream("shop_db.properties");
			Properties properties = new Properties();
			properties.load(fileInputStream);
			String URL_recived=properties.getProperty("URL");

			Connection con = DriverManager.getConnection(URL_recived, properties);
			System.out.println(con);

		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
