package com.botton.sda.entity;

import java.util.Arrays;

//DTO: Data Transfer Object
//used in this case to garantee in memory data as soon as possible
public class ParserLineDTO {

	private int type;
	private String[] content;

	public ParserLineDTO(String line) {
		System.out.println(line);
		String type = line.substring(0, 3);
		this.type = Integer.parseInt(type);
		this.content = line.split("ç");
		if(this.content.length>4 && this.type == 3) {
			this.content[4] = this.content[4]+this.content[5]; 
		}
	}

	public ParserLineDTO() {
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String[] getContent() {
		return content;
	}

	public void setContent(String[] content) {
		this.content = content;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(content);
		result = prime * result + type;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ParserLineDTO other = (ParserLineDTO) obj;
		if (!Arrays.equals(content, other.content))
			return false;
		if (type != other.type)
			return false;
		return true;
	}

}
