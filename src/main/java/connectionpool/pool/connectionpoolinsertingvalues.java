package connectionpool.pool;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class connectionpoolinsertingvalues {
public static void main(String[] args) {
	Connection con=Connectionpool.getConnectionobject();
	String sql="INSERT INTO teacher values (19,'Pooja','female',24,'poo@gmail.com','7584612365','b+')";
	try {
		Statement stm=con.createStatement();
		stm.execute(sql);
		Connectionpool.reciveConnectionobject(con);
	} catch (SQLException e) {
		e.printStackTrace();
	}
	
	
	
}
}
