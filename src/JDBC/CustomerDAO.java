package JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerDAO extends DatabaseConnection{
	public void addCustomer(String c_name, String email, String phone) {
		String query="INSERT INTO customers(c_name,email,phone) VALUES(?,?,?)";
		try(Connection conn= DatabaseConnection.getconnection(); PreparedStatement s=conn.prepareStatement(query)){
			s.setString(1,c_name);
			s.setString(2,email);
			s.setString(3,phone);
			s.executeUpdate();
			System.out.println("Customer added!!");
			}catch(SQLException e) {
				e.printStackTrace();
			}
	}
}
