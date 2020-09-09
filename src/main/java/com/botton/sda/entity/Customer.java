package com.botton.sda.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class Customer extends ParserLineDTO {
	
	private String cnpj;
	
	private String name;
	
	private String businessArea;

	public Customer(ParserLineDTO p) {
		super();
		this.cnpj = p.getContent()[1];
		this.name = p.getContent()[2];
		this.businessArea = p.getContent()[3];
	}
	
}
