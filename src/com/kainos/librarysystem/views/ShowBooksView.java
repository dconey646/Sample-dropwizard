package com.kainos.librarysystem.views;

import io.dropwizard.views.View;
import java.util.List;
import com.kainos.librarysystem.database.Book;

public class ShowBooksView extends View{
	
	private List<Book> books;
	
	public ShowBooksView(List<Book> booksList) {
		super("/bookList.ftl");
		setBooks(booksList);
	}

	public List<Book> getBooks()
	{
		return books;
	}
	
	public void setBooks(List<Book> books)
	{
		this.books = books;
	}
}
