package crudOperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.Statement;

public class testUpdates
{
	public static void main(String[] args) throws ClassNotFoundException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		try(Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc"+"?user=root&password=password");)
		{
			System.out.println("connected");
			java.sql.Statement s=c.createStatement();
			String query="UPDATE student SET sname='dhara' WHERE "+"sname='radha'";
			int res=s.executeUpdate(query);
			System.out.println("no rows updated="+res);
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

		
	}

}
