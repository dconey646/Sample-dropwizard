package com.kainos.librarysystem.database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.kainos.librarysystem.database.Book;
import com.kainos.librarysystem.database.Connector;

public class Query {
	
	public Statement s;
	public final String DATABASE_NAME = "Library";
	
	
	public Query()
	{
		s = Connector.getConnection();
	}
	
	public List<Book> getAllBooks() throws SQLException
	{
		ResultSet r;
		ArrayList<Book> books = new ArrayList<Book>();
		
		try{
			r = s.executeQuery("select * from Book;");
			while(r.next())
			{	
				Book book = new Book();	
				book.setBookID(r.getInt(1));
				book.setBookTitle(r.getString(2));
				book.setAuthor(r.getString(3));
				book.setYear(Integer.toString(r.getInt(4)));
				book.setCategory(r.getString(5));
				
				if(r.getInt(6) == 1) {
					book.setAvailable(true);
				} else {
					book.setAvailable(false);
				}
				
				books.add(book);
			}
		}catch(SQLException e){
			throw e;
		}
		return books;
	}

	public Book getBookDetails(int id) throws SQLException{
		ResultSet r = s.executeQuery("select * from Book where id = " +id+ ";");
		Book book = new Book();	
		book.setBookID(r.getInt(1));
		book.setBookTitle(r.getString(2));
		book.setAuthor(r.getString(3));
		book.setYear(Integer.toString(r.getInt(4)));
		book.setCategory(r.getString(5));
		
		if(r.getInt(6) == 1) {
			book.setAvailable(true);
		} else {
			book.setAvailable(false);
		}
		return book;
	}

}
