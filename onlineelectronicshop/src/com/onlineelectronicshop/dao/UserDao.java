package com.onlineelectronicshop.dao;


	import java.sql.Connection;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.onlineelectronicshop.model.User;



	public class UserDao {

		public void insertUser(User user) {
			String insertQuery ="insert into user_details(user_name,email_id,password,contact_number,address) values(?,?,?,?,?)";
		    
			ConnectionUtil conUtil = new ConnectionUtil();
			Connection con = conUtil.getDbConnection();
			PreparedStatement pstmt = null;
			
			try {
				pstmt = con.prepareStatement(insertQuery);
				pstmt.setString(1, user.getUserName());
				pstmt.setString(2, user.getEmailId());
				pstmt.setString(3, user.getPassword());
				pstmt.setLong(4, user.getContactNumber());
				pstmt.setString(5,user.getAddress());
				pstmt.executeUpdate();
				System.err.println("Value inserted Successfully");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("Value not inserted in the table");
			}
			
		}
		
		
			public static User validateUser(String emailId,String password)
			{
				String validateQuery="select * from user_details where role='user' and email_id='"+emailId+"'and password='"+password+"'";
				Connection con=ConnectionUtil.getDbConnection();
				User user=null;
				try {
					Statement st=con.createStatement();
					ResultSet rs=st.executeQuery(validateQuery);
					if(rs.next())
					{
						user=new User(rs.getString(2),emailId,password,Long.parseLong(rs.getString(5)),rs.getString(6));
					}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("Statement error");
			} 
			return user;
			
			}
			public void update(String update){
				String updatequery="update user_details set password=? where email_id=?";
				Connection con=ConnectionUtil.getDbConnection();
				System.out.println("connection get succesfully");
				try {
					PreparedStatement pstmt=con.prepareStatement(updatequery);
					pstmt.setString(1, update.split(",")[0]);
					pstmt.setString(2,update.split(",")[1]);
					int i=pstmt.executeUpdate();
					System.out.println(i+"row updated");
					pstmt.close();
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
			}
			
			    public void deleteUser(String delete){
				String deleteQuery="delete from user_details where email_id=?";
				Connection con=ConnectionUtil.getDbConnection();
				System.out.println("connection get successfully");
				try {
				PreparedStatement pstmt=con.prepareStatement(deleteQuery);
				pstmt.setString(1,delete);
				int i=pstmt.executeUpdate();
				System.out.println(i+"row deleted");
				pstmt.close();
				con.close();
			}
			    catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			    }	
				public static int findUserId(String userName)
				{
					String findUserId="select user_id from user_details where user_name='"+userName+"'";
					Connection con=ConnectionUtil.getDbConnection();
					Statement stmt;
					int userId=0;
					try {
						stmt = con.createStatement();
						ResultSet rs=stmt.executeQuery(findUserId);
						if(rs.next())
						{
						
						userId=rs.getInt(1);
						}
						
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					return userId;
					
				}
					

				public static List<User> showAllUser() {
					List<User> UsersList=new ArrayList<User>();
					
					String showQuery="select *from user_details";
					Connection con=ConnectionUtil.getDbConnection();
					System.out.println("connection get successfully");
					Statement stmt;
					try {
					stmt=con.createStatement();
					ResultSet rs=stmt.executeQuery(showQuery);
					while(rs.next()) {
				
						UsersList.add(new User(rs.getString(2),rs.getString(3),rs.getString(4),rs.getLong(5),rs.getString(6)));
					}
					}catch(SQLException e) {
						e.printStackTrace();
					}
					
					return UsersList;
				}
				//wallet
				public int walletBalance(int id) throws SQLException {
					Connection con=ConnectionUtil.getDbConnection();
					String query="select wallet from user_details where user_id=?";
					PreparedStatement pstmt=con.prepareStatement(query);
					pstmt.setInt(1,id);
					ResultSet rs=pstmt.executeQuery();
					while(rs.next()) {
						return rs.getInt(1);
					}
					return -1;
				}
				
			    //update wallet
				public int updateWallet(int amount,int userId) throws SQLException {
					Connection con=ConnectionUtil.getDbConnection();
					String query="update user_details set wallet=? where user_id=?";
					PreparedStatement pstmt=con.prepareStatement(query);
					pstmt.setInt(1, amount);
					pstmt.setInt(2, userId);
					int result=pstmt.executeUpdate();
					System.out.println(result);
					pstmt.executeUpdate("commit");
					return result;
					
					
					
					
				}
				}
				
				 
				
			
			



