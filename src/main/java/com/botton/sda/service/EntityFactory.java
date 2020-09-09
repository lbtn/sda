package com.botton.sda.service;

import com.botton.sda.entity.Customer;
import com.botton.sda.entity.ParserLineDTO;
import com.botton.sda.entity.Sale;
import com.botton.sda.entity.Seller;

//this factory resolve lines to the correct objects
public class EntityFactory {

	public ParserLineDTO create(ParserLineDTO p) {
		if(1 == p.getType()) {
			return new Seller(p);
		}
		if(2 == p.getType()) {
			return new Customer(p);
		}
		if(3 == p.getType()) {
			return new Sale(p);
		}
		return null;
	}
	
}
