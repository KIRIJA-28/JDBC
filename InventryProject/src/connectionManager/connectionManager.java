package connectionManager;

import java.sql.*;
public class connectionManager {

	Connection con = null;
	
	public Connection establishconnection() throws ClassNotFoundException,SQLException
	{
		
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/InventryProject","root","Kirijadeep@1728");
     
	 return con;
	}
     public void closeconnection()throws SQLException
     {
    	 con.close();
     }
}
