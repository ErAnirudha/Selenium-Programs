package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class databaseconnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		try {
		//step 1 Register the driver
		Class.forName("com.mysql.cj.jdbc.Driver");  // it requires in older database connection 
		//older versions of Java (JDBC 3.0 and earlier) it required

		//step 2 create connection 

		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dbName","root","dbpassword");
		//System.out.println("Connection created");

		Statement statement = con.createStatement();

		String query = "SELECT * FROM dbTableName";
		ResultSet resultSet = statement.executeQuery(query);

		// 5. Iterate through the results and fetch data
		while (resultSet.next()) {
			// Fetch columns by their names or column index (1-based)
			String Username = resultSet.getString("username"); 
			String Pass = resultSet.getString("pass");

			System.out.println("username: " + Username + " |Password: " + Pass);
		}

		// 6. Close the resources
		resultSet.close();
		statement.close();
		con.close();

	} catch (Exception e) {
		e.printStackTrace();
	}
}

}
