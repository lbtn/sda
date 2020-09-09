package com.botton.sda.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class Seller extends ParserLineDTO {
	
	private String cpf;
	private String name;
	private double salary;
	private double amount;

	public Seller(ParserLineDTO p) {
		super();
		this.cpf = p.getContent()[1];
		this.name = p.getContent()[2];
		this.salary = Double.parseDouble(p.getContent()[3]);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
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
		Seller other = (Seller) obj;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		return true;
	}
	
	
}
