package ty.resultsetmetadata;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class Resultsetmetadata {
public static void main(String[] args) {

	String url = "jdbc:postgresql://localhost:5432/students";
	String username = "postgres";
	String password = "123";
	try {
		Class.forName("org.postgresql.Driver");
		
	Connection	con=DriverManager.getConnection(url, username, password);
	         String sql="Select *from teacher";
	         Statement stm=con.createStatement();
	        ResultSet rs=stm.executeQuery(sql);
	         ResultSetMetaData res=rs.getMetaData();
	         String str=res.getColumnName(2);
	         System.out.println("column name is  "+str);
	         int nos=res.getColumnCount();
	   System.out.println("no.of columns present "+nos);
	 System.out.println(res.getColumnTypeName(2));
	 
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
