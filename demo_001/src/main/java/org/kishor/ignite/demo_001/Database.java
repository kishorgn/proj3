package org.kishor.ignite.demo_001;

import java.util.HashMap;
import java.util.Map;

import org.kishor.ignite.demo_001.model.Category;
import org.kishor.ignite.demo_001.model.Product;

public class Database {
	
	private static Map<Integer, Category> categories = new HashMap<Integer, Category>();
	private static Map<Integer, Product> products = new HashMap<Integer, Product>();
	
	public static Map<Integer, Category> getCategories(){
		return categories;
	}
	
	public static Map<Integer, Product> getProducts(){
		return products;
	}

}
