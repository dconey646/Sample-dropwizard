package com.kainos.librarysystem.database;

public class Book {
	
	private int bookID;
	private String bookTitle;
	private String author;
	private int year;
	private String category;
	
	public Book(int bookID, String bookTitle, String author, int year, String category){
		this.bookID= bookID;
		this.bookTitle = bookTitle;
		this.setAuthor(author);
		this.setYear(year);
		this.setCategory(category);
	}
	
	public int getBookID(){
		return bookID;
	}
	
	public void setBookID(int newBookID){
		this.bookID = newBookID;
	}
	
	public String getBookTitle(){
		return bookTitle;
	}
	
	public void setBookTitle(String newBookTitle){
		this.bookTitle = newBookTitle;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	
	
	}