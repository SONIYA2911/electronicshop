package com.onlineelectronicshop.model;

import java.sql.Date;
import java.util.Objects;

public class Cart {
	private int itemId;
private int componetId;
private int userId;
private int quantity;
private double totalPrice;

public int getItemId() {
	return itemId;
}
public void setItemId(int itemId) {
	this.itemId = itemId;
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
public Cart(int componetId, int userId, int quantity, double totalPrice) {
	super();
	this.componetId = componetId;
	this.userId = userId;
	this.quantity = quantity;
	this.totalPrice = totalPrice;
}
public Cart() {
	super();
	// TODO Auto-generated constructor stub
}
public Cart(int int1, int int2, int int3, int int4, double double1) {
	// TODO Auto-generated constructor stub
	super();
	this.itemId=int1;
	this.componetId = int2;
	this.userId = int3;
	this.quantity = int4;
	this.totalPrice = double1;
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