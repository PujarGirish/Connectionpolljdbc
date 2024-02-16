package connectionpool.pool;

import java.sql.Connection;

public class Testforcojnectionpool {
public static void main(String[] args) {
	Connection con=Connectionpool.getConnectionobject();
	System.out.println(con);
	Connection cons=Connectionpool.getConnectionobject();
	System.out.println(cons);
	Connection cos=Connectionpool.getConnectionobject();
	System.out.println(cos);
	Connection cn=Connectionpool.getConnectionobject();
	System.out.println(cn);
	Connection csn=Connectionpool.getConnectionobject();
	System.out.println(csn);
	Connection co=Connectionpool.getConnectionobject();
	System.out.println(co);
	Connectionpool.reciveConnectionobject(con);
	Connection on=Connectionpool.getConnectionobject();
	System.out.println(on);
 Connectionpool.reciveConnectionobject(on);
 
 
}
}
