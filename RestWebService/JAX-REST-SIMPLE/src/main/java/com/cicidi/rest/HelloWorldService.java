package com.cicidi.rest;
 
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
 /*
  * To access example first make sure you have setup user password in tomcat-user.xml
  * Then go to this link http://localhost:8080/RESTfulExample/cicidi/hello/1
  * */
@Path("/hello")
public class HelloWorldService {
 
	@GET
	@Path("/{value}")
	public Response getMsg(@PathParam("value") String name) {
 
		String output = "Jersey say : " + name;
 
		return Response.status(200).entity(output).build();
 
	}
	@GET
  	@Produces(MediaType.TEXT_HTML)
  	public String sayHtmlHello() {
    return "<html> " + "<title>" + "Hello Jersey" + "</title>"
        + "<body><h1>" + "Hello Jersey" + "</body></h1>" + "</html> ";
  }
 
}