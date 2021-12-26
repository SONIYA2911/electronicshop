package com.onlineelectronicshop.model;



	import java.util.Objects;



	public class Components {

	
		private String componentName;
		private String categoryName;
		private String description;
		private double price;
		
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
		
		
		
		
	
