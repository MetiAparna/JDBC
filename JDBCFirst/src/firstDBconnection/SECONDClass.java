package firstDBconnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.DriverManager;


public class SECONDClass 
{
	public static void main(String[] args) throws ClassNotFoundException 
	{
		Connection con=null;
		PreparedStatement pst=null;
		String qry="INSERT INTO product VALUES(?,?,?,?)";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("load the drivers");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/college?user=root&password=password");
			System.out.println("establish the connection");
			pst= con.prepareStatement(qry);
			System.out.println("plateform created");
			pst.setInt(1, 223);
			pst.setString(2, "ice");
			pst.setInt(3,60);
			pst.setString(4, "zx1");
			pst.executeUpdate();
			System.out.println("insert succesfully");
			
		}catch(SQLException e)
		{
			e.printStackTrace();
			
		}
		if(pst!=null)
		{
			try {
				pst.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		if(con!=null)
		{
			try {
				con.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
	}

}
