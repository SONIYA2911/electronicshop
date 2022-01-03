package com.onlineelectronicshopdao;

import java.util.List;


import com.onlineelectronicshop.model.User;

public interface Cart {
	
	public void  insertCart(Cart cart);
	
	public List<Cart> viewCart(User currentUser);
	public void updateCart(String updateCart);
	public void deleteCart(String deleteCart);
	public Cart findCart(int cartId);
	
	
	

}
