package com.kainos.librarysystem.views;

import io.dropwizard.views.View;

import java.util.List;

import com.kainos.librarysystem.database.Book;

public class ShowBooksView extends View{
	
	public List<Book> books;
	
	public ShowBooksView(List<Book> books){
		super("/bookList.ftl");
		setBooks(books);
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
