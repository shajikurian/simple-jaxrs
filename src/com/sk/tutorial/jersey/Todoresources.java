package com.sk.tutorial.jersey;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.sk.tutorial.jersey.model.Todo;

@Path("/todo")
public class Todoresources {
	@GET
    @Produces( { MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
    public Todo getXML() {
        Todo todo = createTodo();
        return todo;
    }


    // This can be used to test the integration with the browser
    @GET
    @Produces( { MediaType.TEXT_XML })
    public Todo getHTML() {
        Todo todo = createTodo();
        return todo;
    }
    private Todo createTodo() {
    	Todo todo = new Todo();
    	todo.setSummary("This is my first todo");
    	todo.setDescription("This is my first todo");
    	return todo;
    }
}
