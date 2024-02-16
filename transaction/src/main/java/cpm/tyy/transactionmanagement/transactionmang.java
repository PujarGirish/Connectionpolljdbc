package cpm.tyy.transactionmanagement;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class transactionmang {
public static void main(String[] args) {
	Connection connection=Connectionpool.getConnectionobject();
	
	
	String sqlpassenger_info="insert into passenger_info values(4,'poo',22,'female')";
	String sql1passenger_info="insert into passenger_info values(5,'gooo',23,'female')";
	String sql2passenger_info="insert into passenger_info values(6,'Sooo',27,'female')";
	
	String sqlbook_info="insert into booking_info values(22,'AIR_IND_131','BLR','HBL')";
	String payment_info="insert into payment_info values(22,1,250000,7000,'requested')";
	
	
	
	
	
try { 
	
	connection.setAutoCommit(false);
	Statement	st=connection.createStatement();
	st.execute(sqlbook_info);
	
	
	Statement	stm1=connection.createStatement();
	stm1.execute(sqlpassenger_info);
	
	Statement	stm2=connection.createStatement();
	stm1.execute(sql1passenger_info);
	
	
	Statement	stm3=connection.createStatement();
	stm1.execute(sql2passenger_info);
	if (Demopaymentgateway.Issucess()) {
		Statement	st1=connection.createStatement();
		stm1.execute(payment_info);
		connection.commit();
		System.out.println("transaction completed");
	}
	else
	{
		connection.rollback();
		System.out.println("transaction fialed and data reverted");
	}
	
	
	Connectionpool.reciveConnectionobject(connection);
	
	connection.close();
	
	
	
	
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
}
}
