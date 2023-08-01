package cgg.sma.manage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {
	
	static Connection  conn;
	
	public static Connection createConnection() {
		try {
			//load the driver
			Class.forName("org.postgresql.Driver");
			String url="jdbc:postgresql://localhost:5432/student_manage";
			String username= "postgres";
			String password ="farooq14";
			
			//obtaining connection...
			Connection conn = DriverManager.getConnection(url,username,password);
		}
		catch(ClassNotFoundException|SQLException e) {
			e.printStackTrace();
			
		}
		return conn;
		
	}

	
}
