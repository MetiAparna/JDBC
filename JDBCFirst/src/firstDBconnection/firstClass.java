package firstDBconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class firstClass
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Connection con=null;
		Statement st=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("register the driver succesfuly");
			 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/college?user=root&password=password");
			System.out.println("conection succesfully");
			 st=con.createStatement();
			String s="INSERT INTO product(id,pname,price,bill_num) VALUES(112,'Pencil',40,'XT6')";
			// String s="update product set price=20 where id=101";
			 //String s="delete from product where id=104";
			// String s="";
			
			st.execute(s);
			System.out.println("data inserted");
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
		finally {
			if(st!=null)
			{
				try {
					st.close();

				}catch(SQLException e)
				{
					e.printStackTrace();
				}
			}
			if(con!=null)
			{
				try {
					con.close();

				}catch(SQLException e)
				{
					e.printStackTrace();
				}
			}
			
		}
	}

}
