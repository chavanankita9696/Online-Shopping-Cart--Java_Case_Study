package com.online.shopping.cart.casestudy;

public class Cart {

	private String item;
	private int price;
	private double weight;
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public Cart(String item, int price, double weight) throws CartException {
		
		this.item = item;
		if(price<=0)
			throw new InvalidPriceException("Sorry,Price Cannot be Negative!");
		this.price = price;
		if(weight<=0)
			throw new InvalidWeightException("Sorry,Weight Cannot be Negative!");
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "Cart [item=" + item + ", price=" + price + ", weight=" + weight + "]";
	}
	
}
