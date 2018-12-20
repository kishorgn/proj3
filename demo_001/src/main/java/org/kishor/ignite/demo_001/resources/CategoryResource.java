package org.kishor.ignite.demo_001.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.kishor.ignite.demo_001.model.Category;
import org.kishor.ignite.demo_001.service.CategoryService;

@Path("/categories")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CategoryResource {
	
	CategoryService categoryService = new CategoryService();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Category> getCagetories(){
		return categoryService.getAllCategories();
	}
	
	@GET
	@Path("/{id}")
	public Category getCategory(@PathParam("id") int id){
		Category cat = categoryService.getCategory(id);
		return cat;
	}
	
	@POST
	public Category addCategory(Category category){
		return categoryService.addCategory(category);
	}
	
	@PUT
	@Path("/{id}")
	public Category updateCategory(@PathParam("id")int id,Category category){
		category.setId(id);
		return categoryService.updateCategory(category);
	}
	
	
	@DELETE
	@Path("/{id}")
	public Category updateCategory(@PathParam("id")int id){
		return categoryService.removeCategory(id);
	}
	
	
}
