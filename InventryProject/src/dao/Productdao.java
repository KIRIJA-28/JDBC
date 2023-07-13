package dao;

import java.sql.*;





import connectionManager.connectionManager;

import Model.Product;



public class Productdao

{

	public void addProduct(Product product) throws ClassNotFoundException, SQLException

	{

		connectionManager conm = new connectionManager();

		Connection con = conm.establishconnection();

		

		String sql_query = "insert into product(productId,productName,minsellQuality,price,quantity) values(?,?,?,?,?)";

		PreparedStatement ps = con.prepareStatement(sql_query);

		ps.setInt(1,product.getProductId());

		ps.setString(2,product.getProductName());

		ps.setInt(3,product.getMinsellQuantity());

		ps.setInt(4,product.getPrice());

		ps.setInt(5,product.getQuantity());

		

		ps.executeUpdate();

	

		conm.closeconnection();

		

		

	}

}

