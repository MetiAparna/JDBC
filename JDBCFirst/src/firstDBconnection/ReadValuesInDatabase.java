package firstDBconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ReadValuesInDatabase 
{
	public static void main(String[] args) throws ClassNotFoundException 
	{
		Connection con=null;
		PreparedStatement pst=null;
		ResultSet rs=null;
		String qry="SELECT * FROM product";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("load the driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/college?user=root&password=password");
			System.out.println("establish the connection");
			pst=con.prepareStatement(qry);
			rs=pst.executeQuery();
			
			if(rs.next())
			{
				int id=rs.getInt(1);
				String pname=rs.getString(2);
				int price=rs.getInt(3);
				String bill_num=rs.getString(4);
				System.out.println(id+" "+pname+" "+price+" "+bill_num);
			}
			
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
		try {
			rs.close();
		} catch (SQLException e1) 
		{
			e1.printStackTrace();
		}
		try {
			pst.close();
		} catch (SQLException e) 
		{
			e.printStackTrace();
		}
		try {
			con.close();
		} catch (SQLException e) 
		{
			e.printStackTrace();
		}
		
	}

}
