package com.orangeandbronze.webdev.service;

import java.util.*;

public class ProductCatalogService {

	/**
	 * Returns a table of products as a list of list of Strings. First list is
	 * the column names.
	 **/
	public List<List<String>> listProducts() {
		List<String> headers = new ArrayList<>();
		headers.add("SKU#");
		headers.add("Name");
		headers.add("Descripton");
		List<String> prod1 = new ArrayList<>();
		prod1.add("1234");
		prod1.add("Water Filter");
		prod1.add("Water Fresh brand, 2-stage water filter.");
		List<String> prod2 = new ArrayList<>();
		prod2.add("5678");
		prod2.add("Printer");
		prod2.add("HP brand, LaserJet, black");
		List<String> prod3 = new ArrayList<>();
		prod3.add("9876");
		prod3.add("Stapler");
		prod3.add("KW Trio brand, large, green");
		List<List<String>> productList = new ArrayList<>();
		productList.add(headers);
		productList.add(prod1);
		productList.add(prod2);
		productList.add(prod3);
		return productList;
	}

}
