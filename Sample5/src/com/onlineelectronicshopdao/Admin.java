package com.onlineelectronicshopdao;

import com.onlineelectronicshop.model.User;

public interface Admin {

	public User validateAdmin(String email,String password);
}
