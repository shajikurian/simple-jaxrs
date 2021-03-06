/**
 * 
 */
package com.sk.tutorial.jersey;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * @author Shaji
 *
 */
@Path("/hello")
public class Hello {
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String sayPlainHello() {
		return "Hello Shaji";
	}
	
	@GET
	@Produces(MediaType.TEXT_XML)
	public String sayXmlHello() {
		return "<?xml version=\"1.0\"?> <hello> Hello Shaji</hello>";
	}
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String sayHtmlHello() {
		return "<html> " + "<title>" + "Hello Shaji" + "</title>"
        + "<body><h1>" + "Hello Jersey" + "</body></h1>" + "</html>";
	}
}
