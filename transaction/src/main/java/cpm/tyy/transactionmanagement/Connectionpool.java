package cpm.tyy.transactionmanagement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Connectionpool {



		private static List<Connection> connectionspool = new ArrayList<Connection>();
		private static String driverpath = "org.postgresql.Driver";
		private static String URL = "jdbc:postgresql://localhost:5432/ticket";
		private static String username = "postgres";
		private static String password = "123";
		private static final int pool_size = 5;

		static {
			try {
				Class.forName(driverpath);

				for (int i = 0; i < pool_size; i++) {
					Connection connection = createConnection();
					connectionspool.add(connection);
				}
			} catch (ClassNotFoundException e) {

				e.printStackTrace();
			}
		}

		public static Connection getConnectionobject() {
			if (!connectionspool.isEmpty()) {
				return connectionspool.remove(0);
			} else {
				return createConnection();
			}
		}

		public static void reciveConnectionobject(Connection connection) {
			if (connectionspool.size() < pool_size) {
				connectionspool.add(connection);
			} else {
				try {
					connection.close();
					System.out.println("closed");
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	 
		private static Connection createConnection() {
			Connection connection = null;
			try {
				connection = DriverManager.getConnection(URL, username, password);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return connection;
		}

	}


