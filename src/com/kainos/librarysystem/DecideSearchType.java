package com.kainos.librarysystem;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.kainos.librarysystem.database.Book;
import com.kainos.librarysystem.database.Query;

/**
 * 
 * @author evanc
 *Contains method to decide type of feild searched by user
 */
public class DecideSearchType {
	
	public static Query query;
	/**
	 * Will go through a switch statement and 
	 * call the method with the corresponding correct type of query
	 * and pass it the string
	 * @param userSearch
	 * @return 
	 */
	public static List<Book> CallQuery(String userSearch, String typeOfSearch) throws SQLException {
		List<Book> list = new ArrayList<Book>();
		query = new Query();
		
		//Switch to decide type of search
		switch (typeOfSearch){
			case "Title" : 
				list = query.searchByTitle(userSearch);
				break;

			case "Category" :
				list = query.searchByCategory(userSearch);
				break;

			case "Author" :
				list = query.searchByAuthor(userSearch);
				break;
			default: 
				break;
		}
		
		return list;
		
	}

}
