package com.botton.sda.test;



import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import com.botton.sda.entity.Item;
import com.botton.sda.entity.ParserLineDTO;
import com.botton.sda.entity.Sale;

public class SaleTest {
	
	@Test
	public void itensParserTest() {
        String itemsLineDTO = "[1-10-100,2-30-2.50,3-40-3.10]";
        Sale sale = new Sale();
        ArrayList<Item> items = sale.itensParser(itemsLineDTO);

        assertEquals(10, items.get(0).getId());

    }
	
	@Test
	public void getTotalSellValueTest() {
		ParserLineDTO line = new ParserLineDTO("003ç10ç[1-10-100,2-30-2.50,3-40-3.10]çPedro");
		Sale sale = new Sale(line);
		double totalSellValue = sale.getTotalSellValue();
		assertEquals(totalSellValue, 1199, 0);
	}

}
