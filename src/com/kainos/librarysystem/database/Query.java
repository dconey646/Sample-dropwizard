package com.kainos.librarysystem.database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Query {
	
	public Statement s;
	public final String DATABASE_NAME = "Library";
	
	
	public Query()
	{
		s = Connector.getConnection();
	}
	
	public ArrayList<Book> getAllBooks()
	{
		ResultSet r;
		ArrayList<Book> books = new ArrayList<Book>();
		
		try{
			r = s.executeQuery("");
			while(r.next())
			{
				// TODO: Create new book and add it to list
			}
		}catch(SQLException e){
			//TODO: Handle Exception
		}
		return books;
	}

}
