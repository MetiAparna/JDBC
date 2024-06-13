package insertClass;

import java.io.FileInputStream;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import com.mysql.cj.jdbc.Driver;

public class Testinsert4
{
	public static void main(String[] args) 
	{
		try
		{
			Driver d=new Driver();
			DriverManager.registerDriver(d);
			FileInputStream f=new FileInputStream("mydbinfo.properties");
			Properties properties=new Properties();
			properties.load(f);
			String url="jdbc:mysql://localhost:3306/jdbc";
			Connection c=DriverManager.getConnection(url,properties);
			System.out.println("connected");
			
			
		}catch(SQLException | IOException e)
		{
			e.printStackTrace();
			
		}
		
	}

}
