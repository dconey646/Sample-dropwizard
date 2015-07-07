package com.kainos.librarysystem.views;

import io.dropwizard.views.View;

import com.kainos.librarysystem.database.Book;

public class ShowBookDetailsView extends View {

	private Book book;
	
	public ShowBookDetailsView(Book book) {
		super("/bookDetails.ftl");
		setBook(book);
	}

	public Book getBook()
	{
		return book;
	}
	
	public void setBook(Book book)
	{
		this.book = book;
	}

}
