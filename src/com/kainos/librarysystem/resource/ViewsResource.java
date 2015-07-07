package com.kainos.librarysystem.resource;

import io.dropwizard.views.View;

import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.codahale.metrics.annotation.Timed;
import com.kainos.librarysystem.database.Book;
import com.kainos.librarysystem.database.Query;
import com.kainos.librarysystem.views.ShowBooksView;
// import com.kainos.librarysystem.DecideSearchType;

@Path("/")
public class ViewsResource {
	
	Query q;
	
	private final String template;
	private final String defaultName;
	
	public ViewsResource(String template, String defaultName){
		this.template = template;
		this.defaultName = defaultName;
		q = new Query();
	}
	
	
//	
//	@POST
//	@Timed
//	@Path("/search_books")
//	@Produces(MediaType.TEXT_HTML)
//	public View sayHello(){
//		List<Book> booksList = q.getAllBooks();
//		return new ShowBooksView(booksList);
	/**
	 * Will call the method to decide which
	 * type of search query to use
	 * @param searchString
	 * @param searchType
	 * @return
	 */
//	public View bookList(@FormParam("SearchString") String searchString,
//			@FormParam("SearchType") String searchType) {
//		//call query tpye method
//		List<Book> list = DecideSearchType.CallQuery(searchString, searchType);
//		return new ShowBooksView(list);
//	}
	
	@GET
	@Timed
	@Path("/viewBooks")
	@Produces(MediaType.TEXT_HTML)
	public View viewBooks() throws SQLException {
		List<Book> booksList = q.getAllBooks();
		return new ShowBooksView(booksList);
	}

}
