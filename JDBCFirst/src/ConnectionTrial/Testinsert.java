package ConnectionTrial;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.Statement;

public class Testinsert
{
	public static void main(String[] args) 
	{
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/jdbc";
		String user="root";
		String password="password";
		Connection c=DriverManager.getConnection(url,user,password);
		java.sql.Statement s=c.createStatement();
		String sql="INsert into student(sid,Sname,smail)"+"values"+"(122,'ranii','ranii@gmail.com')";
		boolean res=s.execute(sql);
		System.out.println(res);
		c.close();
		System.out.println("connected");
		
		
	}catch(ClassNotFoundException | SQLException e)
	{
		e.printStackTrace();
		
	}

}
}
