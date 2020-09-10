package com.botton.sda.entity;

public class Item {

	private String id;

	private int quantity;

	private double price;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Item(String[] item) {
		this.id = item[0];
		this.quantity = Integer.parseInt(item[1]);
		this.price = Double.parseDouble(item[2]);
	}

	public double getTotalItemBoxValue() {
		return quantity * price;
	}

	// no evidence that is needed equals or hash based on business rules

}
