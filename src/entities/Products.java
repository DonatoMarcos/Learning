package entities;

import lombok.Data;

public @Data class Products {
	
	private String name;
	private double price;
	private int quantity;
	
	
	public Products() {
		super();
	}
	
	public Products(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Products(String name, double price) {
		this.name = name;
		this.price = price;
		quantity = 1;  // No need to use this here.
	}
	
	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	
	public void removeProducts(int quantity) throws Exception{
		if (this.quantity > quantity)
			this.quantity -= quantity;
		else
			throw new Exception();
	}
	
	public String toString() {
		return name 
			   + ",  $ " 
			   + String.format("%.2f", price) 
			   + ", "   
			   + quantity 
			   + " units, Total = $ "
			   + String.format("%.2f", totalValueInStock());
	}
}
