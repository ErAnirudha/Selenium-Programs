package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class databaseConnection {

	public static void main(String[] args) {
		
		String url="jdbc:mysql://localhost:3306/DbName";
		String user="root";
		String password="DbPassword";
		try {
			Connection con = DriverManager.getConnection(url,user,password);
			Statement statement=con.createStatement();
			
			String query="select username, pass from DbTableName";
			ResultSet resultset=statement.executeQuery(query);
			
			while(resultset.next()) {
				String username =resultset.getString("username");
				String pass =resultset.getString("pass");
				System.out.println ("username:"+ username +"| password "+ pass);
			}
			
		} catch (SQLException e) {
			System.out.println("connection failed");
			e.printStackTrace();
		}

	}

}
