package com.mkyong.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/json/product")
public class JSONService {
	int i = 0;

	@GET
	@Path("/get")
	@Produces("application/json")
	public Product getProductInJSON() throws InterruptedException {
		i++;
		Product product = new Product();
		product.setName("iPad 3");
		product.setQty(999 + i);
		Thread thread = new Thread();
		thread.wait();
		thread.notify();
		return product;

	}

	@POST
	@Path("/post")
	@Consumes("application/json")
	public Response createProductInJSON(Product product) {
		i++;
		int j = 0;
		j++;
		String result = "Product created : " + product + "i=" + i + "j=" + j;
		return Response.status(201).entity(result).build();

	}
}