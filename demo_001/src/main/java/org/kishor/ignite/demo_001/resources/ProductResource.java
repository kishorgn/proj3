package org.kishor.ignite.demo_001.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.glassfish.hk2.api.UseProxy;

@Path("/products")
public class ProductResource {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getMessages(){
		return "Products, Hello World!!!";
	}

}
