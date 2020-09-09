package com.botton.sda.entity;

import java.util.Arrays;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
//DTO: Data Transfer Object
//used in this case to garantee in memory data as soon as possible
public class ParserLineDTO {

	private int type;
	private String[] content;
	
	public ParserLineDTO(String line) {
		String type = line.substring(0, 3);
		this.type = Integer.parseInt(type);
		this.content = line.split("ç");
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
