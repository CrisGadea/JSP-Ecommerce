package ar.com.cac.factories;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionFactory {
	private static  final String SERVER = "jdbc:mysql://localhost:3306";
	private static  final String BASE = "ecommerce";
	private static  final String USER = "root";
	private static  final String PASSWORD = "12345678";
	
	public static Connection getConexion() throws SQLException {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		var conectionString = SERVER+"/"+BASE;
		return DriverManager.getConnection(conectionString,USER,PASSWORD);
	}

}
