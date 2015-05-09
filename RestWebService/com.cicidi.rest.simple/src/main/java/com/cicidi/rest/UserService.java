package com.cicidi.rest;

import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/usersService")
public class UserService {

	@GET
	@Path("/get")
	public Response addUser(@HeaderParam("Content-Length") int length,
			@HeaderParam("user-agent") String userAgent) {

		return Response
				.status(200)
				.entity("addUser is called, userAgent : " + userAgent
						+ "length" + length + length + length + length).build();

	}

}