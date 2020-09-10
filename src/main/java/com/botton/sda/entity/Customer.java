package com.botton.sda.entity;

public class Customer extends ParserLineDTO {

	private String cnpj;

	private String name;

	private String businessArea;

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBusinessArea() {
		return businessArea;
	}

	public void setBusinessArea(String businessArea) {
		this.businessArea = businessArea;
	}

	public Customer(ParserLineDTO p) {
		super();
		this.cnpj = p.getContent()[1];
		this.name = p.getContent()[2];
		this.businessArea = p.getContent()[3];
	}

	public Customer(String line) {
		super(line);
	}

}
