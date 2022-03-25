package common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connecdb {

public static Connection connect(){
		java.sql.Connection 
		conn=null;
		try {

			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		 	conn =  DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QUANLYQUANAN; username=sa; password=123");
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		return conn;
	}

   

} 

