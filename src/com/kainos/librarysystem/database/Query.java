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
	
	public List<Book> getAllBooks()
	{
		ResultSet r;
		ArrayList<Book> books = new ArrayList<Book>();
		
		try{
			r = s.executeQuery("select * from Book;");
			while(r.next())
			{
				books.add(new Book(r.getInt(1), r.getString(2), r.getString(3), r.getInt(4), r.getString(5)));
			}
		}catch(SQLException e){
			e.getStackTrace();
			//TODO: Handle Exception better
		}
		return books;
	}

}
