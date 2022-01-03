package com.electronics;

public class Car implements Comparable<Car>{
	
	private int engineNumber;
	private String carModel;
	private String varient;
	public int getEngineNumber() {
		return engineNumber;
	}
	public void setEngineNumber(int engineNumber) {
		this.engineNumber = engineNumber;
	}
	public String getCarModel() {
		return carModel;
	}
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	public String getVarient() {
		return varient;
	}
	public void setVarient(String varient) {
		this.varient = varient;
	}
	public Car(int engineNumber, String carModel, String varient) {
		super();
		this.engineNumber = engineNumber;
		this.carModel = carModel;
		this.varient = varient;
	}
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Car [engineNumber=" + engineNumber + ", carModel=" + carModel + ", varient=" + varient + "]";
	}
	@Override
	public int compareTo(Car o) {
		if(this.engineNumber==o.engineNumber)
		{
		return 0;
	}else if(this.engineNumber>o.engineNumber)
	{
		return 1;
		
	}else {
		return -1;
	}
}}
