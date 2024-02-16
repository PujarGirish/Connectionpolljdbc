package metadatadata;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Testmetadata {
public static void main(String[] args) {
	String url = "jdbc:postgresql://localhost:5432/students";
	String username = "postgres";
	String password = "123";
	
	
	try {
		Class.forName("org.postgresql.Driver");
		
		
	Connection	con=DriverManager.getConnection(url, username, password);
	
	DatabaseMetaData dmd=con.getMetaData();
	String user=dmd.getUserName();
	System.out.println("user nameis "+user);
	String driverversion=dmd.getDriverVersion();
	System.out.println(driverversion);
	String drivername=dmd.getDriverName();
System.out.println("=============");
System.out.println(dmd.getURL());
	System.out.println(drivername);
	boolean rs=dmd.supportsOuterJoins();
	System.out.println(rs);
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto)-generated catch block
		e.printStackTrace();
	}
}
}
