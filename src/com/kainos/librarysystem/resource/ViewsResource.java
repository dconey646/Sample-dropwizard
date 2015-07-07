package com.kainos.librarysystem.resource;

import io.dropwizard.views.View;

import java.sql.SQLException;
import java.util.List;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.codahale.metrics.annotation.Timed;
import com.kainos.librarysystem.DecideSearchType;
import com.kainos.librarysystem.database.Book;
import com.kainos.librarysystem.database.Query;
import com.kainos.librarysystem.views.ShowBookDetailsView;
import com.kainos.librarysystem.views.ShowBooksView;

@Path("/")
public class ViewsResource {
	
	Query q;
	
	private final String template;
	private final String defaultName;
	
	public ViewsResource(String template, String defaultName) throws SQLException {
		this.template = template;
		this.defaultName = defaultName;
		q = new Query();
	}
		
	/**
	 * Will call the method to decide which
	 * type of search query to use
	 * @param searchString
	 * @param searchType
	 * @return
	 */
	@POST
	@Timed
	@Path("/search-books")
	@Produces(MediaType.TEXT_HTML)

	public View bookList(@FormParam("SearchString") String searchString,
			@FormParam("SearchType") String searchType) throws SQLException {
		//call query tpye method
		List<Book> list = DecideSearchType.CallQuery(searchString, searchType);
		return new ShowBooksView(list);
	}
	
	@GET
	@Timed
	@Path("/viewBooks")
	@Produces(MediaType.TEXT_HTML)
	public View viewBooks() throws SQLException {
		List<Book> booksList = q.getAllBooks();
		return new ShowBooksView(booksList);
	}
	
	@GET
	@Timed
	@Path("/viewBookDetails/{id}")
	@Produces(MediaType.TEXT_HTML)
	public View viewBookDetails(@PathParam("id")String id) throws SQLException {
		Book book = q.getBookDetails(id);
		return new ShowBookDetailsView(book);
	}

	@POST
	@Timed
	@Path("/borrow/{id}")
	@Produces(MediaType.TEXT_HTML)
	public View borrowBook(@PathParam("id")String id, @FormParam("username")String username) throws SQLException {
		Book book = q.borrowBook(id, username);
		return new ShowBookDetailsView(book);
	}
}
