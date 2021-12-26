package com.onlineelectronicshop.main;


import java.util.Date;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.List;
import java.util.Scanner;

import com.onlineelectronicshop.dao.AdminDao;
import com.onlineelectronicshop.dao.ComponentDao;
import com.onlineelectronicshop.dao.PaymentDao;
import com.onlineelectronicshop.dao.CartDao;
import com.onlineelectronicshop.dao.UserDao;
import com.onlineelectronicshop.model.Cart;
import com.onlineelectronicshop.model.Components;
import com.onlineelectronicshop.model.Payment;
import com.onlineelectronicshop.model.User;



public class TestMain {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, ParseException {

		Scanner scan = new Scanner(System.in);
		System.out.println("\tWelcome to Online electronic Shop");
		System.out.println("\n1.Register\n2.Login\nEnter your Choice :");
		int choice = Integer.parseInt(scan.nextLine());

		UserDao userDao = null;
		String userName = null;
		String emailId = null;
		String password=null; 
		String contactNumber;
		String address=null;
		String orderDao=null;
		String adminDao=null;
	
		switch (choice) {
		case 1:
			userDao = new UserDao();
			int flag = 0;
			System.out.println("Enter user Name:");
			userName = scan.nextLine();
			do {
				if (userName.matches("[A-Za-z]{5,}")) {
					flag = 0;
					break;
				} else
					System.out.println("Enter valid name ");
				userName = scan.nextLine();
				flag = 1;
			} while (flag == 1);
			// email
			System.out.println("Enter email ID:");
			emailId = scan.nextLine();

			do {
				if (emailId.matches("[a-z0-9]+[@][a-z]+[.][a-z]+{8,15}")) {
					flag = 0;
					break;
				} else
					System.out.println("Enter valid email ");
				emailId = scan.nextLine();
				flag = 1;
			} while (flag == 1);
        //password
			System.out.println("Enter password:");
			password = scan.nextLine();
			do {
				if (password.matches("[A-Za-z0-9]{8,10}")) {
					flag = 0;
					break;
				} else
					System.out.println("Enter valid password pattern");
				password = scan.nextLine();
				flag = 1;
			} while (flag == 1);
			//mobile number
			System.out.println("Enter contact number");
			contactNumber=scan.nextLine();
			do {
				if (contactNumber.matches("[0-9]{10}")) {
				flag=0;
				break;
				}
			else
					System.out.println("enter mobile number ");
			contactNumber=scan.nextLine();
			flag=1;
			}while(flag==1);
			Long contactNo=Long.parseLong(contactNumber);
	//address
		System.out.println("Enter the addrss");
			address=scan.nextLine();
			do {
				if(address.matches("[A-Za-z0-9/,]")) {
					flag=0;
					break;
				}else
				{
					System.out.println("enter the address");
				address=scan.nextLine();
				flag=1;
				break;
				}
			}while(flag==1);
			
			
			
			User user = new User(userName,emailId,password,contactNo,address);
			userDao.insertUser(user);
			System.out.println("enter your update details");
			String update=scan.nextLine();
			userDao.update(update);
			System.out.println("enter your  delete details");          
            String delete=scan.nextLine();
            userDao.deleteUser(delete);	
		
//login details
		case 2:
			userDao=new UserDao();
			System.out.println("Login ");
			System.out.println("Enter  email ID");
			emailId=scan.nextLine();
			int userChoice=1;
			do {
				if (emailId.matches("[a-z0-9]+[@][a-z]+[.][a-z]+{8,15}")) {
					flag = 1;
					break;
				} else
					System.out.println("Enter valid email ");
				emailId = scan.nextLine();
				flag = 0;
			} while (flag == 0);
//password validation
			System.out.println("Enter password:");
		    password = scan.nextLine();
			do {
				if (password.matches("[A-Za-z0-9]{8,10}")) {
					flag = 0;
					break;
				} else
					System.out.println("Mismatch password");
					System.out.println("Enter valid password pattern");
				    password = scan.nextLine();
				    flag = 1;
			} while (flag == 1);
			User currentUser=UserDao.validateUser(emailId,password);
			if(currentUser==null) {
				User adminuser=AdminDao.validateAdmin(emailId, password);
				System.out.println("welcome!\t"+adminuser.getUserName()+"\t as admin");
				System.out.println("\n1.ListUser \n2.find user\n3.update component \n4.delete component");
				System.out.println("Enter your coice");
				choice=Integer.parseInt(scan.nextLine());
				switch(choice) {
				case 1:
					System.out.println("List all user");
					List<User> UsersList=UserDao.showAllUser();
					for(int i=0;i<UsersList.size();i++) {
						System.out.println("\n"+UsersList.get(i));
						
					}
				case 2:
					userDao=new UserDao();
					System.out.println("enter emailId:\n");
					emailId=scan.nextLine();
					int userId=UserDao.findUserId(userName);
					System.out.println("user id:"+userId);
					
				case 3:
					
					
			System.out.println("please enter your new component and existing component Id using comma:");
					String updateComponent=scan.nextLine();
					
					ComponentDao.updateComponent(updateComponent);
					
				case 4:
					System.out.println("enter your component id for delete component");
					String deleteComponent=scan.nextLine();
					ComponentDao.deleteComponent(deleteComponent);
					
					
					
				}}else {
					System.out.println("welcome!\t"+currentUser.getUserName());
					System.out.println();
							
				}   
				System.out.println("Welcome\t"+currentUser.getUserName());
				System.out.println("\n1.show components");
			
		//1
			choice=Integer.parseInt(scan.nextLine()); 
			int orderChoice=0;
		
		
			switch(choice) {
			case 1:
				ComponentDao comDao=new ComponentDao();
				CartDao order=new CartDao();
				List<Components> componentList=comDao.showComponent();
				for(int i=0;i<componentList.size();i++) {
					//System.out.println(componentList.get(i));
				System.out.println("component name:"+componentList.get(i).getComponentName());
				System.out.println("component category name:"+componentList.get(i).getCategoryName());
				System.out.println("comonent description:"+componentList.get(i).getDescription());
				System.out.println("component price:"+componentList.get(i).getTotalPrice());
					
				}
				
				System.out.println("\n1.insert cart\n2.view cart\n3.update cart\n4.delete cart\n5.buy component");
				orderChoice=Integer.parseInt(scan.nextLine());
			    Components component=null;
				String userFlag=null;
				String userFlagChoice=null;
				CartDao cartDao=null;
				
//				PaymentDao payDao=new PaymentDao();
//				String cardNumber=null;
//				String cvv=null;
//				Date expiryDate=null;
//				String cardHolderName=null;
//				Double paidAmount=null;
				int walletbalance=0;
				String  input=null;
					switch(orderChoice)
					{	
					case 1:
						
						
						String UserName=currentUser.getUserName();	
							int userid1=UserDao.findUserId(UserName);	
							//System.out.println("user"+userid1);
							//System.out.println("user"+userid1);
							//System.out.println("List of components");
							//List<Components> componentList1=comDao.showComponent();
//							for(int i=0;i<componentList.size();i++) {
//								System.out.println(componentList.get(i));
//							}
//							
							System.out.println("enter component name");
							String ComponentName=scan.nextLine();
							
							int comid=ComponentDao.findComponentId(ComponentName);
							//System.out.println("component"+comid);
							double price=comDao.findPrice(comid);
							
					        System.out.println(price);
					        
							System.out.println("\nEnter no of components Needed");
							
							int quantity=Integer.parseInt(scan.nextLine());
							
							
							double TotalPrice=(double)(quantity*price);
							System.out.println("TotalPrice"+TotalPrice);
							//Cart cart1=new Cart(comid,userid1,quantity,TotalPrice);	
//							Cart cart1=new Cart();
							
					        
//					       if(n>0) {
//					    	   System.out.println("success");
//					       }

							System.out.println("Thank you!");
							System.out.println("proceed to buy");
							int walletbal=0;
							//confirm order
							try {
								
							
							walletbal = userDao.walletBalance(userid1);
							}catch(Exception e) {
								e.printStackTrace();
							}
							
							int dedwallbal = (int)(walletbalance - TotalPrice);
							System.out.println("\n 1.confirm order \n 2.cancel order");
							
							int orderConfirmation =scan.nextInt();
							scan.nextLine();
							switch (orderConfirmation) 
							{
							case 1:
								if (TotalPrice <= walletbalance) {
									int upd =0; 
									try {
									userDao.updateWallet(dedwallbal, userid1);
									}catch(Exception e) {
										e.printStackTrace();
									}
									if(upd > 0) {
										Cart cart1 = new Cart (comid,userid1,quantity,TotalPrice);
										
								        CartDao.insertCart(cart1);
									System.out.println("order placed successfully!!!");
									}else {
										System.out.println("something went wrong try again!!");
									}
								} else {
									System.out.println("Low Balance please top up!!");
								}
								  boolean flag1=false;
								break;
							case 2:
								System.out.println("Order Cancelled");
								break;
							}
							
							//payment	
//						do {
//							System.out.println("enter your payment details:");
//							System.out.println("enter your card number");
//							 cardNumber=scan.nextLine();
//							if(cardNumber.matches("[0-9]{16}+")) {
//						flag=0;	
//						break;
//							}else
//								System.out.println("Enter valid card number ");
//							cardNumber = scan.nextLine();
//							flag=1;
//							}while(flag==1);
//							Long cardNo=Long.parseLong(cardNumber);
//							
//							//validate cvv
//							do {
//								System.out.println("enter cvv number");
//								cvv=scan.nextLine();
//							if(cvv.matches("[0-9]+{3}")) {
//							flag=0;
//							break;
//							}else
//								System.out.println("enter cvv number");
//							cvv=scan.nextLine();
//							flag=1;
//							}while(flag==1);
//							Integer cvv1=Integer.parseInt(cvv);
//							
//							//validate expiry date
//							do {
//							System.out.println("enter expiry date");
//							SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
//							
//							expiryDate=(Date) sdf.parse(scan.nextLine());
//							
//							
//							}while(flag==1);
////						
//						do {
//							System.out.println("enter card holder name");
//							cardHolderName=scan.nextLine();
//							if(cardHolderName.matches("[A-Z][a-z]{21}")) {
//								flag=0;
//								break;
//							}else
//								System.out.println("enter valid card holder name");
//							cardHolderName=scan.nextLine();
//						}while(flag==1);
//						
//						do {
//							System.out.println("enter purchased amount ");
//							paidAmount=scan.nextDouble();
//							if(paidAmount==TotalPrice) {
//								System.out.println("payment process completed successfully!.Your order is confirm");
//								flag=0;
//								break;
//							}
//							else
//								{System.out.println("invalid purchased amount please enter valid amount");
//								}
//									
//						}while(flag==1);
//						
//								
//						
//						Payment payment=new Payment(cardNo,cvv1,expiryDate,cardHolderName,paidAmount);
//					case 2:
//				System.out.println("orders in cart");
//						List<Cart> userCartList=order.viewCart(currentUser);
//						System.out.println(userCartList);
//						break;
//					
					//update cart
					case 3:

						System.out.println("enter your new quantity and your cart id using comma:");
						String updateCart = scan.nextLine();
						CartDao.updateCart(updateCart);
						break;
//delete cart					

					case 4:
						System.out.println("enter your cart id for delete:");
						String deleteCart = scan.nextLine();
					    CartDao.deleteCart(deleteCart);				
				
					}while(choice<5);
					
					break;
			
					}
					
}}}

			