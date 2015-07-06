package com.kainos.librarysystem.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Connector {
	
	private static final String username = "libraryUser";
	private static final String password = "MySuperSafePassw0rd!";
	private static final String connection = "jdbc:mysql://localhost/Library";
	

	public static Statement getConnection() {
		
		try{
			Class driver = Class.forName("com.mysql.jdbc.Driver");			
		}catch(ClassNotFoundException e1){
			e1.printStackTrace();
		}
		
		try{
			Connection c = ((Connection) DriverManager.getConnection(connection, username, password));
			return c.createStatement();
		} catch(SQLException s){
			System.out.println("Username and/or password not recognised");
		}
		return null;
	}

}
