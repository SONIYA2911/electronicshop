package com.onlineelectronicshop.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.onlineelectronicshop.model.Cart;
import com.onlineelectronicshop.model.Components;
import com.onlineelectronicshop.model.User;

public class CartDao {
	//insert cart
public static void  insertCart(Cart cart) throws SQLException {
	ComponentDao comDao=new ComponentDao(); 
	UserDao userDao=new UserDao();
	

	String insertQuery = "insert into order_items (user_id,component_id,quantity,total_price) values(?,?,?,?)";
Connection con=ConnectionUtil.getDbConnection();
PreparedStatement pstmt=null;
try {
pstmt=con.prepareStatement(insertQuery);
pstmt.setInt(1, cart.getUserId());
pstmt.setInt(2, cart.getComponetId());
pstmt.setInt(3, cart.getQuantity());
pstmt.setDouble(4,cart.getTotalPrice());
 pstmt.executeUpdate();
System.out.println("value inserted successfully");
}catch(SQLException e) {
	e.printStackTrace();
}


}
//view cart
public List<Cart> viewCart(User currentUser) {
	
	
	List<Cart> userCartList = new ArrayList<Cart>();
	String query = "select * from order_items";
	Connection con = ConnectionUtil.getDbConnection();	
	ComponentDao comDao = new ComponentDao();		
	
	
	try {
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(query);
		while (rs.next()) {				
			
		    userCartList.add(new Cart(rs.getInt(2),rs.getInt(3),rs.getInt(4),rs.getDouble(5)));
	   
		}
		
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
	return userCartList;
}
public static void updateCart(String updateCart) throws ClassNotFoundException, SQLException {
	String updateQuery = "update order_items set quantity =? where item_id=?";

	Connection con = ConnectionUtil.getDbConnection();
	PreparedStatement pstmt = con.prepareStatement(updateQuery);
	pstmt.setInt(1, Integer.parseInt(updateCart.split(",")[0]));
	pstmt.setInt(2, Integer.parseInt(updateCart.split(",")[1]));
	int i = pstmt.executeUpdate();
	System.out.println(i + "row updated");
	pstmt.close();
	con.close();
}

// delete cart

public static void deleteCart(String deleteCart)  {
	String deleteQuery = "delete from order_items where item_id=?";

	Connection con = ConnectionUtil.getDbConnection();
	PreparedStatement pstmt;
	try {
		pstmt = con.prepareStatement(deleteQuery);
		pstmt.setInt(1, Integer.parseInt(deleteCart));
		int i = pstmt.executeUpdate();
		System.out.println(i + "row deleted");
		pstmt.close();
		con.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}}

	public static Cart findCart(int cartId) {
		String query = "select * from order_items where item_id=?";

		Connection con = ConnectionUtil.getDbConnection();
		Cart cart = null;
		try {
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setInt(1, cartId);

			ResultSet rs = pstmt.executeQuery(query);

			if (rs.next()) {
			 cart=new Cart(rs.getInt(0),rs.getInt(1),rs.getInt(2),rs.getDouble(3));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return cart;

	
}
	




}

