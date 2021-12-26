package com.onlineelectronicshop.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


import com.onlineelectronicshop.model.Payment;

public class PaymentDao {
	public void validatePayment(Payment payment) throws SQLException {		
	Connection con=ConnectionUtil.getDbConnection();
	String insertQuery="insert into payment_details (user_id,card_number,card_holder_name,expiry_date,paid_amount) values (?,?,?,?,?)";
	PreparedStatement pstmt=null;
	try {
	pstmt.setLong(1, payment.getCardNumber());
	pstmt.setDate(2, new java.sql.Date(payment.getExpiryDate().getTime()));
	 pstmt.setString(3, payment.getCardHolderName());
	 pstmt.setDouble(4,payment.getPaid_amount());
pstmt.executeUpdate();
System.out.println("payment details entered successfully");
	}catch(SQLException e) {
		e.printStackTrace();
		System.out.println("card details not found");
	}

	
	}
}
