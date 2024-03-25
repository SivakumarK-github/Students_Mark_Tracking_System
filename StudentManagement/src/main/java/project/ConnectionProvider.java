package project;

import java.sql.*;

public class ConnectionProvider {
public static Connection getCon() {
	String url = "jdbc:mysql://localhost:3306/sms";
	String name = "root";
	String pass = "Saravana$06";
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, name, pass);
		return con;
		
	}
	catch(Exception e)
	{
		System.out.println(e);
		return null;
	}
	
}
}
