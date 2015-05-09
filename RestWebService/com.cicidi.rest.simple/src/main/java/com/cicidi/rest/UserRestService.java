package com.cicidi.rest;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.xml.bind.JAXBException;

import com.cicidi.rest.model.AbstractBookmark;
import com.cicidi.rest.model.BookmarkRef;
import com.cicidi.rest.model.Bookmarks;
import com.cicidi.rest.model.interprator.XmlReader;

@Path("/users")
public class UserRestService {

	// @Resource
	// ServletContext servletContext;

	@GET
	public Response getUser() {

		return Response.status(200).entity("getUser is called").build();

	}

	@GET
	@Path("/vip")
	public Response getUserVIP() {

		return Response.status(200).entity("getUserVIP is called").build();

	}

	@GET
	@Path("{name}")
	public Response getUserByName(@PathParam("name") String name) {

		return Response.status(200)
				.entity("getUserByName is called, name : " + name).build();

	}

	@GET
	@Path("{id : \\d+}")
	public Response getUserById(@PathParam("id") String id) {

		return Response.status(200).entity("getUserById is called, id : " + id)
				.build();

	}

	@GET
	@Path("/username/{username : [a-zA-Z][a-zA-Z_0-9]}")
	public Response getUserByUserName(@PathParam("username") String username) {

		return Response.status(200)
				.entity("getUserByUserName is called, username : " + username)
				.build();

	}

	@GET
	@Path("/books/{isbn : \\d+}")
	public Response getUserBookByISBN(@PathParam("isbn") String isbn) {

		return Response.status(200)
				.entity("getUserBookByISBN is called, isbn : " + isbn).build();

	}

	@GET
	@Path("/username/bookmarks")
	@Produces(MediaType.APPLICATION_ATOM_XML)
	public AbstractBookmark getAllUserBookmarks(@Context ServletContext ctx) {
		AbstractBookmark intance = null;
		String path = ctx.getRealPath("/WEB-INF/xml/");
		try {
			intance = XmlReader.unmarshall("bookmarks", path);
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// return Response.status(200)
		// .entity("getUserBookByISBN is called, isbn : ").build();
		return intance;
	}

	@GET
	@Path("/username/bookmark/{id}")
	@Produces(MediaType.APPLICATION_ATOM_XML)
	public AbstractBookmark getAllUserBookmarks(@Context ServletContext ctx,
			@PathParam("id") String id) {
		AbstractBookmark instance = null;
		String path = ctx.getRealPath("/WEB-INF/xml/");
		try {
			instance = XmlReader.unmarshall("bookmarks", path);
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// return Response.status(200)
		// .entity("getUserBookByISBN is called, isbn : ").build();
		List<BookmarkRef> bookMarkList = ((Bookmarks) instance).getBookmark();
		for (BookmarkRef ref : bookMarkList) {
			ref.getHref();
		}

		return instance;
	}
}