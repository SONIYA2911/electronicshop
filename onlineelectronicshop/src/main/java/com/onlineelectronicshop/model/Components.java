package com.onlineelectronicshop.model;

	import java.util.Objects;
	public class Components {
		private int compoentId;
		private String componentName;
		private String categoryName;
		private String description;
		private double price;
		
		
		public int getCompoentId() {
			return compoentId;
		}
		public void setCompoentId(int compoentId) {
			this.compoentId = compoentId;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		public String getComponentName() {
			return componentName;
		}
		public void setComponentName(String componentName) {
			this.componentName = componentName;
		}
		public String getCategoryName() {
			return categoryName;
		}
		public void setCategoryName(String categoryName) {
			this.categoryName = categoryName;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public double getTotalPrice() {
			return price;
		}
		public void setTotalPrice(double totalPrice) {
			this.price = totalPrice;
		}
		public Components(String componentName, String categoryName, String description,
				double totalPrice) {
			super();
			this.componentName = componentName;
			this.categoryName = categoryName;
			this.description = description;
			this.price = totalPrice;
		}
		public Components() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Components(int int1, String string, String string2, String string3, double double1) {
			this.compoentId=int1;
			this.componentName = string;
			this.categoryName = string2;
			this.description = string3;
			this.price = double1;
		}
		public Components(int int1, int int2, String string, String string2, String string3, double double1) {
		
		
			// TODO Auto-generated constructor stub
		}
		@Override
		public String toString() {
			return "Components [ componentName=" + componentName + ", categoryName="
					+ categoryName + ", description=" + description + ", totalPrice=" + price + "]";
		}
		@Override
		public int hashCode() {
			return Objects.hash(categoryName, componentName, description, price);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Components other = (Components) obj;
			return Objects.equals(categoryName, other.categoryName)
					&& Objects.equals(componentName, other.componentName)
					&& Objects.equals(description, other.description)
					&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price);
		}
		
		
		
		
		}
		
		
		
		
	
