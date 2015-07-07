//package com.kainos.librarysystem;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import com.kainos.librarysystem.database.Book;
//
///**
// * 
// * @author evanc
// *Contains method to decide type of feild searched by user
// */
//public class DecideSearchType {
//	/**
//	 * Will go through a switch statement and 
//	 * call the method with the corresponding correct type of query
//	 * and pass it the string
//	 * @param userSearch
//	 */
//	public static void CallQuery(String userSearch, String typeOfSearch){
//		List<Book> list = new ArrayList<Book>();
//		
//		//Switch to decide type of search
//		switch (typeOfSearch){
//			case "Title" : 
//				list = DatabaseConnectionAndQueries.searchByTitle(String userSearch);
//				break;
//
//			case "Author": 
//				list = DatabaseConnectionAndQueries.searchByTitle(String userSearch);
//				break;
//
//			case "Category" :
//				list = DatabaseConnectionAndQueries.searchByTitle(String userSearch);
//				break;
//			default: 
//				break;
//		}
//		
//		return list;
//		
//	}
//
//}
