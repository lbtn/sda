package com.botton.sda.service;

import java.util.Set;

import com.botton.sda.entity.Sale;

//do calculations work to build a analysis output
public class AnalysisModule {
	
	private int sellerQuantity;
	private int customerQuantity;
	private Set<Sale> sales;

	public AnalysisModule(int sellerQuantity, int customerQuantity, Set<Sale> sales) {
		this.sellerQuantity = sellerQuantity;
		this.customerQuantity = customerQuantity;
		this.sales = sales;
	}

	public int getSellerQuantity() {
		return sellerQuantity;
	}

	public int getCustomerQuantity() {
		return customerQuantity;
	}

	public String getMostExpensiveSellId() {
		String mostExpensiveSaleId = "";
		double mostExpensiveValue = 0;
		for (Sale sale : sales) {
			if(mostExpensiveValue < sale.getTotalSellValue()) {
				mostExpensiveValue = sale.getTotalSellValue();
				mostExpensiveSaleId = sale.getSaleId();
			}
		}
		return mostExpensiveSaleId;
	}
	
	public String getWorstSeller() {
		double lessExpensiveValue = 0;
		String worstSeller = "";
		for (Sale sale : sales) {
			if(lessExpensiveValue > sale.getTotalSellValue() || lessExpensiveValue == 0) {
				lessExpensiveValue = sale.getTotalSellValue();
				worstSeller = sale.getSalesmanName();
			}
		}
		return worstSeller;
	}
}
