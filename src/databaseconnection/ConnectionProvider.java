package databaseconnection;

import java.sql.*;
import java.util.*;

public final class ConnectionProvider {
	private ConnectionProvider(){
		
	}
	public static Connection getConnection() {
		Connection con = null;
		try {
			Class.forName(DBInfo.DATABASE_DRIVER);
			con = DriverManager.getConnection(DBInfo.DATABASE_URL,DBInfo.DATABASE_USER,DBInfo.DATABASE_PASS );
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return con;
	}

}
