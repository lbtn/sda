package com.botton.sda.entity;

import java.util.ArrayList;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class Sale extends ParserLineDTO {
	
	private String saleId;
	
	private String itemsLineDTO;
	
	private ArrayList<Item> itens;
	
	private String salesmanName;

	public Sale(ParserLineDTO p) {
		super();
		this.saleId = p.getContent()[1];
		this.itemsLineDTO = p.getContent()[2];
		this.itens = itensParser(this.itemsLineDTO);
		this.salesmanName = p.getContent()[3];
		
	}
	
	//TODO: probably can be way better
	public ArrayList<Item> itensParser(String itemsLineDTO){
		ArrayList<Item> myItems = new ArrayList<Item>();
		itemsLineDTO = itemsLineDTO.replace("[","").replace("]","");
		String[] itemsNotSeparated = itemsLineDTO.split(",");
		for (String itemNotFormatted : itemsNotSeparated) {
			String[] item = itemNotFormatted.split("-");
			myItems.add(new Item(item));
		}
		
		return myItems;
	}
	
	public double getTotalSellValue() {
		double sum = 0;
		for (Item item : itens) {
			sum += item.getTotalItemBoxValue();
		}
		return sum;
	}

	//overriding hashCode and equals to use HashSet for unique objects
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((saleId == null) ? 0 : saleId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sale other = (Sale) obj;
		if (saleId == null) {
			if (other.saleId != null)
				return false;
		} else if (!saleId.equals(other.saleId))
			return false;
		return true;
	}
	
	
	
}
