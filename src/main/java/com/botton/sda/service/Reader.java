package com.botton.sda.service;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.WatchEvent;
import java.util.HashSet;
import java.util.Set;

import com.botton.sda.entity.Customer;
import com.botton.sda.entity.ParserLineDTO;
import com.botton.sda.entity.Sale;
import com.botton.sda.entity.Seller;
import com.botton.sda.util.CustomResources;

public class Reader {
	
	private Set<Seller> sellers = new HashSet<Seller>();
	
	private Set<Customer> customers = new HashSet<Customer>();
	
	private Set<Sale> sales = new HashSet<Sale>();

	
	public void extractLine(WatchEvent<?> event, Parser parser, EntityFactory ef) throws IOException {
		BufferedReader reader = new BufferedReader(
				new InputStreamReader(new FileInputStream(CustomResources.IN_FOLDER + event.context()), "UTF-8"));
		
		String currentLine = reader.readLine();
		
		while ((currentLine = reader.readLine()) != null) {
			ParserLineDTO p = parser.parseLine(currentLine, ef);
			
			if(p instanceof Seller) {
				sellers.add((Seller) p);
			}
			
			if(p instanceof Customer) {
				customers.add((Customer) p);
			}
			
			if(p instanceof Sale) {
				sales.add((Sale) p);
			}
			
		}
		reader.close();
		
		//data extraction done
		
		AnalysisModule am = new AnalysisModule(sellers.size(),customers.size(),sales);
		OutputService outputService = new OutputService(am);
		outputService.generateOutputFile();

	}

}
