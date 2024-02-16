package cpm.tyy.transactionmanagement;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;

public class transactionusingsavepoint {
public static void main(String[] args) {
Connection	con=connectionsspool.getConnectionObject();


String sqlbooking="insert into booking_info values(12,'AIR_IND_1133','BLR','HBL')";
String sqlpass1="insert into passenger_info values(1,'SIMTH',25,'Male')";
String sqlpass2="insert into passenger_info values(2,'Simi',22,'female')";
String sqlpass3="insert into passenger_info values(3,'Sams',27,'Male')";
String pay_info="insert into payment_info values(13,2211,280000,59000,'requested')";

try {
	con.setAutoCommit(false);
	Statement stm=con.createStatement();
	stm.execute(sqlbooking);
	Savepoint savepoint=con.setSavepoint();
	
	Statement st1=con.createStatement();
	st1.execute(sqlpass1);
	
	Statement st2=con.createStatement();
	st1.execute(sqlpass2);
	
	Statement st3=con.createStatement();
	st1.execute(sqlpass3);
	
	if(Demopaymentgateway.Issucess())
	{
		Statement sts=con.createStatement();
	    st1.execute(pay_info);
		con.commit();
		System.out.println("transaction is completed and succes");
		
	}
	else
	{
		con.rollback(savepoint);
		con.commit();
		System.out.println("trasnaction failed and data reverted");
	}
	
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
}
}
