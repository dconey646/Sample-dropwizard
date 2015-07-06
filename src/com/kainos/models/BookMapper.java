package com.kainos.models;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookMapper
{
	private static final String ID_FIELD = "id";
	private static final String TITLE_FIELD = "title";
	private static final String AUTHOR_FIELD = "author";
	private static final String AVAILABLE_FIELD = "isAvailable";
	private static final String CATEGORY_FIELD = "category";
	
	// Takes a result set and converts it to a list of Book objects
	public static List<Book> mapBooks(ResultSet results)
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
				currentBook.setIsOnLoan(results.getBoolean(AVAILABLE_FIELD));
				currentBook.setCategory(results.getString(CATEGORY_FIELD));
				
				books.add(currentBook);
			}
		} catch(SQLException ex)
		{
			System.out.println(ex.getMessage());
		}
		
		return books;
	}
}
