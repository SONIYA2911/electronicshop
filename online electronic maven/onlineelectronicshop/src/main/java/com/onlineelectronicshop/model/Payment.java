package com.onlineelectronicshop.model;

import java.sql.Date;
import java.util.Objects;

public class Payment {
	private long cardNumber;
	private int cvv;
	private Date expiryDate;
	private String cardHolderName;
	private double paidAmount;
	public long getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}
	public int getCvv() {
		return cvv;
	}
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
	public Date getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}
	public String getCardHolderName() {
		return cardHolderName;
	}
	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}
	public double getPaidAmount() {
		return paidAmount;
	}
	public void setPaidAmount(double paidAmount) {
		this.paidAmount = paidAmount;
	}
	public Payment(long cardNumber, int cvv, Date expiryDate, String cardHolderName, double paid_amount) {
		super();
		this.cardNumber = cardNumber;
		this.cvv = cvv;
		this.expiryDate = expiryDate;
		this.cardHolderName = cardHolderName;
		this.paidAmount = paidAmount;
	}
	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Payment [cardNumber=" + cardNumber + ", cvv=" + cvv + ", expiryDate=" + expiryDate + ", cardHolderName="
				+ cardHolderName + ", paidAmount=" + paidAmount + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(cardHolderName, cardNumber, cvv, expiryDate, paidAmount);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Payment other = (Payment) obj;
		return Objects.equals(cardHolderName, other.cardHolderName) && cardNumber == other.cardNumber
				&& cvv == other.cvv && Objects.equals(expiryDate, other.expiryDate)
				&& Objects.equals(paidAmount, other.paidAmount);
	}
	

}
