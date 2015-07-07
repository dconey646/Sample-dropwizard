package com.kainos.librarysystem.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Query {
	
	private static Connection conn;
	private Statement statement;
	private PreparedStatement pStatement;
	
	
	public Query() throws SQLException
	{
		conn = Connector.getConnection();
		statement = conn.createStatement();
	}
	
	public List<Book> getAllBooks() throws SQLException
	{
		ResultSet r;
		ArrayList<Book> books = new ArrayList<Book>();
		
		try{
			r = statement.executeQuery("select * from Book;");
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
		} catch(SQLException e) {
			e.printStackTrace();
			// throw e;
		}
		return books;
	}
	
	public List<Book> searchByTitle(String searchString) {
		String titleSQL = "SELECT * " +
						  "FROM Book WHERE title LIKE ?;";
		return this.performQuery(titleSQL, searchString);
	}
	
	public List<Book> searchByAuthor(String searchString) {
		String authorSQL = "SELECT * " +
						  "FROM Book WHERE author LIKE ?;";
		return this.performQuery(authorSQL, searchString);
	}
	
	public List<Book> searchByCategory(String searchString) {
		String categorySQL = "SELECT * " +
						  "FROM Book WHERE category LIKE ?;";
		return this.performQuery(categorySQL, searchString);
	}
	
	public List<Book> performQuery(String query, String searchString) {		
		ResultSet results;
		
		try {
			pStatement = conn.prepareStatement(query);
			pStatement.setString(1, "%" + searchString + "%");
			results = pStatement.executeQuery();
			return this.generateBookList(results);
		} catch (SQLException e) {
			System.err.println("Error performing SQL query: " + e.getMessage());
		}
		return null;
	}
	
	public ArrayList<Book> generateBookList(ResultSet results) {
		ArrayList<Book> books = new ArrayList<Book>();
		try {
			while(results.next())
			{
				books.add(new Book(results.getInt(1), results.getString(2),
						           results.getString(3), results.getString(4),
						           results.getString(5), results.getBoolean(6)));
			}
		} catch (SQLException e) {
			System.err.println("Failed creating book list: " + e.getMessage());
		}
		return books;
	}

	public Book getBookDetails(String id) throws SQLException{
		
		ResultSet r = statement.executeQuery("select * from Book where id = " +id+ ";");
		r.next();
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
