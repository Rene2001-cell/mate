package com.sv.matematica.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class database {
	private static final String DB_DRIVER = "com.mysql.jdbc.Driver";
	private static final String DB_CONNECTION = "jdbc:mysql://localhost:3306/login";
	private static final String DB_USER = "root";
	private static final String DB_PASSWORD =null;
	private static Connection dbConnection = null;
	
	
	 public static Connection getDBConnection() {
		 try {
			 Class.forName(DB_DRIVER);
			
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
		 
		 try {
			dbConnection=DriverManager.getConnection(DB_CONNECTION, DB_USER, DB_PASSWORD);
		System.out.println("conexion exitosa");
		 } catch (SQLException e) {
			 System.out.println(e.getMessage());
		 }
		 
		 return dbConnection;	 
		 
	 }
	 public static void main(String[] args) {
			database data=new database();
			data.getDBConnection();
}}
