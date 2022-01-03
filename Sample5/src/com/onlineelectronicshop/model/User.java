package com.onlineelectronicshop.model;

import java.util.Objects;

public class User {

	private String userName;
	private String emailId;
	private String password;
	private Long contactNumber;
	private String address;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(Long contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public User(String userName, String emailId, String password, Long contactNumber, String address) {
		super();
		this.userName = userName;
		this.emailId = emailId;
		this.password = password;
		this.contactNumber = contactNumber;
		this.address = address;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "User [userName=" + userName + ", emailId=" + emailId + ", password=" + password + ", contactNumber="
				+ contactNumber + ", address=" + address + "]";
	}

	
	
}
