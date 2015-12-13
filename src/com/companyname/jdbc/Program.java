package com.companyname.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;

import com.companyname.jdbc.beans.Movie;

public class Program {


	public static void main(String[] args){
		
		try {
			Connection connection = DBConfig.getConnection();
			System.out.println("Database is connected....");
		} catch (SQLException exception) {
			DBConfig.displayException(exception);
		}
		

		
		
	} 

}











