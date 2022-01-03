package com.onlineelectronicshopdao;


import java.util.List;



public interface User {
	public void insertUser(User user);
	public User validateUser(String emailId,String password);
	public void update(String update);
	public void deleteUser(String delete);
	public int findUserId(String userName);
	public List<User> showAllUser();
	public int walletBalance(int id);
	public int updateWallet(int amount,int userId);

}
