package com.botton.sda.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class Item {
	
	private String id;
	
	private int quantity;
	
	private double price;

	public Item(String[] item) {
		this.id = item[0];
		this.quantity = Integer.parseInt(item[1]);
		this.price = Double.parseDouble(item[2]);
	}
	
	public double getTotalItemBoxValue() {
		return quantity * price;
	}
	
	//no evidence that is needed equals or hash based on business rules
	
}
