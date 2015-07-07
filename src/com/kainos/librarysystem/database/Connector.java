package com.kainos.librarysystem.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connector {
	
	private static final String USERNAME = "libraryUser";
	private static final String PASSWORD = "MySuperSafePassw0rd!";
	private static final String CONNECTION = "jdbc:mysql://localhost/Library";
	

	public static Connection getConnection() {
		
		try{
			Class driver = Class.forName("com.mysql.jdbc.Driver");			
		}catch(ClassNotFoundException e1){
			e1.printStackTrace();
		}
		
		try{
			Connection c = ((Connection) DriverManager.getConnection(CONNECTION, USERNAME, PASSWORD));
			return c;
		} catch(SQLException s){
			System.out.println("Username and/or password not recognised");
		}
		return null;
	}

}
