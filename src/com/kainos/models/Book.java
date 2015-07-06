package com.kainos.models;

import java.util.Date;

public class Book
{
	private int ID;
	private String title;
	private String author;
	private Date publishDate;
	private Boolean isOnLoan;
	
	public Boolean getIsOnLoan() {
		return isOnLoan;
	}

	public void setIsOnLoan(Boolean isOnLoan) {
		this.isOnLoan = isOnLoan;
	}

	public Book()
	{ }
	
	public Book(int ID, String title, String author, Date publishDate)
	{
		this.ID = ID;
		this.title = title;
		this.author = author;
		this.publishDate = publishDate;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Date getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}
}
