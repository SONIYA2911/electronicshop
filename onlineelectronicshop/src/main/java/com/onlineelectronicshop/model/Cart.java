package com.onlineelectronicshop.model;

import java.sql.Date;
import java.util.Objects;

public class Cart {
	private int cartId;
private int componetId;
private int userId;
private int quantity;
private double totalPrice;


public int getCartId() {
	return cartId;
}
public void setCartId(int cartId) {
	this.cartId = cartId;
}
public int getComponetId() {
	return componetId;
}
public void setComponetId(int componetId) {
	this.componetId = componetId;
}
public int getUserId() {
	return userId;
}
public void setUserId(int userId) {
	this.userId = userId;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public double getTotalPrice() {
	return totalPrice;
}
public void setTotalPrice(double totalPrice) {
	this.totalPrice = totalPrice;
}


public Cart() {
	super();
	// TODO Auto-generated constructor stub
}
public Cart(int cartId, int componetId, int userId, int quantity, double totalPrice) {
	super();
	this.cartId = cartId;
	this.componetId = componetId;
	this.userId = userId;
	this.quantity = quantity;
	this.totalPrice = totalPrice;
}
public Cart(int int1, int int2, int int3, double double1) {
	this.cartId=int1;
	this.componetId=int2;
	this.userId=int3;
	this.totalPrice=double1;
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Cart [componetId=" + componetId + ", userId=" + userId + ", quantity=" + quantity + ", totalPrice="
			+ totalPrice + "]";
}
@Override
public int hashCode() {
	return Objects.hash(componetId, quantity, totalPrice, userId);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Cart other = (Cart) obj;
	return componetId == other.componetId && quantity == other.quantity
			&& Double.doubleToLongBits(totalPrice) == Double.doubleToLongBits(other.totalPrice)
			&& userId == other.userId;
}




}