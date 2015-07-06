package com.kainos.librarysystem;
/**
 * 
 * @author evanc
 *Contains method to decide type of feild searched by user
 */
public class DecideSearchType {
	/**
	 * Will go through a switch statement and 
	 * call the method with the corresponding correct type of query
	 * and pass it the string
	 * @param userSearch
	 */
	public static void CallQuery(String userSearch, String typeOfSearch){
		//Switch to decide type of search
		switch (typeOfSearch){
			case "Title" : 
				DatabaseConnectionAndQueries.searchByTitle(String userSearch);
				break;

			
			case "Author": 
				DatabaseConnectionAndQueries.searchByTitle(String userSearch);
				break;
			
			
			case "Category" :
				
				DatabaseConnectionAndQueries.searchByTitle(String userSearch);
				break;
			default: 
				
				break;
				
			
		}
		
	}

}
