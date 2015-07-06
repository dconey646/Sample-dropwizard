package com.kainos.models;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookMapper
{
	private final String ID_FIELD = "id";
	private final String TITLE_FIELD = "title";
	private final String AUTHOR_FIELD = "author";
	private final String ON_LOAN_FIELD = "on_loan";
	
	// Takes a result set and converts it to a list of Book objects
	public List<Book> mapBooks(ResultSet results)
	{
		List<Book> books = new ArrayList<Book>();
		Book currentBook;
		
		try
		{
			while(results.next())
			{
				currentBook = new Book();
				currentBook.setID(results.getInt(ID_FIELD));
				currentBook.setTitle(results.getString(TITLE_FIELD));
				currentBook.setAuthor(results.getString(AUTHOR_FIELD));
				currentBook.setIsOnLoan(results.getBoolean(ON_LOAN_FIELD));
				
				books.add(currentBook);
			}
		} catch(SQLException ex)
		{
			System.out.println(ex.getMessage());
		}
		
		return books;
	}
}
