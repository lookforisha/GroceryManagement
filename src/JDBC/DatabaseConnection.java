package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//connection
public class DatabaseConnection {
		private static final String URL="jdbc:mysql://localhost:3306/grocery_db";
		private static final String USER="root";
		private static final String PASSWORD="#Livelife26";
		
		public static Connection getconnection() throws SQLException{
			return DriverManager.getConnection(URL,USER,PASSWORD);
		}
		

}