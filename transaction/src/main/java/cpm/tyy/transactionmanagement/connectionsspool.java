package cpm.tyy.transactionmanagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class connectionsspool {
	private static List<Connection> connections = new ArrayList<>();
	private static String driverpath = "org.postgresql.Driver";
	private static String URL = "jdbc:postgresql://localhost:5432/ticket";
	private static String username = "postgres";
	private static String password = "123";
	private static final int pool_size = 5;
	static {
		try {

			Class.forName(driverpath);
			for (int i = 0; i < pool_size; i++) {
				Connection con = createconnection();
				connections.add(con);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static Connection getConnectionObject() {
		if (!connections.isEmpty()) {
			return connections.remove(0);
		} else {
			return createconnection();
		}

	}

	public static void reciveconnectionobject(Connection con) {
		if (connections.size() < pool_size) {
			connections.add(con);
		} else {
			try {
				con.close();
			} catch (SQLException e) {
                e.printStackTrace();
			}
		}
	}
	private static Connection createconnection() {
		Connection con = null;
		try {
			con = DriverManager.getConnection(URL, username, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}

}
