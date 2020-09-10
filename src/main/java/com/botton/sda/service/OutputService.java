package com.botton.sda.service;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import com.botton.sda.util.CustomResources;

public class OutputService {
	
	private AnalysisModule am;

	public OutputService(AnalysisModule am) {
		this.am = am;
	}
	
	public void generateOutputFile() throws IOException {
		FileWriter fileWriter = new FileWriter(CustomResources.OUT_FOLDER+System.currentTimeMillis()+"out.txt");
	    PrintWriter printWriter = new PrintWriter(fileWriter);
	    printWriter.println("Customers Quantity: " + am.getCustomerQuantity());
	    printWriter.println("Sellers Quantity: " + am.getSellerQuantity());
	    printWriter.println("Worst Seller: " + am.getWorstSeller());
	    printWriter.println("Most Expensive Sale ID: " + am.getMostExpensiveSellId());
	    printWriter.close();
	}

}
