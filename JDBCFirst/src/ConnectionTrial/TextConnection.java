package ConnectionTrial;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TextConnection
{
	public static void main(String[] args) 
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","password");
			System.out.println("connection");
		}catch(ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
		}
		
	}
	

}
