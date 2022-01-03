package com.onlineelectronicshop.daoImpl;


	import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;
	import java.util.ArrayList;
	import java.util.List;

import com.onlineelectronicshop.model.Components;
import com.onlineelectronicshop.util.ConnectionUtil;

	public class ComponentDaoImpl {

		public List<Components> showComponent(){
			List<Components> componentsList=new ArrayList<Components>();
			
				try {
				String showQuery="select*from component_info";
				Connection con=ConnectionUtil.getDbConnection();
			    Statement stmt=con.createStatement();
			    ResultSet rs=stmt.executeQuery(showQuery);
			    while(rs.next()) {
			    	Components component=new Components(rs.getString(2),rs.getString(3),rs.getString(4),rs.getDouble(5));
			    	componentsList.add(component);                         
			    }
			    			                          
			    }catch(SQLException e) {	
			    			e.printStackTrace();
			    }
				return componentsList;
				}
				
		
		public static int findComponentId(String ComponentName)
		{
			String query="select component_id from component_info where component_name='"+ComponentName+"'";
			Connection con=ConnectionUtil.getDbConnection();
			Statement stmt;
			int componentId=0;
			try {
				stmt = con.createStatement();
				ResultSet rs=stmt.executeQuery(query);				
				if(rs.next())
				{
				componentId=rs.getInt(1);
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return componentId;
			
		}
		
		public static Components findComponent(int componentId) {
			String query="select *from component_info where component_id=?";
		Connection con=ConnectionUtil.getDbConnection();
		Components component=null;
		try {
			PreparedStatement pstmt=con.prepareStatement(query);
			pstmt.setInt(1, componentId);
			ResultSet rs=pstmt.executeQuery(query);
			if(rs.next()) {
				component=new Components(rs.getString(2),rs.getString(3),rs.getString(4),rs.getDouble(5));
			}}
			catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return component;
			
		}
		

		public static void updateComponent(String updateComponent) throws ClassNotFoundException, SQLException {
			String updateQuery = "update component_info set Component_name =?  where component_id=?";

			Connection con = ConnectionUtil.getDbConnection();
			PreparedStatement pstmt = con.prepareStatement(updateQuery);
			pstmt.setString(1, updateComponent.split(",")[0]);
			pstmt.setInt(2, Integer.parseInt(updateComponent.split(",")[1]));
			int i = pstmt.executeUpdate();
			System.out.println(i + "row updated");
			pstmt.close();
			con.close();
		}	
		public static void deleteComponent(int ComponentId) throws SQLException {
			String deleteQuery = "delete from component_info where component_id=?";

			Connection con = ConnectionUtil.getDbConnection();
			
			PreparedStatement pstmt = con.prepareStatement(deleteQuery);
			pstmt.setInt(1, (ComponentId));
			int i = pstmt.executeUpdate();
			System.out.println(i + "row deleted");
			pstmt.close();
			con.close();
		}
		
		public Double findPrice(int comId) {
			String query="select *from component_info where component_id='"+comId+"'";
			Connection con=ConnectionUtil.getDbConnection();
			//ComponentDao comDao=new ComponentDao();
			double price=0;
			Statement stmt=null;
			try {
				 stmt=con.createStatement();
				 ResultSet rs=stmt.executeQuery(query);
				 if(rs.next())
					{
						price=rs.getDouble(5);
					}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return price;
	}

//		
		
		
		public List<Components> findCategory(String categoryName) {
			 List<Components> componentsList=new ArrayList<Components>();
			 String query="select * from component_info where category_name='"+categoryName+"'";
			 Connection con=ConnectionUtil.getDbConnection();
			 Components component=null;
		 	        Statement stmt;
					try {
						stmt = con.createStatement();
						ResultSet rs;
						rs = stmt.executeQuery(query);
					   while(rs.next()) {
 	
try {
component = new Components(categoryName,rs.getString(3),rs.getString(4),rs.getDouble(5));
} catch (SQLException e) {
//TODO Auto-generated catch block
e.printStackTrace();
}
 	componentsList.add(component);                         
  
						
						}
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		 	
			return componentsList ;
		 }		
			
		

		
		
		
		

}