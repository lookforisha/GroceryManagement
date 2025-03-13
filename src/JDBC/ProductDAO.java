package JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductDAO extends DatabaseConnection{
	public void addProduct(String p_name, String category, double price,int quantity) {
		String query="INSERT INTO products(p_name,category,price,quantity) VALUES(?,?,?,?)";
		try(Connection conn= DatabaseConnection.getconnection(); PreparedStatement s=conn.prepareStatement(query)){
			s.setString(1,p_name);
			s.setString(2,category);
			s.setDouble(3,price);
			s.setInt(4,quantity);
			s.executeUpdate();
			System.out.println("Product added!!");
			}catch(SQLException e) {
				e.printStackTrace();
			}
	}
}
