package firstDBconnection;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;


public class DAOClass {
	
	public static void main(String[] args) {
		
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hostel_db?user=root&password=password");
	    System.out.println("write a query");
		BufferedReader bufferedReader = new	BufferedReader(new InputStreamReader(System.in)); 
		Statement st=con.createStatement();
		boolean res = st.execute(bufferedReader.readLine());
		
		if(res) {
			ResultSet set = st.getResultSet();
			ResultSetMetaData data = set.getMetaData();//read the column property
			int count = data.getColumnCount();
			//String r=data.getColumnName(2);
			//getColumnName & getColumnLable is both is similar
			
			while(set.next()) {
				
				for(int i=1;i<=count;i++) {
					System.out.println(data.getColumnName(i)+" of the product is "+ set.getObject(i));
				}
//				System.out.println(set.getObject(1));///get the data from table
//				System.out.println(set.getObject(2));
//				System.out.println(set.getObject(3));
				System.out.println("_______________________________");
		
			}
		}
		System.out.println("-->DB operation successfullyy");
		con.close();
	}catch (Exception e) {
		e.printStackTrace();
	}
	
	}
	

}
