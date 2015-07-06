package com.kainos.librarysystem.resource;

import io.dropwizard.views.View;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.codahale.metrics.annotation.Timed;
import com.kainos.librarysystem.database.Book;
import com.kainos.librarysystem.database.Query;
import com.kainos.librarysystem.views.ShowBooksView;

@Path("/hello-world")
public class ViewsResource {
	
	Query q;
	
	private final String template;
	private final String defaultName;
	
	public ViewsResource(String template, String defaultName){
		this.template = template;
		this.defaultName = defaultName;
		q = new Query();
	}
	
	@GET
	@Timed
	@Path("/hello")
	@Produces(MediaType.TEXT_HTML)
	public View sayHello(){
		List<Book> booksList = q.getAllBooks();
		return new ShowBooksView(booksList);
	}
	

}
