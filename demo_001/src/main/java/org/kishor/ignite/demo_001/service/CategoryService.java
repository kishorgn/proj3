package org.kishor.ignite.demo_001.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.jdt.internal.compiler.util.Messages;
import org.kishor.ignite.demo_001.Database;
import org.kishor.ignite.demo_001.model.Category;

public class CategoryService {
	
	// List<Category> categories = new ArrayList<>();
	private Map<Integer, Category> categories = Database.getCategories(); 
	
	public CategoryService(){
		categories.put(1,new Category(1,"Cat1","Loc1"));
		categories.put(2,new Category(2,"Cat2","Loc2"));
		
	}
	
	public List<Category> getAllCategories(){
		return new ArrayList(categories.values());
	}
	
	public Category addCategory(Category category){
		category.setId(categories.size()+1);
		categories.put(category.getId(), category);
		return category;
	}
	
	public Category getCategory(int id){
		return categories.get(id);
	}
	
	public Category updateCategory(Category category){
		if(category.getId()<= 0 ){
			return null;
		}
		categories.put(category.getId(), category);
		return category;
	}
	
	public Category removeCategory(int id){
		return categories.remove(id);
	}

}
