package com.botton.sda.test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import com.botton.sda.entity.ParserLineDTO;
import com.botton.sda.entity.Sale;

public class ItemTest {

	@Test
	public void getTotalItemBoxValueTest() {
		ParserLineDTO line = new ParserLineDTO("003ç10ç[1-10-100,2-30-2.50,3-40-3.10]çPedro");
		Sale sale = new Sale(line);
		assertEquals(sale.getItens().get(0), 1000);
	}
	
}