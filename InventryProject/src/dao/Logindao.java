package dao;

import Model.Login;

import java.sql.*;

import connectionManager.connectionManager;

public   class Logindao {
 
	public  boolean validate(Login login) throws ClassNotFoundException,SQLException
	{
		//user input
		String username=login.getUsername();
		String password=login.getPassword();
		
		//connect java and jdbc
		connectionManager conm=new connectionManager();
		Connection con=conm.establishconnection();
		
		//Statement class
		Statement st=con.createStatement();
		
		//ResultSet class
		ResultSet rt=st.executeQuery("select*from login");
		
		//check username and password
		while(rt.next())
		{
		   if(username.equals(rt.getString("username"))&&password.equals(rt.getString("password")))
		     {
			   conm.closeconnection();
			   return true;
		     }
		}
			 conm.closeconnection();
			 return false;
		}
	}


