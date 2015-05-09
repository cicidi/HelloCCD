package com.cicidi.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

@Path("/search")
public class BookMarkRest {
	@GET
	@Path("{username}/{bookid}")
	public Response getBookMark(@PathParam("username") String userName,
			@PathParam("bookid") String bookid) {
		// String arg = info.getQueryParameters().getFirst("arg");
		return Response.status(200)
				.entity("username= " + userName + "bookname= " + bookid)
				.build();
	}

	@GET
	@Path("{username}/bookmark")
	public Response getBookMarklist(@PathParam("username") String userName,
			@Context UriInfo info) {
		String bookList;
		if (info.getQueryParameters().getFirst("bookList") != null) {
			bookList = info.getQueryParameters().getFirst("bookList");
		} else
			bookList = "EMPTY";
		return Response.status(200)
				.entity("Get user:" + userName + "Booklist= " + bookList)
				.build();
	}
}
