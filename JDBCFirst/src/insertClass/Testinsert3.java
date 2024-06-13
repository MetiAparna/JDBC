package insertClass;

import java.sql.Connection;
//import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;
import com.mysql.cj.xdevapi.Statement;

public class Testinsert3 
{
	public static void main(String[] args) 
	{
		
		try {
			Driver d=new Driver();
			DriverManager.registerDriver(d);
			String url=	"jdbc:mysql://localhost:3306/jdbc"+"?user=root&password=password";		
            
			Connection c=DriverManager.getConnection(url);
			System.out.println("connected");

			java.sql.Statement s=c.createStatement();

			String sql="INsert into student(sid,Sname,smail)"+"values"+"(115,'keshav','keshav@gmail.com')";
			boolean res=s.execute(sql);
			System.out.println(res);
			c.close();
			
			
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
	}

}
